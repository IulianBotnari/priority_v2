package com.priority.services.interfaces;

import java.util.List;

import com.priority.dto.input.ImageRequest;

import com.priority.dto.output.ImageResponse;


public interface InterfaceImageService {
	ImageResponse getById(ImageRequest request) throws Exception;
	
	List<ImageResponse> listAll() throws Exception;
	
	void create(ImageRequest request) throws Exception;
	
	void delete(ImageRequest request) throws Exception;
}
