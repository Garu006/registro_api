package ni.edu.uam.registro_api.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Carreras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private Long id;

    @Column(name = "nombre_carrera", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion_carrera", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "costos_carrera", nullable = false)
    private double precio;
}
