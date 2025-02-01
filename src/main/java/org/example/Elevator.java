package org.example;

public abstract class Elevator implements ElevatorStateInterface{
    protected ElevatorState state;
    protected  int currentFloor;
    protected Integer destinationFloor;

    public Elevator() {
        this.state = ElevatorState.STAND;
        this.currentFloor = 1;
        this.destinationFloor = null;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setDestinationFloor(Integer floor) {
        this.destinationFloor = floor;
    }

    public abstract String call();

    @Override
    public ElevatorState state() {
        return state;
    }

    public void move() {
        if (destinationFloor != null) {
            if (currentFloor < destinationFloor) {
                state = ElevatorState.GOING_UP;
                currentFloor++;
            } else if (currentFloor > destinationFloor) {
                state = ElevatorState.GOING_DOWN;
                currentFloor--;
            }
            if (currentFloor == destinationFloor) {
                state = ElevatorState.STAND;
                destinationFloor = null;
            }
        }
    }
}
