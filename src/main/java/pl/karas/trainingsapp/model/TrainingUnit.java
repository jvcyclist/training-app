package pl.karas.trainingsapp.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "training_units")
public class TrainingUnit {

    @Id
    @GeneratedValue
    @Column(name = "training_unit_id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User created_by;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assigned_to;


    @ManyToOne
    @JoinColumn(name = "training_type")
    private TrainingType training_type;

    @Column(name = "training_date")
    private Date training_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreated_by() {
        return created_by;
    }

    public void setCreated_by(User created_by) {
        this.created_by = created_by;
    }

    public User getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(User assigned_to) {
        this.assigned_to = assigned_to;
    }

    public TrainingType getTraining_type() {
        return training_type;
    }

    public void setTraining_type(TrainingType training_type) {
        this.training_type = training_type;
    }

    public Date getTraining_date() {
        return training_date;
    }

    public void setTraining_date(Date training_date) {
        this.training_date = training_date;
    }
}
