package priorityQueue;

public class Patient {

    private final String name;

    private final Integer severity;

    public Patient(String name, Integer severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public Integer getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", severity=" + severity +
                '}';
    }
}
