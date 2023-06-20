import exceptions.InvalidOperationException;
import model.SingleLinkedListImpl;

public class Main {
    public static void main(String[] args) throws InvalidOperationException {

        var list = new SingleLinkedListImpl();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.insert(3, 3);
        list.remove(4);
//        System.out.println(list.pop());
        System.out.println(list);
    }
}