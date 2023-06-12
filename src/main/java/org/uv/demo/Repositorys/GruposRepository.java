package org.uv.demo.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.demo.Entitys.DTOGrupos;


public interface GruposRepository extends JpaRepository<DTOGrupos, String> {
    
}

