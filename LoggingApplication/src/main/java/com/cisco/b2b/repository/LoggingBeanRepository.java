package com.cisco.b2b.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cisco.b2b.beans.LoggingBean;

@Repository
public interface LoggingBeanRepository extends MongoRepository<LoggingBean, String> {

	LoggingBean findByUniqueId(String uniqueId);

	LoggingBean deleteByUniqueId(String uniqueId);

}
