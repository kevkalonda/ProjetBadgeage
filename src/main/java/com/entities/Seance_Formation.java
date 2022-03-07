package com.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Seance_Formation {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;	
	private boolean estEffectue;	
	private Long dureeEffective;	
	private boolean valide;
	private String commentaire;
	
	@OneToOne
	private Creneau creneau;
	
	@OneToOne
	private Vacataire vacataire;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public boolean isEstEffectue() {
		return estEffectue;
	}

	public void setEstEffectue(boolean estEffectue) {
		this.estEffectue = estEffectue;
	}

	public Long getDureeEffective() {
		return dureeEffective;
	}

	public void setDureeEffective(Long dureeEffective) {
		this.dureeEffective = dureeEffective;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}

	public Vacataire getVacataire() {
		return vacataire;
	}

	public void setVacataire(Vacataire vacataire) {
		this.vacataire = vacataire;
	}

	
}
