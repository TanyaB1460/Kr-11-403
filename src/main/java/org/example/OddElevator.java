package org.example;

public class OddElevator extends Elevator {
    public OddElevator() {
        super();
    }

    @Override
    public String call() {
        if (state == ElevatorState.STAND) {
            state = ElevatorState.GOING_UP;
            setDestinationFloor(3);
            return "Вызван нечетный лифт";
        }
        return "Нечетный лифт занят";
    }
}
