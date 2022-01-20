package prueba.ventas.recital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.ventas.recital.entities.Recital;
import prueba.ventas.recital.repositories.RecitalRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


public interface RecitalService extends BaseService<Recital>{

    int countAllByIdExists();

}
