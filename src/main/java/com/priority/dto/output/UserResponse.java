package com.priority.dto.output;

import java.time.LocalDate;
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
public class UserResponse {
	
	private Long userId;
	
	private String name;
	
	private String surname;
	
	private String codeFiscale;
	
	private LocalDate birthDate;
	
	private String email;
	
	private String password;
	
	private String profileImage;
	
	private Boolean isActive;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime deletedAt;
	
	private LocalDateTime updatedAt;
	
	private String message;
	
	private Boolean isSuccess;
	
	private List<TaskResponse> userTasks;

}
