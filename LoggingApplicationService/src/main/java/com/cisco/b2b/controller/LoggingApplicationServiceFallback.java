package com.cisco.b2b.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cisco.b2b.beans.LoggingBean;

@Component
public class LoggingApplicationServiceFallback implements LoggingApplicationServiceProxy{

	@Override
	public List<LoggingBean> getAllLogs() {
		List<LoggingBean> loggingBeansList=new ArrayList<>();
		LoggingBean loggingBean= new LoggingBean();
		loggingBean.setDocumentId("mujammil ka test");
		loggingBeansList.add(loggingBean);
		return loggingBeansList;
	}

	@Override
	public void logData(LoggingBean loggingBean) {
		System.out.println("Logging service is temporarily down......");	
	}

}
