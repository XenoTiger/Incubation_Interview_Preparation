package structural.adapter;

public class WeightingMachineAdapterImpl implements WeightingMachineAdapter {

    private final WeightingMachine weightingMachine;

    public WeightingMachineAdapterImpl(WeightingMachine weightingMachine) {
        this.weightingMachine = weightingMachine;
    }

    @Override
    public double getWeightInKgs() {
        double weightInPounds = weightingMachine.getWeightInPound();
        return weightInPounds * .45;
    }
}
