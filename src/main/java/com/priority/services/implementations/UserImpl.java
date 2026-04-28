package com.priority.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priority.dto.input.UserRequest;
import com.priority.dto.output.UserResponse;
import com.priority.services.interfaces.InterfaceUserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserImpl implements InterfaceUserService{

	@Override
	public UserResponse getById(UserRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserResponse> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(UserRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
