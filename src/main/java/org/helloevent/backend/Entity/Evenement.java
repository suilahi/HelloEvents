package org.helloevent.backend.Entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;
@Entity
public class Evenement {


        @jakarta.persistence.Id
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String titre;
        private String description;
        private String date;
        private String lieu;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private Categorie categorie;

        @OneToMany(mappedBy = "evenement")
        private List<Reservation> reservations;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getLieu() {
            return lieu;
        }

        public void setLieu(String lieu) {
            this.lieu = lieu;
        }


        public List<Reservation> getReservations() {
            return reservations;
        }

        public void setReservations(List<Reservation> reservations) {
            this.reservations = reservations;
        }

        public Categorie getCategorie() {
            return categorie;
        }

        public void setCategorie(Categorie categorie) {
            this.categorie = categorie;
        }
    }
