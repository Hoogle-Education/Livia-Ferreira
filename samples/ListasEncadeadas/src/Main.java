import model.LinkedListWithoutLastReference;

public class Main {
    public static void main(String[] args) {
        LinkedListWithoutLastReference myList = new LinkedListWithoutLastReference();

        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        System.out.println("empty = " + myList.isEmpty());
        System.out.println("size = " + myList.size());
        System.out.println("should be 4 = " + myList.get(2));
    }
}