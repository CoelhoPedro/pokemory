package com.example.pedro.pokemory.model;

import com.example.pedro.pokemory.config.FirebaseConfiguration;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

public class User {

    private String id, name, email, password;

    public User(){

    }

    public void save() {
        DatabaseReference firebaseReference = FirebaseConfiguration.getFirebase();
        firebaseReference.child("usuarios").child(getId()).setValue(this);
    }

    @Exclude
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }


}
