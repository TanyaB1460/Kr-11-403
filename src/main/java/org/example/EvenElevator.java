package org.example;

public class EvenElevator extends Elevator{
    public EvenElevator() {
        super();
    }

    @Override
    public String call() {
        if (state == ElevatorState.STAND) {
            state = ElevatorState.GOING_DOWN;
            setDestinationFloor(2);
            return "Вызван четный лифт";
        }
        return "Четный лифт занят";
    }
}
