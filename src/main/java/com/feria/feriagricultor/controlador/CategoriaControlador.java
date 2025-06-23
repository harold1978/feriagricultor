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

/**
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/api/categoria")
public class CategoriaControlador{
 @Autowired
 private FeriaServicio servicio;
 
 @GetMapping
 public List<Categoria> getCategorias(){
     return servicio.getCategorias();
     
 }
}