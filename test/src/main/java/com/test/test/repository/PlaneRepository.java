package  com.test.test.repository;

import  com.test.test.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Integer> {
    // Pas besoin d'ajouter des méthodes ici, JpaRepository fournit les méthodes de base
}
