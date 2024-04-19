package com.salesianos.actividad;

public class Validacion {
    public static boolean infoIsNull(String element) {
        if (element == null || element.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
