package Christian.Animales.services;

import Christian.Animales.models.Animal;
import org.springframework.stereotype.Service; // <- Asegúrate de importar esto

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    private final List<Animal> animales = new ArrayList<>();

    public AnimalService(){
        animales.add(new Animal(1, "dodo", 30, true));
        animales.add(new Animal(2, "tortuga", 100, false));
        animales.add(new Animal(3, "Lince", 15, false));
    }

    public List<Animal> findAll(){
        return animales;
    }
}