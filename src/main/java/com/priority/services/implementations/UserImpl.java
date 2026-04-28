package com.priority.services.implementations;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.priority.dto.input.UserRequest;
import com.priority.dto.output.UserResponse;
import com.priority.enums.ResponseCode;
import com.priority.mappers.MapToResponse;
import com.priority.models.User;
import com.priority.repository.UserRepository;
import com.priority.services.interfaces.InterfaceUserService;
import com.priority.utility.ResponseMessage;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserImpl implements InterfaceUserService{
	
	private final UserRepository userR;
	private final ResponseMessage responseMessage;
	private final MapToResponse mapToResponse;
	
	@Override
	public UserResponse getById(UserRequest request, Locale locale) throws Exception {
		
		if (request == null) throw new Exception(responseMessage.getMsg(ResponseCode.REQUEST_DATA_ERROR, locale));		
		if (request.getUserId() == null) throw new Exception(responseMessage.getMsg(ResponseCode.ID_REQUEST_NULL, locale));		
		User user = userR.findById(request.getUserId()).orElseThrow(()-> new Exception(responseMessage.getMsg(ResponseCode.USER_NOT_FOUND, locale)));
		
		UserResponse response = null;
		
		try {		
			response = mapToResponse.userToUserResponse(user);
		} catch (Exception e) {
			throw new Exception(responseMessage.getMsg(ResponseCode.RESPONSE_MAP_ERROR, locale));
		}
		
		return response;
	}

	@Override
	public List<UserResponse> listAll(Locale locale) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(UserRequest request, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserRequest request, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
