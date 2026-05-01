package com.priority.dto.input;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
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
public class UserRequest {
	
	private Long userId;
	
	private String name;
	
	private String surname;
	
	@Pattern(regexp = "^[A-Z]{6}[0-9LMNPQRSTUV]{2}[ABCDEHLMPRST][0-9LMNPQRSTUV]{2}[A-Z][0-9LMNPQRSTUV]{3}[A-Z]$i", 
            message = "Codice Fiscale non valido")
	private String codeFiscale;
	
	private LocalDate birthDate;
	
	@Email(message = "Formato email non valido")
    @Pattern(regexp = ".+@.+\\..+", message = "L'email deve contenere un dominio valido")
	private String email;
	
	private String phone;
	
	private String password;
	
	private String profileImage;
	
	private Boolean isActive;
	

}
