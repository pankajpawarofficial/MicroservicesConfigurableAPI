package com.cisco.b2b.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.b2b.beans.LoggingBean;

@RefreshScope
@RestController
@RequestMapping("/LoggingApplicationService")
public class FeignLoggingApplicationController {
	
	@Autowired
	private LoggingApplicationServiceProxy loggingApplicationServiceProxy;
	
	@GetMapping("/allLogs")
	public List<LoggingBean> getAllLogs(){
		return this.loggingApplicationServiceProxy.getAllLogs();
	}
	
	@PostMapping("/log")
	public List<LoggingBean> logData(@RequestBody LoggingBean loggingBean) {
		this.loggingApplicationServiceProxy.logData(loggingBean);
		return this.loggingApplicationServiceProxy.getAllLogs();
	}

}
