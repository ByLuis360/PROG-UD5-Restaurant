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

    
}
