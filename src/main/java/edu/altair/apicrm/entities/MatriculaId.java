package edu.altair.apicrm.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MatriculaId implements Serializable 
{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_alumno_fk")
	private Long idAlumno;

    @Column(name = "id_asignatura_fk")
    private Long idAsignatura;

    public MatriculaId() {}

    public MatriculaId(Long idAlumno, Long idAsignatura) {
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
    }

    public Long getIdAlumno() { return idAlumno; }
    public void setIdAlumno(Long idAlumno) { this.idAlumno = idAlumno; }

    public Long getIdAsignatura() { return idAsignatura; }
    public void setIdAsignatura(Long idAsignatura) {
        this.idAsignatura = idAsignatura;
    }
}
