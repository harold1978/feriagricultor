package com.feria.feriagricultor.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feria.feriagricultor.modelo.Categoria;


@Repository
public interface ICategoriaRepositorio extends MongoRepository<Categoria, String> {

}
