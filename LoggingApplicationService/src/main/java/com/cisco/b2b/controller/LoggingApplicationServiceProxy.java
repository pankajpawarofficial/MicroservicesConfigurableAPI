package com.cisco.b2b.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cisco.b2b.beans.LoggingBean;

@FeignClient(name="LoggingApplication", fallback=LoggingApplicationServiceFallback.class)
public interface LoggingApplicationServiceProxy {

	@GetMapping("/getAllLogs")
	public List<LoggingBean> getAllLogs();
	
	@GetMapping("/logData")
	public void logData(LoggingBean loggingBean);

}
