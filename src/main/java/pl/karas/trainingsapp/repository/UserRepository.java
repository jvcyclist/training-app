package pl.karas.trainingsapp.repository;


import org.springframework.data.repository.CrudRepository;
import pl.karas.trainingsapp.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
}
