package com.priority.services.interfaces;

import java.util.List;
import java.util.Locale;

import com.priority.dto.input.UserRequest;
import com.priority.dto.output.UserResponse;

public interface InterfaceUserService {
	
	UserResponse getById(UserRequest request, Locale locale) throws Exception;
	
	List<UserResponse> listAll(Locale locale) throws Exception;
	
	void create(UserRequest request, Locale locale) throws Exception;
	
	void delete(UserRequest request, Locale locale) throws Exception;

}
