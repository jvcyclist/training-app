package pl.karas.trainingsapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Integer user_id;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="mail_address")
    private String mail_address;
    @Column(name="is_coach")
    private Boolean is_coach;
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="user_id",insertable = false,updatable = false)
    @JsonIgnore
    private User reports_to;

    public User() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMail_address() {
        return mail_address;
    }

    public void setMail_address(String mail_address) {
        this.mail_address = mail_address;
    }

    public Boolean getIs_coach() {
        return is_coach;
    }

    public void setIs_coach(Boolean is_coach) {
        this.is_coach = is_coach;
    }

    public User getReports_to() {
        return reports_to;
    }

    public void setReports_to(User reports_to) {
        this.reports_to = reports_to;
    }
}
