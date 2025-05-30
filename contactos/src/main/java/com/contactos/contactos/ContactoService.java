package com.contactos.contactos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ContactoService {
 @Autowired
 private ContactoRepository contactoRepository;
 public List<Contacto> obtenerTodos() {
 return contactoRepository.findAll();
 }
 public void guardar(Contacto contacto) {
 contactoRepository.save(contacto);
 }
 public void eliminar(Long id) {
 contactoRepository.deleteById(id);
 }
}