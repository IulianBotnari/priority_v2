package com.priority.services.interfaces;

import java.util.List;

import com.priority.dto.input.UserRequest;
import com.priority.dto.output.UserResponse;

public interface InterfaceUserService {
	
	UserResponse getById(UserRequest request) throws Exception;
	
	List<UserResponse> listAll() throws Exception;
	
	void create(UserRequest request) throws Exception;
	
	void delete(UserRequest request) throws Exception;

}
