package prueba.ventas.recital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import prueba.ventas.recital.entities.Recital;

import java.util.List;

@Repository
public interface RecitalRepository extends BaseRepository<Recital>{

    @Query("select count(r) from Recital r" )
    int countAllByIdExists();

}
