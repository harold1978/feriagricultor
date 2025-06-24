package com.feria.feriagricultor.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feria.feriagricultor.modelo.Categoria;
import com.feria.feriagricultor.modelo.Cliente;
import com.feria.feriagricultor.repositorio.ICategoriaRepositorio;
import com.feria.feriagricultor.repositorio.IClienteRepositorio;

@Service
public class FeriaServicio {
    @Autowired
    private ICategoriaRepositorio repo;

    @Autowired
    private IClienteRepositorio repoC;

    //Categorias metodos
    public List<Categoria> getCategorias(){
        return repo.findAll();
    }

    public Categoria getCategoria(String id){
        return repo.findById(id).orElse(null);
    }

    public Categoria crearCategoria(Categoria cate){
       return repo.save(cate);
    }

    public void actualizarCategoria(String id,Categoria cate){
        Categoria c = repo.findById(id).orElse(null);
        if(c!=null){
            repo.save(c);
        }

    }
    public void eliminarCategoria(String id){
        Categoria ce = repo.findById(id).orElse(null);
        if(ce!=null){repo.delete(ce);}
    }

        //Cliente metodos
        public List<Cliente> getClientes(){
            return repoC.findAll();
        }
    
        public void crearCliente(Cliente cli){
            repoC.save(cli);
        }
    
        public void actualizarCliente(String id,Cliente cate){
            Cliente c = repoC.findById(id).orElse(null);
            if(c!=null){
                repoC.save(c);
            }
    
        }
        public void eliminarCliente(String id){
            Cliente cli = repoC.findById(id).orElse(null);
            if(cli!=null){repoC.delete(cli);}
        }
}
