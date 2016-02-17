package com.scs.security;

import java.io.IOException;
import java.util.Collection;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


public class ScsAuthenticationFilter implements AuthenticationSuccessHandler{
	//protected Log logger = LogFactory.getLog(this.getClass());

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication auth) throws IOException,
			ServletException {
		Set<String> roles = AuthorityUtils.authorityListToSet(auth.getAuthorities());
		auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		request.getSession().setAttribute("AUTH_USER", name);
       
        if(roles.contains("ROLE_MASTER")){
            response.sendRedirect("master/main");
        }
        if(roles.contains("ROLE_ADMIN")){
            response.sendRedirect("admin/main");
         }
        if(roles.contains("ROLE_DOCTOR")){
            response.sendRedirect("doctor/main");
         }
        if(roles.contains("ROLE_PHARMACY")){
            response.sendRedirect("pharmacy/main");
         }
        if(roles.contains("ROLE_RECEPTION")){
            response.sendRedirect("reception/main");
         }
        if(roles.contains("ROLE_PUBLIC")){
            response.sendRedirect("public/main");
         }
       
       
	    }

	
	
}
