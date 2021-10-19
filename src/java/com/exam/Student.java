package com.exam;
// Generated Feb 24, 2019 12:44:42 AM by Hibernate Tools 4.3.1

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

    private Integer stid;
    private String name;
    @NotEmpty
    @Pattern(regexp = "[a-zA-Z0-9_]+[@][a-z]+[.][a-z]{2,3}$", message = "invalid email")
    private String email;
    private String password;
    private String round;
    private String gender;
    private String skill;
    private String dob;

    public Student() {
    }

    public Student(String name, String email, String password, String round, String gender, String skill, String dob) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.round = round;
        this.gender = gender;
        this.skill = skill;
        this.dob = dob;
    }

    public Integer getStid() {
        return this.stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRound() {
        return this.round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkill() {
        return this.skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}