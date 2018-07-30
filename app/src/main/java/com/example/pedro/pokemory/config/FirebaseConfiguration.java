package com.example.pedro.pokemory.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseConfiguration {

    private static DatabaseReference firebaseReference;
    private static FirebaseAuth autentication;

    public static DatabaseReference getFirebase(){

        if(firebaseReference == null) firebaseReference = FirebaseDatabase.getInstance().getReference();

        return firebaseReference;
    }

    public static FirebaseAuth getFirebaseAutention(){

        if(autentication == null) autentication = FirebaseAuth.getInstance();

        return autentication;
    }

}
