package org.example;

import java.util.Random;

public class ElevatorDynamic {
    private final ElevatorManager manager;

    public ElevatorDynamic(ElevatorManager manager) {
        this.manager = manager;
    }

    public void run(int steps) {
        Random random = new Random();
        for (int i = 0; i < steps; i++) {
            manager.moveElevators();
            if (i % 20 == 0) {
                int destinationFloor = random.nextInt(10) + 1;

                System.out.println("Вызов " + destinationFloor + " этажа");
                Call call = new Call(manager);
                call.makeCall(destinationFloor);
            }
        }
    }
}
