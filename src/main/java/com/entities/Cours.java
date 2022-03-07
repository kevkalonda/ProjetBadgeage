package com.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Cours {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String intitule;
	
	@ManyToMany
    private List<Filiere_Langue> filierelangues;
    
    @OneToMany(mappedBy = "cours")
    private List<Vacataire> vacataire;
    
    @OneToMany(mappedBy = "cours")
    private List<Creneau> creneau;
    
    public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public List<Filiere_Langue> getFilierelangues() {
		return filierelangues;
	}

	public void setFilierelangues(List<Filiere_Langue> filierelangues) {
		this.filierelangues = filierelangues;
	}

	public List<Vacataire> getVacataire() {
		return vacataire;
	}

	public void setVacataire(List<Vacataire> vacataire) {
		this.vacataire = vacataire;
	}

	public List<Creneau> getCreneau() {
		return creneau;
	}

	public void setCreneau(List<Creneau> creneau) {
		this.creneau = creneau;
	}

	

}
