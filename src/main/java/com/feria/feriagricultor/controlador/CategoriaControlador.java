/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/RestController.java to edit this template
 */
package com.feria.feriagricultor.controlador;

import com.feria.feriagricultor.modelo.Categoria;
import com.feria.feriagricultor.servicio.FeriaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



/**
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/api/categorias")
public class CategoriaControlador{
 @Autowired
 private FeriaServicio servicio;
 
 @GetMapping
 public List<Categoria> getCategorias(){
     return servicio.getCategorias();
 }

 @GetMapping("/{id}")
 public Categoria getCategoria(@RequestParam String id) {
     return servicio.getCategoria(id);
 }
 
 @PostMapping
 public Categoria crearCategoria(@RequestBody Categoria categoria) {
    return servicio.crearCategoria(categoria);
 }
 
}