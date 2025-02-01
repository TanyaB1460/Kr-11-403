package org.example;

public class Call implements CallInterface{
    private final ElevatorManager manager;

    public Call(ElevatorManager manager) {
        this.manager = manager;
    }

    @Override
    public void makeCall(int destinationFloor) {
        try {
            manager.processCall(destinationFloor);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
