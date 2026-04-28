package com.priority.services.interfaces;

import java.util.List;
import java.util.Locale;

import com.priority.dto.input.ImageRequest;

import com.priority.dto.output.ImageResponse;


public interface InterfaceImageService {
	ImageResponse getById(ImageRequest request, Locale locale) throws Exception;
	
	List<ImageResponse> listAll(Locale locale) throws Exception;
	
	void create(ImageRequest request, Locale locale) throws Exception;
	
	void delete(ImageRequest request, Locale locale) throws Exception;
}
