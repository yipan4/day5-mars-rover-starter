package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    void assertLocationEquals(Location expectedLocation, Location currentLocation) {
        assertEquals(expectedLocation.getLocationX(), currentLocation.getLocationX());
        assertEquals(expectedLocation.getLocationY(), currentLocation.getLocationY());
        assertEquals(expectedLocation.getDirection(), currentLocation.getDirection());
    }

    // Turn Left
    @Test
    void should_face_N_when_turnLeft_given_E() {
        // Given
        Location location = new Location(Direction.E);
        // When
        String command = "L";
        // Expect
        Location expectedLocation = new Location(0,0,Direction.N);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_face_W_when_turnLeft_given_N() {
        // Given
        Location location = new Location(Direction.N);
        // When
        String command = "L";
        // Expect
        Location expectedLocation = new Location(0,0,Direction.W);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_face_S_when_turnLeft_given_W() {
        // Given
        Location location = new Location(Direction.W);
        // When
        String command = "L";
        // Expect
        Location expectedLocation = new Location(0,0,Direction.S);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_face_E_when_turnLeft_given_S() {
        // Given
        Location location = new Location(Direction.S);
        // When
        String command = "L";
        // Expect
        Location expectedLocation = new Location(0,0,Direction.E);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    // Turn right
    @Test
    void should_face_W_when_turnRight_given_S() {
        // Given
        Location location = new Location(Direction.S);
        // When
        String command = "R";
        // Expect
        Location expectedLocation = new Location(0,0,Direction.W);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_face_S_when_turnRight_given_E() {
        // Given
        Location location = new Location(Direction.E);
        // When
        String command = "R";
        // Expect
        Location expectedLocation = new Location(0,0,Direction.S);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_face_E_when_turnRight_given_N() {
        // Given
        Location location = new Location(Direction.N);
        // When
        String command = "R";
        // Expect
        Location expectedLocation = new Location(0,0,Direction.E);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_face_N_when_turnRight_given_W() {
        // Given
        Location location = new Location(Direction.W);
        // When
        String command = "R";
        // Expect
        Location expectedLocation = new Location(0,0,Direction.N);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    // Move
    @Test
    void should_at_0_1_N_when_move_given_0_0_N() {
        // Given
        Location location = new Location(Direction.N);
        // When
        String command = "M";
        // Expect
        Location expectedLocation = new Location(0,1,Direction.N);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_at_1_0_E_when_move_given_0_0_E() {
        // Given
        Location location = new Location(Direction.E);
        // When
        String command = "M";
        // Expect
        Location expectedLocation = new Location(1,0,Direction.E);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_at_0_neg1_S_when_move_given_0_0_S() {
        // Given
        Location location = new Location(Direction.S);
        // When
        String command = "M";
        // Expect
        Location expectedLocation = new Location(0,-1,Direction.S);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }

    @Test
    void should_at_neg1_0_W_when_move_given_0_0_W() {
        // Given
        Location location = new Location(Direction.W);
        // When
        String command = "M";
        // Expect
        Location expectedLocation = new Location(-1,0,Direction.W);
        MarsRover marsRover = new MarsRover(location);
        Location currentLocation = marsRover.ExecuteBatchCommand(command);
        assertLocationEquals(expectedLocation, currentLocation);
    }
}
