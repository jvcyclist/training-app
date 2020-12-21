package pl.karas.trainingsapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.karas.trainingsapp.model.TrainingType;

public interface TrainingTypeRepository extends CrudRepository<TrainingType,Integer> {
}
