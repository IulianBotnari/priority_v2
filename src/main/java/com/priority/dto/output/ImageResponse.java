package com.priority.dto.output;

import java.time.LocalDateTime;

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
public class ImageResponse {
	
	private Long imageId;
	
	private Long taskId;
	
	private String image;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime deleteDateTime;
}
