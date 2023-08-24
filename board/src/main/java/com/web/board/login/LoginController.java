package com.web.board.login;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.board.member.entity.Member;
import com.web.board.security.auth.MemberPrincipalDetails;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private boolean isAuthenticated() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || AnonymousAuthenticationToken.class.
                isAssignableFrom(authentication.getClass())) {
            return false;
        }
        return authentication.isAuthenticated();
    }

    // http://localhost:5050/member/login/loginForm
    @GetMapping("/member/login/loginForm")
    public String login(HttpServletRequest request,@RequestParam(value="logout", defaultValue = "0") int outFlag,
                        @AuthenticationPrincipal MemberPrincipalDetails memberPrincipalDetails) {
        HttpSession session = request.getSession();
        String msg = (String) session.getAttribute("loginErrorMessage");
        session.setAttribute("loginErrorMessage", msg != null ? msg : "");
        System.out.println("메시지:"+msg);
        System.out.println("로그인여부:"+isAuthenticated());

        if(outFlag==1) {
        	session.removeAttribute("member");
        }
        if(isAuthenticated()) {
            if(memberPrincipalDetails == null) {
            	System.out.println("#로그아웃 처리#");
            	
                return "redirect:/member/login/logout";
            }
            return "redirect:/board/boardList";
            //return "main/main";
        }

        return "a02_login";
    }

    @GetMapping("/member/main")
    public String main() {
        return "main/main";
    }

    @GetMapping("/member/text")
    public String text(@AuthenticationPrincipal MemberPrincipalDetails memberPrincipalDetails
                        ,Model model) {

        Member member = memberPrincipalDetails.getMember();

        model.addAttribute("member", member);
        return "text/text";
    }
}
