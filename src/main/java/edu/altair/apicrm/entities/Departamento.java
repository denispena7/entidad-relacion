package edu.altair.apicrm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos", schema = "crm_altair")
public class Departamento 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Long idDepartamento;

    @Column(name = "nombreDepartamento", nullable = false, length = 100)
    private String nombre;

	public Departamento() {}

	public Departamento(Long idDepartamento, String nombre) {
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
	}

	public Long getIdDepartamento() {return idDepartamento;}
	public void setIdDepartamento(Long idDepartamento) {this.idDepartamento = idDepartamento;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
}