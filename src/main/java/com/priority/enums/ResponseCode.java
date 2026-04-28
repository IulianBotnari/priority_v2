package com.priority.enums;


public enum ResponseCode {
	
	DATA_NOT_FOUND("data.not.found"),
	REQUEST_DATA_ERROR("request.data.error"),
	ID_REQUEST_NULL("id.request.null"),
	USER_NOT_FOUND("user.not.found"),
	RESPONSE_MAP_ERROR("response.map.error");
	
	private final String key;
	
	ResponseCode(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}

}
