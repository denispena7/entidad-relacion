package edu.altair.apicrm.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos", schema = "crm_altair", uniqueConstraints = {
        @UniqueConstraint(name = "uk_alumnos_dni", columnNames = "dniAlumno")
})
public class Alumno 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Long idAlumno;

    @Column(name = "nombreAlumno", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "dniAlumno", nullable = false, length = 9)
    private String dni;

    // Constructores
    public Alumno() {}

    public Alumno(Long idAlumno, String dni, String nombre) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y Setters
    public Long getIdAlumno() { return idAlumno; }
    public void setIdAlumno(Long idAlumno) { this.idAlumno = idAlumno; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}