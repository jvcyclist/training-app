package pl.karas.trainingsapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.karas.trainingsapp.model.TrainingUnit;

public interface TrainingUnitRepository extends CrudRepository<TrainingUnit,Integer> {
}
