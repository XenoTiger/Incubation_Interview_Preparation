package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HospitalExample {

    public static void main(String[] args) {

        PriorityQueue<Patient> priorityQueue
                = new PriorityQueue<>(Comparator.comparing(Patient::getSeverity));

        Thread producer = new Thread(new PatientProducer(priorityQueue));
        Thread consumer = new Thread(new PatientProcessor(priorityQueue));

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
