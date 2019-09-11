package com.example.receive.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.receive.interceptor.ReceiveInterceptor;


@Configuration


public class MVCConfig extends  WebMvcConfigurationSupport {
	@Autowired
	private ReceiveInterceptor receiveInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(receiveInterceptor);
	}
	
    
	
}
