package com.contactos.contactos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/contactos")
public class ContactoController {
 @Autowired
 private ContactoService contactoService;
 @GetMapping
 public String listarContactos(Model model) {
 model.addAttribute("contactos", contactoService.obtenerTodos());
 return "contactos";
 }
 @PostMapping("/guardar")
 public String guardarContacto(@ModelAttribute Contacto contacto) {
 contactoService.guardar(contacto);
 return "redirect:/contactos";
 }
 @GetMapping("/eliminar/{id}")
 public String eliminarContacto(@PathVariable Long id) {
 contactoService.eliminar(id);
 return "redirect:/contactos";
 }
}
