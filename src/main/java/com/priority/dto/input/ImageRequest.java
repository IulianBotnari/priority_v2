package com.priority.dto.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ImageRequest {
	
	private Long imageId;
	
	private Long taskId;
	
	private String image;
	
}
