package com.salesianos.actividad;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
    private static final ArrayList<Restaurante> RESTAURANTS = new ArrayList<>();

    public static void addRestaurant(Restaurante newRestaurant){
        RESTAURANTS.add(newRestaurant);
    }
    

    public static Restaurante setInfoToNewRestaurant(){
        String name = JOptionPane.showInputDialog("Introduzca el nombre del restaurante a añadir:");
        String place = JOptionPane.showInputDialog("Introduzca el lugar del restaurante a añadir:");
        String schedule = JOptionPane.showInputDialog("Introduzca el horario que tendrá el restaurante a añadir:");
        String score = JOptionPane.showInputDialog("Introduce la puntuación que le han puesto al restaurante a añadir:");
        double originalScore = Integer.parseInt(score);

        Restaurante newRestaurant = new Restaurante(name, place, schedule, originalScore);

        return newRestaurant;
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
                String newScore = JOptionPane.showInputDialog("Introduce la nueva puntuación que se le ha dado al restaurante");
                double realScore = Integer.parseInt(newScore); 
                restaurant.setScore(realScore);               
            }
        }
    }

    public static void dropRestaurant(String name){
        for (Restaurante restaurant : RESTAURANTS) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                RESTAURANTS.remove(restaurant);
            }
        }
    }

}
