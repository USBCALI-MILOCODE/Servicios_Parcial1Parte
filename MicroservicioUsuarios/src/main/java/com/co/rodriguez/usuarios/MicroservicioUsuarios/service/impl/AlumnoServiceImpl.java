package com.co.rodriguez.usuarios.MicroservicioUsuarios.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.rodriguez.usuarios.MicroservicioUsuarios.entity.Alumno;
import com.co.rodriguez.usuarios.MicroservicioUsuarios.repository.AlumnoRepository;
import com.co.rodriguez.usuarios.MicroservicioUsuarios.service.AlumnoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AlumnoServiceImpl implements AlumnoService {

	private AlumnoRepository alumnoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll() {
		return alumnoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findById(Long id) {
		return alumnoRepository.findById(id);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		alumnoRepository.deleteById(id);
	}

}
