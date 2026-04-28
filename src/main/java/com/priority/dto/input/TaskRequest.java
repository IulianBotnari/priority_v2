package com.priority.dto.input;
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
public class TaskRequest {
	
	private Long taskId;
	
	private Long userId;
	
	private String taskTitle;
	
	private String taskDescription;
	
	private Long taskPriority;
	
	private LocalDateTime sartDateTime;
	
	private LocalDateTime endDateTime;
	
	private Boolean isRepeated;
	
	
	

}
