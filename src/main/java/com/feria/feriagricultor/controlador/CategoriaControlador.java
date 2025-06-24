/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/RestController.java to edit this template
 */
package com.feria.feriagricultor.controlador;

import java.io.Console;

import com.feria.feriagricultor.modelo.Categoria;
import com.feria.feriagricultor.servicio.FeriaServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaControlador {
    @Autowired
    private FeriaServicio servicio;

    @GetMapping
    public List<Categoria> getCategorias() {
        return servicio.getCategorias();
    }

    @GetMapping("/get/{id}")
    public Categoria getCategoria(@PathVariable String id) {
        return servicio.getCategoria(id);
    }

    @PostMapping("/crear")
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return servicio.crearCategoria(categoria);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizaCategoria(@PathVariable String id, @RequestBody Categoria cate) {
        try {
            Categoria ca = null;
            Categoria buscado = servicio.getCategoria(id);
            if (buscado != null) {
                ca = servicio.actualizarCategoria(id, cate);
                if (ca == null) {
                    return new ResponseEntity<>("ERROR....", HttpStatus.INTERNAL_SERVER_ERROR);
                }
                return new ResponseEntity<>("TAREA ACTUALIZADA", HttpStatus.OK);
            }
            return new ResponseEntity<>("ERROR....", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity<>("ERROR....", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> EliminarCategoria(@PathVariable String id) {
        try {
            Categoria ca = null;
            Categoria buscado = servicio.getCategoria(id);
            if (buscado != null) {
                servicio.eliminarCategoria(id);
                
                return new ResponseEntity<>("TAREA ELIMINADA", HttpStatus.OK);
            }
            return new ResponseEntity<>("ERROR....", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity<>("ERROR....", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
