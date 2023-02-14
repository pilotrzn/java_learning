package com.alex.polymorph.game;

public abstract class Hero {
    private String name;
    private int damage;

    private int health;
    private boolean isAlive;

    public abstract void attackEnemy(Enemy enemy);

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
