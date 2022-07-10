package com.example.Reminder.Mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.Reminder.RemindRequest;

@Mapper
public interface ReminderMapper {
	
	@Select("select title as title, message as message , user_id as userId from reminder")
    public List < RemindRequest > findAll();
	
	
}
