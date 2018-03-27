package com.example.alasdair.myapplication.main;

/**
 * Created by alasdair on 12.03.18.
 */

public class LearningGroup {
    private int number;
    private String name;
    private String topic;

    public LearningGroup(int number, String name, String topic) {
        this.number = number;
        this.name = name;
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "LearningGroup{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
