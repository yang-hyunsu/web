package com.web.board.security.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.web.board.member.entity.Member;
import com.web.board.security.auth.MemberPrincipalDetailService;
import com.web.board.security.auth.MemberPrincipalDetails;

@Component
// AuthenticationProvider 를 구현한 클래스
public class MemberAuthenticatorProvider implements AuthenticationProvider {

    @Autowired
    private MemberPrincipalDetailService memberPrincipalDetailService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName(); // 사용자가 입력한 id
        String password = (String) authentication.getCredentials(); // 사용자가 입력한 password
        System.out.println("사용자가 입력한 password:"+password);
        
        // 생성해둔 MemberPrincipalDetailService 에서 loadUserByUsername 메소드를 호출하여 사용자 정보를 가져온다.
        MemberPrincipalDetails memberPrincipalDetails = (MemberPrincipalDetails) memberPrincipalDetailService.loadUserByUsername(username);

        // ====================================== 비밀번호 비교 ======================================
        // 사용자가 입력한 password 와 DB 에 저장된 password 를 비교한다.

        // db 에 저장된 password
        String dbPassword = memberPrincipalDetails.getPassword();
        System.out.println("저장된 DB password:"+dbPassword);
        // 암호화 방식 (BCryptPasswordEncoder) 를 사용하여 비밀번호를 비교한다.
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println("해시코드:"+hashedPassword);
        System.out.println("# 비교 #");
        System.out.println("비교1:"+password.equals(dbPassword));
        System.out.println("비교2:"+passwordEncoder.matches(dbPassword,hashedPassword ));
        System.out.println();
        if(!passwordEncoder.matches(dbPassword, hashedPassword)) {
            System.out.println("[사용자] 비밀번호가 일치하지 않습니다.");
            throw new BadCredentialsException("[사용자] 아이디 또는 비밀번호가 일치하지 않습니다.");
        }
        // ========================================================================================

        // 사용자가 입력한 id 와 password 가 일치하면 인증이 성공한 것이다.
        // 인증이 성공하면 MemberPrincipalDetails 객체를 반환한다.
        Member member = memberPrincipalDetails.getMember();
        if (member == null || "N".equals(member.getIsUsed())) {
            System.out.println("[사용자] 사용할 수 없는 계정입니다.");
            throw new BadCredentialsException("[사용자] 사용할 수 없는 계정입니다.");
        }

        // 인증이 성공하면 UsernamePasswordAuthenticationToken 객체를 반환한다.
        // 해당 객체는 Authentication 객체로 추후 인증이 끝나고 SecurityContextHolder.getContext() 에 저장된다.
        System.out.println(memberPrincipalDetails.getAuthorities());
        System.out.println("사용자:"+memberPrincipalDetails.getUsername());
       // UsernamePasswordAuthenticationToken upt = 
        System.out.println("권한:"+new UsernamePasswordAuthenticationToken(memberPrincipalDetails, null, memberPrincipalDetails.getAuthorities()).getCredentials());
        return new UsernamePasswordAuthenticationToken(memberPrincipalDetails, null, memberPrincipalDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
