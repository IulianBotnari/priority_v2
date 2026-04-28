package com.priority.enums;


public enum ResponseCode {
	
	
	// info enum
	
	INFO_DATA_NOT_FOUND("info.data.not.found"),
	INFO_ID_REQUEST_NULL("info.id.request.null"),
	
	// info User
	INFO_USER_NOT_FOUND("info.user.not.found"),
	INFO_USERNAME_NOT_FOUND("info.username.not.found"),
	INFO_SURNAME_NOT_FOUND("info.surname.not.found"),
	INFO_CODEFISCALE_NOT_FOUND("info.codefiscale.not.found"),
	INFO_BIRTHDATE_NOT_FOUND("info.birthdate.not.found"),
	INFO_EMAIL_NOT_FOUND("info.email.not.found"),
	
	INFO_USER_CREATED("info.user.created"),
	INFO_USER_UPDATED("info.user.updated"),
	INFO_USER_DELETED("info.user.deleted"),
	
	//error enum
	ERROR_REQUEST_DATA("error.request.data"),
	ERROR_RESPONSE_MAP("error.response.map");
	
	private final String key;
	
	ResponseCode(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}

}
