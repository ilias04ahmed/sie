package com.contactos.contactos;
import jakarta.persistence.*;

@Entity
public class Contacto {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nombre;
 private String telefono;
 private String email;
 public Contacto() {}
 // Getters y Setters
 public Long getId() { return id; }

 public String getNombre() { return nombre; }
 public void setNombre(String nombre) { this.nombre = nombre; }
 public String getTelefono() { return telefono; }
 public void setTelefono(String telefono) { this.telefono = telefono; }
 public String getEmail() { return email; }
 public void setEmail(String email) { this.email = email; }
}