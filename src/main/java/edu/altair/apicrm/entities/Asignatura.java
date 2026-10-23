package edu.altair.apicrm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignaturas", schema = "crm_altair")
public class Asignatura 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private Long idAsignatura;

    @Column(name = "nombreAsignatura", nullable = false, length = 100)
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "id_profesor_fk", nullable = false, foreignKey = @ForeignKey(name = "fk_asignaturas_profesor"))
    private Profesor profesor;

	public Asignatura() {}

	public Asignatura(Long idAsignatura, String nombre, Profesor profesor) {
		this.idAsignatura = idAsignatura;
		this.nombre = nombre;
		this.profesor = profesor;
	}

	public Long getIdAsignatura() {return idAsignatura;}
	public void setIdAsignatura(Long idAsignatura) {this.idAsignatura = idAsignatura;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public Profesor getProfesor() {return profesor;}
	public void setProfesor(Profesor profesor) {this.profesor = profesor;}
}