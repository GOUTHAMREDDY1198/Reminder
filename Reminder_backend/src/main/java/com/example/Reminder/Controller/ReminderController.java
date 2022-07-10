package com.example.Reminder.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Reminder.Mappers.ReminderMapper;

@RestController
public class ReminderController {
	
	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private ReminderMapper reminderMapper;

	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		LOG.info("Data: {}", reminderMapper.findAll());
		return String.format("Hello %s!", name);
	}
	
}
