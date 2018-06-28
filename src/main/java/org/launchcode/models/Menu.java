package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {

        @Id
        @GeneratedValue
        private int id;

        @NotNull
        @Size(min=3, max=15)
        private String name;

        @ManyToMany
        private List<Cheese> cheeses = new ArrayList<>();

        public Menu() { }

        public Menu(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public List<Cheese> getCheeses() {
            return this.cheeses;
        }

        public void additem(Cheese item){
            this.cheeses.add(item);
        }

    }
