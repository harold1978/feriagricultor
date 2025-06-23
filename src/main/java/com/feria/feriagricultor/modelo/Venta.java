package com.feria.feriagricultor.modelo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "tbl_ventas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venta {
    @Id
    private String id;
    private LocalDate fecha;
    private Cliente cliente;
    private List<ProductoVendido> productosVendidos;
    private Double totalVenta;
}