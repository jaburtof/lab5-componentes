package com.cenfotec.lab5.lab5.domain;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private Date dateOfBirth;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public Persona(String pNombre, String pApellido1, String pApellido2, String pDireccion, String pDate) throws ParseException {
        this.nombre = pNombre;
        this.apellido1 = pApellido1;
        this.apellido2 = pApellido2;
        this.direccion = pDireccion;
        this.dateOfBirth = format.parse(pDate);
    }

    public Persona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getCreatedAsShort() {
        return format.format(dateOfBirth);
    }

    public String toString() {
        StringBuilder value = new StringBuilder("PersonaEntry(");
        value.append("Id: ");
        value.append(id);
        value.append(",Nombre: ");
        value.append(nombre);
        value.append(",Apellidos: ");
        value.append(apellido1+" "+apellido2);
        value.append(",Dirección: ");
        value.append(direccion);
        value.append(",Fecha de nacimiento: ");
        value.append(getCreatedAsShort());
        value.append(")");
        return value.toString();
    }

}