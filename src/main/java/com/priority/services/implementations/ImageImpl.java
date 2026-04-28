package com.priority.services.implementations;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.priority.dto.input.ImageRequest;
import com.priority.dto.output.ImageResponse;
import com.priority.services.interfaces.InterfaceImageService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImageImpl implements InterfaceImageService{@Override
	public ImageResponse getById(ImageRequest request, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageResponse> listAll(Locale locale) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(ImageRequest request, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ImageRequest request, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
