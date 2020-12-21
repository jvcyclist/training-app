package pl.karas.trainingsapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karas.trainingsapp.model.TrainingType;
import pl.karas.trainingsapp.model.TrainingUnit;
import pl.karas.trainingsapp.model.User;
import pl.karas.trainingsapp.repository.TrainingTypeRepository;
import pl.karas.trainingsapp.repository.TrainingUnitRepository;
import pl.karas.trainingsapp.repository.UserRepository;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController("/api")
public class AppController {

    UserRepository userRepository;
    TrainingTypeRepository trainingTypeRepository;
    TrainingUnitRepository trainingUnitRepository;

    @Autowired
    public AppController(UserRepository userRepository,
                         TrainingTypeRepository trainingTypeRepository,
                         TrainingUnitRepository trainingUnitRepository) {
        this.userRepository=userRepository;
        this.trainingTypeRepository=trainingTypeRepository;
        this.trainingUnitRepository=trainingUnitRepository;
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/trainingtypes")
    public Iterable<TrainingType> getAllTrainingTypes(){
        return trainingTypeRepository.findAll();
    }

    @GetMapping("/trainings")
    public Iterable<TrainingUnit> getAllTrainings(){
        return trainingUnitRepository.findAll();
    }


}
