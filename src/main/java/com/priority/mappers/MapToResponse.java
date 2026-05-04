package com.priority.mappers;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.priority.dto.output.ImageResponse;
import com.priority.dto.output.TaskResponse;
import com.priority.dto.output.UserResponse;
import com.priority.models.Image;
import com.priority.models.Task;
import com.priority.models.User;

@Component
public class MapToResponse {
	
	public UserResponse userToUserResponse(User user) throws Exception {
		
		return UserResponse.builder()
				.userId(user.getUserId())
				.name(user.getName())
				.surname(user.getSurname())
				.codeFiscale(user.getCodeFiscale())
				.birthDate(user.getBirthDate())
				.email(user.getEmail())
				.profileImage(user.getProfileImage())
				.isActive(user.getIsActive())
				.message(null)
				.isSuccess(false)
				.createdAt(user.getCreatedAt())
				.deletedAt(user.getDeletedAt() != null ? user.getDeletedAt() : null)
				.updatedAt(user.getUpdatedAt() != null ? user.getUpdatedAt() : null)
				.userTasks(user.getUserTasks().isEmpty() ? null : user.getUserTasks().stream().map(
						task -> {
							try {
								return taskToTaskResponse(task);
							} catch (Exception e) {
								e.printStackTrace();
							}
							return null;
						}
						).collect(Collectors.toList()))
				.build();
	}
	
	public TaskResponse taskToTaskResponse(Task task) throws Exception{
		
		return TaskResponse.builder()
				.taskId(task.getTaskId())
				.userId(task.getUser().getUserId())
				.taskTitle(task.getTaskTitle())
				.taskDescription(task.getTaskDescription())
				.taskPriority(task.getTaskPriority())
				.startDateTime(task.getStartDateTime())
				.endDateTime(task.getEndDateTime())
				.isRepeated(task.getIsRepeated())
				.createdAt(task.getCreatedAt())
				.updatedAt(task.getUpdatedAt() != null ? task.getUpdatedAt() : null)
				.taskImages(task.getTaskImages().isEmpty() ? null : task.getTaskImages().stream().map(
						image -> {
							try {
								return imageToImageResponse(image);
							} catch (Exception e) {
								e.printStackTrace();
							}
							return null;
						}
						).collect(Collectors.toList()))
				.build();
	}
	
	public ImageResponse imageToImageResponse(Image image) throws Exception{
		
		return ImageResponse.builder()
				.imageId(image.getImageId())
				.taskId(image.getTask().getTaskId())
				.image(image.getImage())
				.createdAt(image.getCreatedAt())
				.deleteDateTime(image.getDeleteDateTime())
				.build();
	}

}
