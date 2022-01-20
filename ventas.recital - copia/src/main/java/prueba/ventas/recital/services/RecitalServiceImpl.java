package prueba.ventas.recital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.ventas.recital.entities.Recital;
import prueba.ventas.recital.repositories.BaseRepository;
import prueba.ventas.recital.repositories.RecitalRepository;

@Service
public class RecitalServiceImpl extends BaseServiceImpl<Recital> implements RecitalService {

    @Autowired
    private RecitalRepository recitalRepository;

    /*public RecitalServiceImpl(BaseRepository<Recital> baseRepository) {
      super(baseRepository);
    }*/

    @Override
    public int countAllByIdExists() {
        return recitalRepository.countAllByIdExists();
    }
}
