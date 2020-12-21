package pl.karas.trainingsapp.model;


import javax.persistence.*;

@Table(name = "training_types")
@Entity
public class TrainingType {
    @Id
    @GeneratedValue
    @Column(name = "training_type_id")
    private Integer training_type_id;
    @Column(name = "name")
    private String name;

    public Integer getTraining_type_id() {
        return training_type_id;
    }

    public void setTraining_type_id(Integer training_type_id) {
        this.training_type_id = training_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
