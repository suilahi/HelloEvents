package org.helloevent.backend.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.helloevent.backend.Entity.Role;

public class RegisterRequest {

    @NotBlank
    private String nom;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotNull
    private Role role;

    public RegisterRequest() {
    }

    public RegisterRequest(String nom, String email,String password,  Role role) {
        this.nom = nom;
//        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}