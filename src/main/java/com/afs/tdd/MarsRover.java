package com.afs.tdd;

import java.util.*;

public class MarsRover {
    private final Location location;

    MarsRover() {
        this.location = new Location();
    }

    MarsRover(Location location) {
        this.location = location;
    }

    private void move() {
        Direction direction = this.location.getDirection();
        switch (direction) {
            case N: {
                this.location.setLocationY(location.getLocationY()+1);
                break;
            }
            case W: {
                this.location.setLocationX(location.getLocationX()-1);
                break;
            }
            case S: {
                this.location.setLocationY(location.getLocationY()-1);
                break;
            }
            case E: {
                this.location.setLocationX(location.getLocationX()+1);
                break;
            }
        }
    }

    private void turnLeft() {
        Direction direction = this.location.getDirection();
        switch (direction) {
            case N: {
                this.location.setDirection(Direction.W);
                break;
            }
            case W: {
                this.location.setDirection(Direction.S);
                break;
            }
            case S: {
                this.location.setDirection(Direction.E);
                break;
            }
            case E: {
                this.location.setDirection(Direction.N);
                break;
            }
        }
    }

    private void turnRight() {
        Direction direction = this.location.getDirection();
        switch (direction) {
            case N: {
                this.location.setDirection(Direction.E);
                break;
            }
            case E: {
                this.location.setDirection(Direction.S);
                break;
            }
            case S: {
                this.location.setDirection(Direction.W);
                break;
            }
            case W: {
                this.location.setDirection(Direction.N);
                break;
            }
        }
    }

    private void executeSingleCommand(String command) {
        switch (command) {
            case "M": {
                move();
                break;
            }
            case "L": {
                turnLeft();
                break;
            }
            case "R": {
                turnRight();
                break;
            }
        }
    }

    public Location ExecuteBatchCommand(String commands) {
        Arrays.asList(commands.split("")).forEach(this::executeSingleCommand);
        return this.location;
    }
}
