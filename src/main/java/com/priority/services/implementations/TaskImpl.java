package com.priority.services.implementations;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.priority.dto.input.TaskRequest;
import com.priority.dto.output.TaskResponse;
import com.priority.services.interfaces.InterfaceTaskService;

@Service
public class TaskImpl implements InterfaceTaskService{

	@Override
	public TaskResponse getById(TaskRequest request, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaskResponse> listAll(Locale locale) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(TaskRequest request, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TaskRequest request, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
