package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    void assertLocationEquals(Location expectedLocation, Location currentLocation) {
        assertEquals(expectedLocation.getLocationY(), currentLocation.getLocationX());
        assertEquals(expectedLocation.getLocationY(), currentLocation.getLocationY());
        assertEquals(expectedLocation.getDirection(), currentLocation.getDirection());
    }

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
}
