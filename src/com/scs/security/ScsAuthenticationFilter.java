package com.scs.security;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

@Service
public class ScsAuthenticationFilter implements AuthenticationSuccessHandler{
	protected Log logger = LogFactory.getLog(this.getClass());

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication auth) throws IOException,
			ServletException {
		Set<String> roles = AuthorityUtils.authorityListToSet(auth.getAuthorities());
		auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
	    //long ts=System.currentTimeMillis();
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		Date date = new Date();
		//System.out.println(dateFormat.format(date)); 
		
		request.getSession().setAttribute("LoginTime", dateFormat.format(date).toString());
		
		request.getSession().setAttribute("AUTH_USER", name);
		
		logger.info("Logged In user name is:"+name);
       
        if(roles.contains("ROLE_MASTER")){
            response.sendRedirect("master/main.action");
        }
        if(roles.contains("ROLE_ADMIN")){
            response.sendRedirect("admin/main.action");
         }
        if(roles.contains("ROLE_DOCTOR")){
            response.sendRedirect("doctor/main.action");
         }
        if(roles.contains("ROLE_PHARMACY")){
            response.sendRedirect("pharmacy/main.action");
         }
        if(roles.contains("ROLE_RECEPTION")){
            response.sendRedirect("reception/main.action");
         }
        if(roles.contains("ROLE_PUBLIC")){
            response.sendRedirect("public/main.action");
         }
       
       
	    }

	
	
}
