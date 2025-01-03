package org.codeforall.model;

import javax.persistence.*;

@Entity(name = "Family")
@Table(name = "family")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String familyName;
    private String phone;
    private String email;
    private String zipCode;
    private String pets;
    private String meal;
    private String description;
    private boolean available;


    public Family(String familyName, String email, String phone, String zipcode, String pets, String meal, String description, boolean available) {
        this.familyName = familyName;
        this.email = email;
        this.phone = phone;
        this.zipCode = zipcode;
        this.pets = pets;
        this.meal = meal;
        this.description = description;
        this.available = available;
    }

    public Family() {
    }

    //Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "name: " + familyName + "\n " +
                "meal: " + meal + "\n " +
                "pets: " + pets + "\n " +
                "phone: " + phone + "\n " +
                "email: " + email + "\n" +
                "zip-code: " + zipCode + "\n " +
                "description: " + description;
    }
}
