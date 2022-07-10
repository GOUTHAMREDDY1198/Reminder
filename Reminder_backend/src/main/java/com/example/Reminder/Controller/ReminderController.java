package com.example.Reminder.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Reminder.RemindRequest;
import com.example.Reminder.Mappers.ReminderMapper;

@RestController
public class ReminderController {
	
	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private ReminderMapper reminderMapper;

	
	@RequestMapping("/hello")
	public List < RemindRequest > hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		LOG.info("Data: {}", reminderMapper.findAll());
		return reminderMapper.findAll();
	}
	
}
