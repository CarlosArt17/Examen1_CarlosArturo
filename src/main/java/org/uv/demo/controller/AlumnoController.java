/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.demo.controller;

import java.util.HashMap;
import org.uv.demo.exception.ResourceNotFoundException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.demo.model.Alumno;
import org.uv.demo.repository.AlumnoRepository;


/**
 *
 * @author minio
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class AlumnoController {
    
        @Autowired
	private AlumnoRepository alumnoRepository;
	
	// get all employees
	@GetMapping("/alumnos")
	public List<Alumno> getAllAlumnos(){
		return alumnoRepository.findAll();
	}		
	
	// create employee rest api
	@PostMapping("/alumnos")
	public Alumno createAlumno(@RequestBody Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	
	// get employee by id rest api
	@GetMapping("/alumnos/{clave}")
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long clave) {
		Alumno alumno = alumnoRepository.findById(clave)
				.orElseThrow(() -> new ResourceNotFoundException("Alumno not exist with id :" + clave));
		return ResponseEntity.ok(alumno);
	}
	
	// update employee rest api
	
	@PutMapping("/alumnos/{id}")
	public ResponseEntity<Alumno> updateAlumno(@PathVariable Long clave, @RequestBody Alumno alumnoDetails){
		Alumno alumno = alumnoRepository.findById(clave)
				.orElseThrow(() -> new ResourceNotFoundException("Alumno not exist with id :" + clave));
		
		alumno.setNombre(alumnoDetails.getNombre());
		alumno.setDireccion(alumnoDetails.getDireccion());
		alumno.setTelefono(alumnoDetails.getTelefono());
		
		Alumno updatedAlumno = alumnoRepository.save(alumno);
		return ResponseEntity.ok(updatedAlumno);
	}
	
	// delete employee rest api
	@DeleteMapping("/alumnos/{clave}")
	public ResponseEntity<Map<String, Boolean>> deleteAlumno(@PathVariable Long clave){
		Alumno alumno = alumnoRepository.findById(clave)
				.orElseThrow(() -> new ResourceNotFoundException("Alumno not exist with id :" + clave));
		
		alumnoRepository.delete(alumno);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
    
}
