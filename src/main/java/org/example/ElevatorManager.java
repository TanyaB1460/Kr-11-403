package org.example;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<Elevator> elevators;

    public ElevatorManager() {
        elevators = new ArrayList<>();
    }

    public void addElevator(Elevator elevator) {
        elevators.add(elevator);
    }

    public void processCall(int destinationFloor) {
        for (Elevator elevator : elevators) {
            if (elevator.state() == ElevatorState.STAND) {
                elevator.setDestinationFloor(destinationFloor);
                System.out.println(elevator.call());
                return;
            }
        }
        throw new RuntimeException("Лифты заняты");
    }

    public void moveElevators() {
        for (Elevator elevator : elevators) {
            elevator.move();
        }
    }
}
