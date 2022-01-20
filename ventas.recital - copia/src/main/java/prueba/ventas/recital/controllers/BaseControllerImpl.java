package prueba.ventas.recital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import prueba.ventas.recital.services.BaseServiceImpl;
import prueba.ventas.recital.utils.InvalidDataException;

import javax.validation.Valid;
import java.io.Serializable;

public abstract class BaseControllerImpl<T, S extends BaseServiceImpl<T>> implements BaseController<T> {

    @Autowired
    protected S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(servicio.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(servicio.getOne(id));
    }

    @PutMapping("/agregar")
    public ResponseEntity<?> save(@Valid @RequestBody T entity, BindingResult result) {
        if (result.hasErrors()) {
            throw new InvalidDataException(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.save(entity));
    }

    @PutMapping("/modificar/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody T entity) {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {

            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));

    }
}
