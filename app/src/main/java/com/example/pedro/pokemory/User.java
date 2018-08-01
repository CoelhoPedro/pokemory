package com.example.pedro.pokemory;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

public class User {

    private String email, password, name, id;

    public User() {
    }

    public void saveUser(){
        DatabaseReference firebaseReference = FirebaseSettings.getFirebase();
        firebaseReference.child("users").child(getId()).setValue(this);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Exclude
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
