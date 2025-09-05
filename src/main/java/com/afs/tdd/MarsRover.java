package com.afs.tdd;

import java.util.*;

public class MarsRover {
    private Location location;

    MarsRover() {
        this.location = new Location();
    }

    MarsRover(Location location) {
        this.location = location;
    }

    private void Move() {

    }

    private void TurnLeft() {

    }

    private void TurnRight() {

    }

    private void ExecuteSingleCommand(String command) {
        switch (command) {
            case "M": {
                Move();
            }
            case "L": {
                TurnLeft();
            }
            case "R": {
                TurnRight();
            }
        }
    }

    public Location ExecuteBatchCommand(String commands) {
        Arrays.asList(commands.split("")).forEach(this::ExecuteSingleCommand);
        return this.location;
    }
}
