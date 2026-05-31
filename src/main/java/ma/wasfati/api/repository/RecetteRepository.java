package ma.wasfati.api.repository;

import ma.wasfati.api.entity.Recette;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetteRepository extends JpaRepository<Recette, Long> {

    Page<Recette> findByTitreContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrIngredientsNomContainingIgnoreCase(
            String titre, String description, String ingredientNom, Pageable pageable);
}
