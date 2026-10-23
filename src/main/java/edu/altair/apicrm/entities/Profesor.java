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
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "profesores", schema = "crm_altair", uniqueConstraints = {
        @UniqueConstraint(name = "uk_profesores_dni", columnNames = "dniProfesor")
})
public class Profesor 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Long idProfesor;

    @Column(name = "dniProfesor", nullable = false, length = 9)
    private String dni;

    @Column(name = "nombreProfesor", nullable = false, length = 100)
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk", nullable = false, foreignKey = @ForeignKey(name = "fk_profesores_departamento"))
    private Departamento departamento;

	public Profesor() {}

	public Profesor(Long idProfesor, 
			String dni, String nombre, Departamento departamento)
	{
		this.idProfesor = idProfesor;
		this.dni = dni;
		this.nombre = nombre;
		this.departamento = departamento;
	}

	public Long getIdProfesor() {return idProfesor;}
	public void setIdProfesor(Long idProfesor) {this.idProfesor = idProfesor;}
	public String getDni() {return dni;}
	public void setDni(String dni) {this.dni = dni;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public Departamento getDepartamento() {return departamento;}
	public void setDepartamento(Departamento departamento) {this.departamento = departamento;}
}
