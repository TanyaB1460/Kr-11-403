package org.example;

public class PersonElevator extends Elevator{
    public PersonElevator() {
        super();
    }

    @Override
    public String call() {
        if (state == ElevatorState.STAND) {
            state = ElevatorState.GOING_UP;
            setDestinationFloor(4);
            return "Вызван лифт для сотрудников";
        }
        return "Лифт для сотрудников занят";
    }

}
