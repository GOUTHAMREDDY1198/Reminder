package com.example.Reminder.Mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.Reminder.RemindRequest;

@Mapper
public interface ReminderMapper {
	
	@Select("select * from reminder")
    public List < RemindRequest > findAll();
	
	
}
