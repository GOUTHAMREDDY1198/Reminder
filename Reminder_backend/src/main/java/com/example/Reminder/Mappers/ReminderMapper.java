package com.example.Reminder.Mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.Reminder.RemindRequest;

@Mapper
public interface ReminderMapper {
	
	@Select("select title as title, message as message , reference_id as referenceId from reminder")
    public List < RemindRequest > findAll();
	
	@Insert({ "<script>",
		"insert into reminder (TITLE, MESSAGE, REFERENCE_ID, NOTIFY_TIME, STATUS) values ",
		"<foreach collection='reminderDetails' item='reminder' index='index' open='(' separator = '),(' close=')' >"
		+"#{reminder.title},#{reminder.message},#{account.referenceId},#{account.notifyTime},#{account.status}"
		+"</foreach>",
		"</script>" })
	public void insertBulkCustomerDetails(@Param("reminderDetails") List<RemindRequest> reminderDetails);
	
	@Select("select title as title, message as message , reference_id as referenceId from reminder where referenceId = #{referenceId}")
    public List < RemindRequest > findUser(@Param("referenceId") String userId);
	
	@Delete("delete from reminder where reference_id=#{referenceId}")
	void deleteBooks(@Param("userId") String userId);
}
