package com.example.meusgastos2.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meusgastos2.domain.model.CentroDeCusto;
import com.example.meusgastos2.domain.model.Usuario;

public interface CentroDeCustosRepository extends JpaRepository<CentroDeCusto, Long>{

    List<CentroDeCusto> findByUsuario(Usuario usuario);
    
}
