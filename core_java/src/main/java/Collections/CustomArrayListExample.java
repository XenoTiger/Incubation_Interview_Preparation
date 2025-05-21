package Collections;

public class CustomArrayListExample {

    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.addElement(1);
        customArrayList.addElement(2);
        customArrayList.addElement(3);

        customArrayList.traverseList();

        System.out.println("Getting element: " + customArrayList.getElement(2));
    }
}
