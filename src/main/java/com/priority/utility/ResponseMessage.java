package com.priority.utility;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.priority.enums.ResponseCode;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ResponseMessage {
	
	private final MessageSource messageSource;
	
	public String getMsg(ResponseCode code, Locale locale) {
		
		return messageSource.getMessage(code.getKey(), null, "Error", locale);
	}
}
