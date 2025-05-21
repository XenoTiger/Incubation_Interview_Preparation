package structural.adapter;

public class AdapterClient {

    public static void main(String[] args) {
        WeightingMachineAdapter weightingMachineAdapter
                = new WeightingMachineAdapterImpl(new WeightingMachineForBabies());
        System.out.println( weightingMachineAdapter.getWeightInKgs());

    }
}
