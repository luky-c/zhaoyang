package com.example.receive.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.receive.annotation.Authorization;
import com.example.receive.config.RedisConfig;
import com.example.receive.model.DModel2;
import com.example.receive.model.DeviceModel;
import com.example.receive.model.ResResult;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;





@RestController
@RequestMapping("/receive")
public class ReceiveController {
		@Autowired
		private RedisTemplate redisTemplate;
		@Autowired
		private RedisConfig redisConfig;
		
		@RequestMapping(value={""},method = RequestMethod.POST)
	    @Authorization
	    @ApiOperation(value = "保存")
	    @ApiImplicitParams({
	            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header"),
	    })
		public ResResult addInfo(@RequestBody DModel2 deviceInfo){
		redisTemplate.opsForList().leftPush("device", deviceInfo);
		return new ResResult(deviceInfo);
		
		}
		
		
		
}
