package com.example.uml_work.configuration;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        System.out.println("拦截的路径为"+requestURI);

        HttpSession session = request.getSession();


        Object loginUser = session.getAttribute("loginUser");
//        System.out.println("hello");


        if (loginUser != null){
            System.out.println(loginUser);
            return true;
        }else {
            System.out.println("loginUser is false");
        }

        request.setAttribute("loginFalse","请登入");

        // 转发到登入页
        request.getRequestDispatcher("/").forward(request, response);
        return false;
    }
}