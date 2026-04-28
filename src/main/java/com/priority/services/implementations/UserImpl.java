package com.priority.services.implementations;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

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
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserImpl implements InterfaceUserService{
	

	
	private final UserRepository userR;
	private final ResponseMessage responseMessage;
	private final MapToResponse mapToResponse;
	
	@Override
	public UserResponse getById(Long id, Locale locale) throws Exception {
		log.info("Start user.getById() method");
			
		if (id == null) throw new Exception(responseMessage.getMsg(ResponseCode.INFO_ID_REQUEST_NULL, locale));	
		
		log.info("Get user by id {}", id);
		
		User user = userR.findById(id).orElseThrow(()-> new Exception(responseMessage.getMsg(ResponseCode.INFO_USER_NOT_FOUND, locale)));
		
		UserResponse response = null;
		
		try {		
			response = mapToResponse.userToUserResponse(user);
		} catch (Exception e) {
			throw new Exception(responseMessage.getMsg(ResponseCode.ERROR_RESPONSE_MAP, locale));
		}
		
		return response;
	}

	@Override
	public List<UserResponse> listAll(Locale locale) throws Exception {
		log.info("Start user.listAll() method");
		
		List<User> userList = userR.findAll();
		
		return userList.stream()
	            .map(user -> {
	                try {
	                    return mapToResponse.userToUserResponse(user);
	                } catch (Exception e) {
	                    log.error("Error mapping user with ID: {}", user.getUserId(), e);
	                    return null; 
	                }
	            })
	            .filter(Objects::nonNull) 
	            .collect(Collectors.toList());
	}

	@Override
	public void create(UserRequest request, Locale locale) throws Exception {
		log.info("Start user.create() method");
		
		if (request == null) throw new Exception(responseMessage.getMsg(ResponseCode.ERROR_REQUEST_DATA, locale));
		User user = new User();
		
		if (request.getName() == null) throw new Exception(responseMessage.getMsg(ResponseCode.INFO_USERNAME_NOT_FOUND, locale));
		user.setName(request.getName());
		
		if (request.getSurname() == null) throw new Exception(responseMessage.getMsg(ResponseCode.INFO_SURNAME_NOT_FOUND, locale));
		user.setSurname(request.getSurname());
		
		if (request.getCodeFiscale() == null) throw new Exception(responseMessage.getMsg(ResponseCode.INFO_CODEFISCALE_NOT_FOUND, locale));
		user.setCodeFiscale(request.getCodeFiscale());
		
		if (request.getBirthDate() == null) throw new Exception(responseMessage.getMsg(ResponseCode.INFO_BIRTHDATE_NOT_FOUND, locale));
		user.setBirthDate(request.getBirthDate());
		
		if (request.getEmail() == null) throw new Exception(responseMessage.getMsg(ResponseCode.INFO_EMAIL_NOT_FOUND, locale));
		user.setEmail(request.getEmail());
		
		userR.save(user);
	}
	
	@Override
	public void update(UserRequest request, Locale locale) throws Exception {
		log.info("Start user.update() method");
		
		if (request == null) throw new Exception(responseMessage.getMsg(ResponseCode.ERROR_REQUEST_DATA, locale));
		
		User user = userR.findById(request.getUserId()).orElseThrow(()-> new Exception(responseMessage.getMsg(ResponseCode.INFO_USER_NOT_FOUND, locale)));
		
		log.info("Update user by id {}", request.getUserId());
		
		if (request.getName() != null) user.setName(request.getName());
		
		if (request.getSurname() != null) user.setSurname(request.getSurname());
		
		if (request.getCodeFiscale() != null) user.setCodeFiscale(request.getCodeFiscale());
		
		if (request.getBirthDate() != null) user.setBirthDate(request.getBirthDate());
		
		if (request.getEmail() != null) user.setEmail(request.getEmail());
		
		userR.save(user);
		
	}

	@Override
	public void delete(Long id, Locale locale) throws Exception {
		log.info("Start user.delete() method");
		
		if (id == null) throw new Exception(responseMessage.getMsg(ResponseCode.ERROR_REQUEST_DATA, locale));
		
		User user = userR.findById(id).orElseThrow(()-> new Exception(responseMessage.getMsg(ResponseCode.INFO_USER_NOT_FOUND, locale)));
		
		log.info("Delete user by id {}", id);
		
		userR.delete(user);
		
	}

	


}
