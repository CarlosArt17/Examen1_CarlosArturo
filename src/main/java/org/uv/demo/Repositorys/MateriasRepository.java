/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.demo.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.demo.Entitys.DTOMaterias;

/**
 *
 * @author zS20006736
 */
public interface MateriasRepository extends JpaRepository<DTOMaterias, String> {
    
}