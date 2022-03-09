package com.dtos;

import java.util.List;

import com.entities.Filiere_Langue;
import com.entities.Responsable;

import lombok.Data;

@Data
public class ComposanteDto {
	
	private Long Id;
	private String nomComposante;
	private List<ResponsableDto> responsables;
	private List<Filiere_LangueDto> filierelangues;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNomComposante() {
		return nomComposante;
	}
	public void setNomComposante(String nomComposante) {
		this.nomComposante = nomComposante;
	}
	public List<ResponsableDto> getResponsables() {
		return responsables;
	}
	public void setResponsables(List<ResponsableDto> responsables) {
		this.responsables = responsables;
	}
	public List<Filiere_LangueDto> getFilierelangues() {
		return filierelangues;
	}
	public void setFilierelangues(List<Filiere_LangueDto> filierelangues) {
		this.filierelangues = filierelangues;
	}
	
}
