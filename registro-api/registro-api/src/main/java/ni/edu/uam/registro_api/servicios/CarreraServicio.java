package ni.edu.uam.registro_api.servicios;


import ni.edu.uam.registro_api.models.Carrera;
import ni.edu.uam.registro_api.repository.CarreraRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServicio {
    private final CarreraRepo carreraRepo;

    public CarreraServicio(CarreraRepo carreraRepo) {
        this.carreraRepo = carreraRepo;
    }

    public List<Carrera> getAllCarreras(){
        return carreraRepo.findAll();
    }

    public Carrera getCarreraById(Long id){
        return carreraRepo.findById(id).orElse(null);
    }

    public void deleteCarreraById(long id){
        carreraRepo.deleteById(id);
    }

    public Carrera saveCarrera(Carrera carrera) {
        return carreraRepo.save(carrera);
    }
}
