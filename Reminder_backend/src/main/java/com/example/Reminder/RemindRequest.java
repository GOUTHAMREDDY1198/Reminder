package com.example.Reminder;

public class RemindRequest {

    private String title;
    private String message;
    private String userId;
    private String notifyTime;
    
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNotifyTime() {
		return notifyTime;
	}
	public void setNotifyTime(String notifyTime) {
		this.notifyTime = notifyTime;
	}
	@Override
	public String toString() {
		return "RemindRequest [title=" + title + ", message=" + message + ", userId=" + userId + ", notifyTime="
				+ notifyTime + "]";
	}
	
    
}
