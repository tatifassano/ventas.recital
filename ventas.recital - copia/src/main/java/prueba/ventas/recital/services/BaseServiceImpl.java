package prueba.ventas.recital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import prueba.ventas.recital.entities.Recital;
import prueba.ventas.recital.repositories.BaseRepository;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T> implements BaseService<T> {


    @Autowired
    protected BaseRepository<T> baseRepository;

    //public BaseServiceImpl(BaseRepository<T> baseRepository) {
       // this.baseRepository = baseRepository;
    //}

    @Override
    @Transactional
    public List<T> getAll() {
        return baseRepository.findAll();
    }

    @Override
    @Transactional
    public T getOne(int id) {
        Optional<T> entity = baseRepository.findById(id);
        return entity.get();
    }

    @Override
    @Transactional
    public T save(T entity) {
        T entityCreada = baseRepository.save(entity);
        return entityCreada;
    }

    @Override
    @Transactional
    public T update(int id, T entity) {
        Optional<T> entityBuscada = baseRepository.findById(id);
        T entityEncontrada = entityBuscada.get();
        entityEncontrada = baseRepository.save(entity);
        return entityEncontrada;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        if(baseRepository.existsById(id)){
            baseRepository.deleteById(id);
            return true;
        }
        else
        {
            return false;
        }
    }
}
