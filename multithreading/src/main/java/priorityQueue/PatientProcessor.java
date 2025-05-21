package priorityQueue;

import java.util.PriorityQueue;

public class PatientProcessor implements Runnable {

    private final PriorityQueue<Patient> emergencyRoom;

    public PatientProcessor(PriorityQueue<Patient> emergencyRoom) {
        this.emergencyRoom = emergencyRoom;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Patient patient;
                synchronized (emergencyRoom) {
                    while (emergencyRoom.isEmpty()) {
                        emergencyRoom.wait();
                    }
                    patient = emergencyRoom.poll(); // Retrieve the highest-priority patient
                }
                System.out.println("Processing patient: " + patient);
                Thread.sleep(500);

                if (patient.getName().equals("Patient-10")) {
                    break; // Exit after processing the last patient
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
