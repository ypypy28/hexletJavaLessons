package com.lesson;

public class House {
    private Human human;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getOwnerName() {
        return human.getName();
    }
}
