package com.co.rodriguez.usuarios.MicroservicioUsuarios.service;

import java.util.Optional;

import com.co.rodriguez.usuarios.MicroservicioUsuarios.entity.Alumno;

public interface AlumnoService {
	
	public Iterable<Alumno> findAll();
	
	public Optional <Alumno> findById(Long id);
	
	public Alumno save(Alumno alumno);
	
	public void deleteById(Long id);
}
