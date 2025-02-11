package com.co.rodriguez.usuarios.MicroservicioUsuarios.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.rodriguez.usuarios.MicroservicioUsuarios.entity.Alumno;
import com.co.rodriguez.usuarios.MicroservicioUsuarios.service.AlumnoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class AlumnoController {

	private AlumnoService alumnoService;

	@GetMapping
	public ResponseEntity<?> listarAlumno() {
		return ResponseEntity.ok().body(alumnoService.findAll());
	}

	public ResponseEntity<?> ver(@PathVariable Long id) {
		Optional<Alumno> ob = alumnoService.findById(id);

		if (ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok().body(ob.get());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {
        
		Optional<Alumno> ob = alumnoService.findById(id);

        if (ob.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Alumno alumnoBd = ob.get();
        alumnoBd.setNombre(alumno.getNombre());
        alumnoBd.setApellido(alumno.getApellido());
        alumnoBd.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumnoBd));
    }
	
	@DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        alumnoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
