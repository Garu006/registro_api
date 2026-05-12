package ni.edu.uam.registro_api.controladores;

import ni.edu.uam.registro_api.models.Carrera;
import ni.edu.uam.registro_api.servicios.CarreraServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carreras")
public class CarreraController {
    private final CarreraServicio carreraServicio;

    public CarreraController(CarreraServicio carreraServicio) {
        this.carreraServicio = carreraServicio;
    }

    @GetMapping
    public List<Carrera> getAllCarreras()
    {
        return this.carreraServicio.getAllCarreras();
    }

    public  Carrera getCarreraById(@PathVariable Long id) {
        return this.carreraServicio.getCarreraById(id);
    }

    @PostMapping
    public Carrera saveCarrera(@RequestBody Carrera carrera) {
        return carreraServicio.saveCarrera(carrera);
    }

    @PutMapping("/{id}")
    public Carrera updateCarrera(@PathVariable Long id, @RequestBody Carrera carrera) {
        carrera.setId(id);
        return carreraServicio.saveCarrera(carrera);
    }

    @DeleteMapping("/{id}")
    public void deleteCarrera(@PathVariable Long id) {
        carreraServicio.deleteCarreraById(id);
    }
}
