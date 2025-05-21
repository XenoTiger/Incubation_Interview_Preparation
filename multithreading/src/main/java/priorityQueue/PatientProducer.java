package priorityQueue;

import java.util.PriorityQueue;
import java.util.Random;

public class PatientProducer implements Runnable {
    private final PriorityQueue<Patient> emergencyRoom;

    private final Random random = new Random();

    public PatientProducer(PriorityQueue<Patient> emergencyRoom) {
        this.emergencyRoom = emergencyRoom;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String name = "Patient-" + i;
                int severity = random.nextInt(5) + 1;
                Patient patient = new Patient(name, severity);

                synchronized (emergencyRoom) {
                    emergencyRoom.offer(patient); // Add patient to the queue
                    System.out.println("Arrived: " + patient);
                    emergencyRoom.notify(); // Notify the consumer that a new patient has arrived
                }
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
