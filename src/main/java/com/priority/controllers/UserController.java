package com.priority.controllers;

import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.priority.dto.input.UserRequest;
import com.priority.enums.ResponseCode;
import com.priority.services.interfaces.InterfaceUserService;
import com.priority.utility.ResponseMessage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/user/")
public class UserController {
	
	private final InterfaceUserService userS;
	private final ResponseMessage responseMsg;

	
	
	@GetMapping(path = "get-by/{id}")
	public ResponseEntity<Object> getUserById(@PathVariable Long id, Locale locale) throws Exception {
		
		log.info("Start http method for get user by id = {}", id);
		
		Object response = null;
		HttpStatus status = HttpStatus.OK;
		
		try {
			response = userS.getById(id, locale);
		} catch (Exception e) {
			response = e.getMessage();
			status = HttpStatus.NOT_FOUND;
		}
		
		return ResponseEntity.status(status).body(response);
	}
	
	
	@GetMapping(path = "get-all")
	public ResponseEntity<Object> getAll(Locale locale) throws Exception {
		
		log.info("Start http method for get All Users");
		
		Object response = null;
		HttpStatus status = HttpStatus.OK;
		
		try {
			response = userS.listAll(locale);
		} catch (Exception e) {
			response = e.getMessage();
			status = HttpStatus.BAD_REQUEST;
		}
		
		return ResponseEntity.status(status).body(response);
	}
	
	@PostMapping(path = "create")
	public ResponseEntity<Object> create(@RequestBody UserRequest request, Locale locale) throws Exception {
		
		log.info("Start http method for create User");
		
		Object response = null;
		HttpStatus status = HttpStatus.OK;
		
		try {
						
			response = userS.create(request, locale);
			
			
		} catch (Exception e) {
			response = e.getMessage();
			status = HttpStatus.BAD_REQUEST;

		}
		
		return ResponseEntity.status(status).body(response);
	}
	
	@PutMapping(path = "update")
	public ResponseEntity<Object> update(@RequestBody UserRequest request, Locale locale) throws Exception {
		
		log.info("Start http method for create User");
		
		Object response = null;
		HttpStatus status = HttpStatus.OK;
		
		try {
			userS.update(request, locale);			
			response = responseMsg.getMsg(ResponseCode.INFO_USER_UPDATED, locale);
			
		} catch (Exception e) {
			response = e.getMessage();
			status = HttpStatus.BAD_REQUEST;
		}
		
		return ResponseEntity.status(status).body(response);
	}
	
	@DeleteMapping(path = "delete-by/{id}")
	public ResponseEntity<Object> update(@PathVariable Long id, Locale locale) throws Exception {
		
		log.info("Start http method for delte user by id = {}", id);
		
		Object response = null;
		HttpStatus status = HttpStatus.OK;
		
		try {
			userS.delete(id, locale);			
			response = responseMsg.getMsg(ResponseCode.INFO_USER_DELETED, locale);
			
		} catch (Exception e) {
			response = e.getMessage();
			status = HttpStatus.BAD_REQUEST;
		}
		
		return ResponseEntity.status(status).body(response);
	}

}
