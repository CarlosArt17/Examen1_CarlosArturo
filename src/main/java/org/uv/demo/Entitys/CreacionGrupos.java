package org.uv.demo.Entitys;

import java.util.List;


public class CreacionGrupos {
    private String nombre;
    private List<String> materias;
    private List<String> alumnos;

    public CreacionGrupos(String nombre, List<String> materias, List<String> alumnos) {
        this.nombre = nombre;
        this.materias = materias;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public List<String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<String> alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
