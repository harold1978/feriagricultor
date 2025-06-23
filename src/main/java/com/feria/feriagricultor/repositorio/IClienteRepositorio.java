package com.feria.feriagricultor.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feria.feriagricultor.modelo.Cliente;

@Repository
public interface IClienteRepositorio extends MongoRepository<Cliente, String> {
    
}
