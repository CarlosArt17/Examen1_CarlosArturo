package org.uv.demo.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.demo.Entitys.DTOAlumno;





public interface AlumnosRepository extends JpaRepository<DTOAlumno, String> {
    
}

