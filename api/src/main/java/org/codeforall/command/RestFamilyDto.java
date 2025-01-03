package org.codeforall.command;


import org.springframework.stereotype.Service;

import javax.validation.constraints.*;

@Service
public class RestFamilyDto {
    private Integer id;

    @NotNull(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    @Size(min=3, max=64)
    private String familyName;
    @Pattern(regexp = "^\\+?[0-9]*$", message = "phone has invalid characters")
    @Size(min=9, max=16)
    private String phone;
    @Email
    private String email;

    @Pattern(regexp = "^\\d{4}-\\d{3}$", message = "zip-code invalid")
    private String zipCode;
    @NotNull(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    @Size(min=3, max=64)
    private String pets;
    @NotNull(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    @Size(min=3, max=64)
    private String meal;
    @NotBlank(message = "You should describe your a little bit your family(e.g: hobbies, meals, pets, etc")
    @Size(max= 10000)
    private String description;
    private boolean available;


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
