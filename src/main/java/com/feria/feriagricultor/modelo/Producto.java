package com.feria.feriagricultor.modelo;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document(collection = "tbl_productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    private String id;
    private String nombre;
    private String categoriaId;
    private String productorId;
    private Double precioUnitario;
    private Integer stock;
    private String unidadMedida;
    private LocalDate fechaCosecha;
}