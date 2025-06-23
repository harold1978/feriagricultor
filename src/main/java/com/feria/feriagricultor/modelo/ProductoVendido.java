package com.feria.feriagricultor.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "tbl_productosVendidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoVendido {
    private String productoId;
    private String nombre;
    private Integer cantidad;
    private Double precioUnitario;
}
