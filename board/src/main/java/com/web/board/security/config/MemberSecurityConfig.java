package com.web.board.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.web.board.security.auth.MemberPrincipalDetailService;
import com.web.board.security.provider.MemberAuthenticatorProvider;

@Configuration
@EnableWebSecurity
public class MemberSecurityConfig {
    /*
    * 중요
    * Spring Security 5.7.0 버전부터
    * WebSecurityConfigurerAdapter가 deprecated 되기 때문에
    * 이와 같은 방법으로 구현
    * */


    // 생성해둔 MemberAuthenticatorProvider를 주입받는다.
    // 해당 클래스로 MemberPrincipalDetailsService 내부 로직을 수행하며
    // 인증 처리도 같이 진행된다
    @Autowired
    MemberAuthenticatorProvider memberAuthenticatorProvider;

    // 로그인 기억하기 사용을 위해 MemberAuthenticatorProvider 내부
    // MemberPrincipalDetailsService 선언
    @Autowired
    MemberPrincipalDetailService memberPrincipalDetailService;


    // in memory 방식으로 인증 처리를 진행 하기 위해 기존엔 Override 하여 구현했지만
    // Spring Security 5.7.0 버전부터는 AuthenticationManagerBuilder를 직접 생성하여
    // AuthenticationManager를 생성해야 한다.
    @Autowired
    public void configure (AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(memberAuthenticatorProvider);
    }

    // 5.7.0 부터 Override 하지 않고
    // SecurityFilterChain을 직접 생성하여 구현
    // 그 외 authorizeRequests 가 deprecated 되었기 때문에
    // authorizeHttpRequests 로 변경
    @Bean
    public SecurityFilterChain memberSecurityFilterChain (HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeHttpRequests(authorize -> {
        	
            try {
                authorize
                .requestMatchers(new AntPathRequestMatcher("/css/**"), new AntPathRequestMatcher("/images/**"), 
                		new AntPathRequestMatcher("/js/**"), 
                		new AntPathRequestMatcher("/a00_com/**"), 
                		//new AntPathRequestMatcher("/member/login/**"),
                //		new AntPathRequestMatcher("/WEB-INF/views/login/**"),
                //		new AntPathRequestMatcher("/WEB-INF/views/main/**"),
                //		new AntPathRequestMatcher("/WEB-INF/views/text/**"),
                		new AntPathRequestMatcher("/WEB-INF/views/**")
                //		new AntPathRequestMatcher("/member/main/**"),
                //		new AntPathRequestMatcher("/board/**")
                //		new AntPathRequestMatcher("/member/text/**")//, 
                //		new AntPathRequestMatcher("/member/attachment/**"),new AntPathRequestMatcher( "/member/files/**")
                		)
                .permitAll() // 해당 경로는 인증 없이 접근 가능
                //.requestMatchers(new AntPathRequestMatcher("/member/**"),new AntPathRequestMatcher("/board/**")) // 해당 경로는 인증이 필요
                //.requestMatchers(new AntPathRequestMatcher("/board/**")) // 해당 경로는 인증이 필요
                .anyRequest()
                .authenticated() // 로그인되어 있으면 접근 가능
                //.hasAnyRole("USER", "ADMIN") // ROLE 이 USER, ADMIN 가 포함된 경우에만 인증 가능
                //.hasAnyRole("USER") // ROLE 이 USER, ADMIN 가 포함된 경우에만 인증 가능
            .and()
                .formLogin()
                .loginPage("/member/login/loginForm") // 로그인 페이지 설정
                .loginProcessingUrl("/member/login/login") // 로그인 처리 URL 설정
                .defaultSuccessUrl("/board/boardList") // 로그인 성공 후 이동할 페이지
                .successHandler(new MemberAuthSuccessHandler()) // 로그인 성공 후 처리할 핸들러
                .failureHandler(new MemberAuthFailureHandler()) // 로그인 실패 후 처리할 핸들러
                .permitAll()
            .and()
                .logout()
                .logoutUrl("/member/login/logout") // 로그아웃 처리 URL 설정
                .logoutSuccessUrl("/member/login/loginForm?logout=1") // 로그아웃 성공 후 이동할 페이지
                .deleteCookies("JSESSIONID"); // 로그아웃 후 쿠키 삭제
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        
        
        http.rememberMe()
                .key("yanghyunsu") // 인증 토큰 생성시 사용할 키
                .tokenValiditySeconds(60 * 60 * 24 * 7) // 인증 토큰 유효 시간 (초)
                .userDetailsService(memberPrincipalDetailService) // 인증 토큰 생성시 사용할 UserDetailsService
                .rememberMeParameter("remember-me"); // 로그인 페이지에서 사용할 파라미터 이름
		
        return http.build();
    }
}
