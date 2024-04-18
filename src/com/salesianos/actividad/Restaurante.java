package com.salesianos.actividad;

public class Restaurante {
    private String name;
    private String place;
    private String schedule;
    private double score;

    public Restaurante(String name, String place, String schedule, double score) {
        this.name = name;
        this.place = place;
        this.schedule = schedule;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSchedule() {
        return this.schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        String message = "El nombre del restaurante es " + this.name + ", se encuentra en " + this.place
                + " y el horario para ir al restaurante es de " + this.schedule
                + ". Este restaurnate ha recibidio una puntuación de " + this.score;
        return message;
    }
}
