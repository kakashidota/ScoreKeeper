package com.example.kakashi.scorekeeper;

/**
 * Created by Kakashi on 24/10/17.
 */

public class EngineClass {

    private String task;
    private int value;

    public void setTask(String task) {
        this.task = task;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getTask() {
        return task;
    }
}
