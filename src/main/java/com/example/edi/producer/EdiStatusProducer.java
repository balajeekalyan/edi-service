package com.example.edi.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jms.EdiStatus;

@RestController
@RequestMapping("/edi-service")
public class EdiStatusProducer {

	@Autowired
	JmsTemplate jmsTemplate;

	@RequestMapping(value = "/produce", method = RequestMethod.POST)
	public String publish(@RequestBody EdiStatus obj) {
		
		jmsTemplate.convertAndSend("edi.queue", obj);

		return "Published Successfully";
	}

	
}
