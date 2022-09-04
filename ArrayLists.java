import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        /* add */
        list.add(9);
        list.add(5);
        list.add(2);
        System.out.println(list);

        /* add element in any index */
        list.add(0,3);
        System.out.println(list);

        /* get */
        System.out.println(list.get(1));

        /* set */
        list.set(0,1);
        System.out.println(list);

        /* remove */
        list.remove(0);
        System.out.println(list);

        /* size*/
        System.out.println(list.size());

        /* for loop */
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        /* sorting */
        Collections.sort(list);
        System.out.println(list);
    }
}
