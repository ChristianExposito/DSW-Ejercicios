package com.tuproyecto.repositories; // Ajusta según tu paquete base

import com.tuproyecto.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    // Aquí tendrás disponibles todos los métodos CRUD automáticamente (save, findAll, findById, delete, etc.)
}