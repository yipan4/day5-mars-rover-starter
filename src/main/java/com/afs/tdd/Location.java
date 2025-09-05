package com.afs.tdd;

public class Location {
    private int locationX;
    private int locationY;
    private Direction direction;
    Location() {
        this.locationX = 0;
        this.locationY = 0;
        this.direction = Direction.N;
    }
    Location(Direction direction) {
        this.locationX = 0;
        this.locationY = 0;
        this.direction = direction;
    }
    Location(int x, int y, Direction direction) {
        this.locationX = x;
        this.locationY = y;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
