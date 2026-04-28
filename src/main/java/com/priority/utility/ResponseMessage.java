package com.priority.utility;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.priority.enums.ResponseCode;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
@RequiredArgsConstructor
public class ResponseMessage {
	
	private final MessageSource messageSource;
	
	public String getMsg(ResponseCode code, Locale locale) {
		log.info("Message code {}", code.getKey());

		return messageSource.getMessage(code.getKey(), null, "Error", locale);
	}
}
