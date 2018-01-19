package io.barbatchov.docviewer.config;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("000");
        String requestURI = ((HttpServletRequest) req).getRequestURI();

        if (requestURI != null && requestURI.equals("/")) {
            new DefaultRedirectStrategy().sendRedirect((HttpServletRequest) req, (HttpServletResponse) res, "/login");
            return;
        }

//        if (requestURI != null && requestURI.contains("/login")) {
            chain.doFilter(req, res);
//            return;
//        }
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//
//        if (auth == null || auth.getPrincipal() == null) {
//            new DefaultRedirectStrategy().sendRedirect((HttpServletRequest) req, (HttpServletResponse) res, "/login");
//            return;
//        }
//        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }
}
