package com.example.demo.model;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect
@JsonSerialize
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

	@JsonProperty(value = "id")
	
	@Size(min = 1)
	private String id;
	@JsonProperty(value = "nombre")

	@Size(min = 3, max = 15)
	private String nombre;
	@JsonProperty(value = "duracion")
	
	@Size(min = 10, max = 45)
	private String duracion;
	@JsonProperty(value = "fechaInicio")

	@Size(min = 10, max = 45)
	@Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}", message="Invalid status date")
	private String fechaInicio;

	

}
