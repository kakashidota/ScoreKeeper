package com.example.kakashi.scorekeeper;

/**
 * Created by Kakashi on 24/10/17.
 */

class User {

    private String name;
    private String title;
    private int uskados;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUskados() {
        return uskados;
    }

    public void setUskados(int uskados) {
        this.uskados = uskados;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addUskados(int d){
        uskados = uskados + d;
    }

}
