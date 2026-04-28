package com.priority.services.interfaces;

import java.util.List;
import java.util.Locale;

import com.priority.dto.input.TaskRequest;
import com.priority.dto.output.TaskResponse;

public interface InterfaceTaskService {
	
	TaskResponse getById(Long id, Locale locale) throws Exception;
	
	List<TaskResponse> listAll(Locale locale) throws Exception;
	
	void create(TaskRequest request, Locale locale) throws Exception;
	
	void update(TaskRequest request, Locale locale) throws Exception;
	
	void delete(Long request, Locale locale) throws Exception;

}
