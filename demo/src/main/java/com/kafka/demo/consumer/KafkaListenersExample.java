package com.kafka.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
class KafkaListenersExample {

  Logger LOG = LoggerFactory.getLogger(KafkaListenersExample.class);

  @KafkaListener(topics = "vault.api.v1.accounts.account.created",
		  groupId ="vault.v1.core_stream_api")
  void listener(String data) {
	  System.out.println("Nishtha-----------------------------");
    LOG.info(data + "Nishtha");
  }

	/*
	 * @KafkaListener( topics = "reflectoring-1, reflectoring-2", groupId =
	 * "reflectoring-group-2") void commonListenerForMultipleTopics(String message)
	 * { LOG.info("MultipleTopicListener - {}", message); }
	 */
}