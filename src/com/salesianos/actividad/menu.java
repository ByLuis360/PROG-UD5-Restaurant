package com.salesianos.actividad;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
    private static final ArrayList<Restaurante> RESTAURANTS = new ArrayList<>();

    public static void addRestaurant(Restaurante newRestaurant){
        RESTAURANTS.add(newRestaurant);
    }
    
    public static void modifyRestaurant(String name) {
        for (Restaurante restaurant : RESTAURANTS) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                String newName = JOptionPane.showInputDialog("Introduzca el nuevo nombre del restaurante:");
                restaurant.setName(newName);
                String newPlace = JOptionPane.showInputDialog("Introduce el lugar dónde ahora está este restaurante:");
                restaurant.setPlace(newPlace);
                String newSchedule = JOptionPane.showInputDialog("Introduce el nuevo horario del restaurante:");
                restaurant.setSchedule(newSchedule);
                String score = JOptionPane.showInputDialog("Introduce la nueva puntuación que se le ha dado al restaurante");
                double realScore = Integer.parseInt(score); 
                restaurant.setScore(realScore);               
            }
        }
    }
}
