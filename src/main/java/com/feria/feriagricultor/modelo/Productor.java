/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feria.feriagricultor.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tbl_productores")
public class Productor {
    @Id
    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private List<String> productosCultivados;
}
