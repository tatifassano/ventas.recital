package prueba.ventas.recital.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Entity
@Table(name = "recitales")
@Data
public class Recital implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "nombre_artista")
    @NotEmpty(message = "el nombre no puede estar vacio")
    private String artista;


    @Positive(message = "el precio de la entrada debe tener un valor mayor a 0")
    @Column(name = "precio_entrada")
    private int precioEntrada;


    @Column(name = "capacidad_local")
    @Min(150)
    private int capacidad;


    @Column(name = "cancelada")
    @Value("false")
    private boolean cancelada;


    @Column(name = "ocupacion")
    @Value("0")
    private int ocupacion;

}
