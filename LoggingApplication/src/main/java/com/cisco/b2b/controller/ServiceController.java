package com.cisco.b2b.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.b2b.beans.LoggingBean;
import com.cisco.b2b.service.LoggingService;

@RefreshScope
@RestController
public class ServiceController {
	
	@Autowired
	private LoggingService loggingService;
	
	@GetMapping(value="/fetchAllLogs")
	public List<LoggingBean> getAllLogList(){
		return loggingService.getAllLogList();
	}
	
	@GetMapping(value="/getLogById/{uniqueId}")
	public LoggingBean getLogByUniqueId(@PathVariable String uniqueId){
		return loggingService.getLogByUniqueId(uniqueId);
	}
	
	@DeleteMapping(value="/deleteLogById/{uniqueId}")
	public LoggingBean deleteLogByUniqueId(@PathVariable String uniqueId){
		return loggingService.deleteLogByUniqueId(uniqueId);
	}
	
	@PostMapping(value="/upsertLog")
	public LoggingBean logData(@RequestBody LoggingBean loggingBean){
		return loggingService.saveLogs(loggingBean);
	}

}
