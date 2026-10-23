package edu.altair.apicrm.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "matriculas", schema = "crm_altair")
public class Matricula 
{
	@EmbeddedId
    private MatriculaId id;
	
	@MapsId("idAsignatura")
    @ManyToOne()
    @JoinColumn(name = "id_asignatura_fk", nullable = false)
	private Asignatura asignatura;
	
	@MapsId("idAlumno")
    @ManyToOne()
    @JoinColumn(name = "id_alumno_fk", nullable = false)
	private Alumno alumno;
	
	@Column(name = "fechaMatriculacion", nullable = false)
	private LocalDate fechaMatriculacion;
	
	@Column(name = "notaFinal")
	private int notaFinal;

	public Matricula() {}

	public Matricula(Asignatura asignatura, Alumno alumno, LocalDate fechaMatriculacion, int notaFinal) {
		this.asignatura = asignatura;
		this.alumno = alumno;
		this.fechaMatriculacion = fechaMatriculacion;
		this.notaFinal = notaFinal;
	}

	public Asignatura getAsignatura() {return asignatura;}
	public void setAsignatura(Asignatura asignatura) {this.asignatura = asignatura;}
	public Alumno getAlumno() {return alumno;}
	public void setAlumno(Alumno alumno) {this.alumno = alumno;}
	public LocalDate getFechaMatriculacion() {return fechaMatriculacion;}
	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {this.fechaMatriculacion = fechaMatriculacion;}
	public int getNotaFinal() {return notaFinal;}
	public void setNotaFinal(int notaFinal) {this.notaFinal = notaFinal;}
}
