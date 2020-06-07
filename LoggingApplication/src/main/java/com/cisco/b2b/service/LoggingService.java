package com.cisco.b2b.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.b2b.beans.LoggingBean;
import com.cisco.b2b.repository.LoggingBeanRepository;

@Service
public class LoggingService {
	
	@Autowired
	private LoggingBeanRepository loggingBeanRepository;
	
	public List<LoggingBean> getAllLogList(){
		return loggingBeanRepository.findAll();
	}

	public LoggingBean saveLogs(LoggingBean loggingBean1) {
		LoggingBean loggingBean=loggingBeanRepository.findByUniqueId(loggingBean1.getUniqueId());
		if(loggingBean!=null) {
			loggingBean.getTransactionPayloadList().add(loggingBean1.getTransactionPayloadList().get(0));
		}else {
			loggingBean=loggingBean1;
		}
		return loggingBeanRepository.save(loggingBean);		
	}

	public LoggingBean getLogByUniqueId(String uniqueId) {
		return loggingBeanRepository.findByUniqueId(uniqueId);
		
	}

	public LoggingBean deleteLogByUniqueId(String uniqueId) {
		return loggingBeanRepository.deleteByUniqueId(uniqueId);
	}
	
}
