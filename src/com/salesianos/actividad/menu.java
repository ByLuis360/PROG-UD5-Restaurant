package com.salesianos.actividad;

import java.util.ArrayList;

public class menu {
    private static final ArrayList<Restaurante> RESTAURANTS = new ArrayList<>();

    public static void addRestaurant(Restaurante newRestaurant){
        RESTAURANTS.add(newRestaurant);
    }
    
}
