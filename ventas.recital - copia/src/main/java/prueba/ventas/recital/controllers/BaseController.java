package prueba.ventas.recital.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<T> {

    //ResponseEntity representa la respuesta HTTP completa: código de estado, encabezados y cuerpo . Como resultado, podemos usarlo para configurar completamente la respuesta HTTP.
    //ResponseEntity es un tipo genérico. En consecuencia, podemos usar cualquier tipo como cuerpo de respuesta:

    ResponseEntity<?> getAll();
    ResponseEntity<?> getOne(@PathVariable int id);
    ResponseEntity<?> save(@RequestBody T entity, BindingResult result);
    ResponseEntity<?> update(@PathVariable int id ,@RequestBody T entity);
    ResponseEntity<?> delete(@PathVariable int id);
}
