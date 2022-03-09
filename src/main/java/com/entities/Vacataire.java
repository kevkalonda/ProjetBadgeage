package com.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@DiscriminatorColumn(name = "V")
public class Vacataire extends Utilisateur{
	
	

    @OneToMany(mappedBy = "effectue_par")
    private List<Seance_Formation> effectue;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "vacataire_cours",
            joinColumns = {
                    @JoinColumn(name = "vacataire_id", referencedColumnName = "Id", updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "cours_id", referencedColumnName = "Id", updatable = false)})
    private List<Cours> participe_A;

	public List<Seance_Formation> getEffectue() {
		return effectue;
	}

	public void setEffectue(List<Seance_Formation> effectue) {
		this.effectue = effectue;
	}

	public List<Cours> getParticipe_A() {
		return participe_A;
	}

	public void setParticipe_A(List<Cours> participe_A) {
		this.participe_A = participe_A;
	}
}
