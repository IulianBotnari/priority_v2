package com.priority.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String name;
	
	private String surname;
	
	private String codeFiscale;
	
	private LocalDate birthDate;
	
	private String email;
	
	private String profileImage;

	private Boolean isActive;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime deletedAt;
	
	private LocalDateTime udatedAt;
	
	
	

}
