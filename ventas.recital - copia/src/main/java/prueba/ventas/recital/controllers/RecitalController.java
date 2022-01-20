package prueba.ventas.recital.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.ventas.recital.entities.Recital;
import prueba.ventas.recital.services.RecitalServiceImpl;

@RestController
@RequestMapping("/recitales")
public class RecitalController extends BaseControllerImpl<Recital, RecitalServiceImpl> {


    @GetMapping("/contar")
    public int contar(){
        return servicio.countAllByIdExists();
    }

}
