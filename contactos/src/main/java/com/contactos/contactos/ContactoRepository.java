package com.contactos.contactos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Long> {}
