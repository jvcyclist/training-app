package pl.karas.trainingsapp.model;

import java.util.Date;

public class TrainingFeedback {
    private Integer training_feedback_id;
    private Boolean is_visible;
    private String content;
    private Date feedback_date_time;
    private TrainingUnit trainingUnit;
    private User createdBy;
}
