package prueba.ventas.recital.services;

import org.springframework.validation.BindingResult;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

    List<T> getAll();
    T getOne(int id);
    T save(T entity);
    T update(int id, T entity);
    boolean delete(int id);
}
