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
