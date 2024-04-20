package com.salesianos.actividad;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Menu {

    private static final ArrayList<Restaurante> RESTAURANTS = new ArrayList<>();

    public static void addRestaurant() {
        String name = JOptionPane.showInputDialog("Introduzca el nombre del restaurante a añadir:");
        if (Validacion.infoIsNull(name)) {
            JOptionPane.showMessageDialog(null, "Tiene que añadir alguna información", "error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String place = JOptionPane.showInputDialog("Introduzca el lugar del restaurante a añadir:");
        if (Validacion.infoIsNull(place)) {
            JOptionPane.showMessageDialog(null, "Tiene que añadir alguna información", "error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String schedule = JOptionPane.showInputDialog("Introduzca el horario que tendrá el restaurante a añadir:");
        if (Validacion.infoIsNull(schedule)) {
            JOptionPane.showMessageDialog(null, "Tiene que añadir alguna información", "error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String score = JOptionPane
                .showInputDialog("Introduce la puntuación que le han puesto al restaurante a añadir:");
        double originalScore = Integer.parseInt(score);

        Restaurante newRestaurant = new Restaurante(name, place, schedule, originalScore);

        RESTAURANTS.add(newRestaurant);

    }

    public static void modifyRestaurant(String name) {
        for (Restaurante restaurant : RESTAURANTS) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                String newName = JOptionPane.showInputDialog("Introduzca el nuevo nombre del restaurante:");
                if (Validacion.infoIsNull(newName)) {
                    JOptionPane.showMessageDialog(null, "Tiene que añadir alguna información", "error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                restaurant.setName(newName);
                String newPlace = JOptionPane.showInputDialog("Introduce el lugar dónde ahora está este restaurante:");
                if (Validacion.infoIsNull(newPlace)) {
                    JOptionPane.showMessageDialog(null, "Tiene que añadir alguna información", "error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                restaurant.setPlace(newPlace);
                String newSchedule = JOptionPane.showInputDialog("Introduce el nuevo horario del restaurante:");
                if (Validacion.infoIsNull(newSchedule)) {
                    JOptionPane.showMessageDialog(null, "Tiene que añadir alguna información", "error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                restaurant.setSchedule(newSchedule);
                String newScore = JOptionPane
                        .showInputDialog("Introduce la nueva puntuación que se le ha dado al restaurante");
                double realScore = Integer.parseInt(newScore);
                restaurant.setScore(realScore);
            } else {
                JOptionPane.showMessageDialog(null, "Lo siento el restaurante que busca no existe");
            }
        }
    }

    public static void showRestaurantsSortedByScore() {
        Collections.sort(RESTAURANTS,
                (restaurant, otherRestaurant) -> Double.compare(otherRestaurant.getScore(), restaurant.getScore()));
        String message = "-------------------------------------------------------------------- \n";
        for (Restaurante restaurant : RESTAURANTS) {
            message += restaurant.toString()
                    + "\n -------------------------------------------------------------------- \n";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public static void dropRestaurant(String name) {
        for (Restaurante restaurant : RESTAURANTS) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                RESTAURANTS.remove(restaurant);
            }
        }
    }

}
