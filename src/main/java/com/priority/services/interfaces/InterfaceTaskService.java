package com.priority.services.interfaces;

import java.util.List;

import com.priority.dto.input.TaskRequest;
import com.priority.dto.output.TaskResponse;

public interface InterfaceTaskService {
	
	TaskResponse getById(TaskRequest request) throws Exception;
	
	List<TaskResponse> listAll() throws Exception;
	
	void create(TaskRequest request) throws Exception;
	
	void delete(TaskRequest request) throws Exception;

}
