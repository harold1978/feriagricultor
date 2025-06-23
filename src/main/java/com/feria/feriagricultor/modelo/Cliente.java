package com.feria.feriagricultor.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "tbl_clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private String id;
    private String nombre;
    private String telefono;
}
