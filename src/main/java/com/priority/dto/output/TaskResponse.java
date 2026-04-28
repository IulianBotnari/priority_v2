package com.priority.dto.output;

import java.time.LocalDateTime;
import java.util.List;

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
public class TaskResponse {
	
	private Long taskId;
	
	private Long userId;
	
	private String taskTitle;
	
	private String taskDescription;
	
	private Long taskPriority;
	
	private LocalDateTime startDateTime;
	
	private LocalDateTime endDateTime;
	
	private Boolean isRepeated;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;
	
	private List<ImageResponse> taskImages;

}
