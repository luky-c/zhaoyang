package com.example.receive.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example.receive.annotation.Authorization;
import com.example.receive.config.Constant;


@Component
public class ReceiveInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler)throws Exception{
		if(!(handler instanceof HandlerMethod)){
			return true;
		}
		HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
		
        String Token = request.getHeader(Constant.TOKEN);
        
        if(Token.equals(Constant.Ture_Token)){
        	return true;
        }
        if(method.getAnnotation(Authorization.class) != null){
        	response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
        return true;
	}
}
