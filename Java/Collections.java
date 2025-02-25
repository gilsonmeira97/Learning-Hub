import java.util.ArrayList;
import java.util.Collection;

class Collections {
    public static void main(String args[]) {
        Collection nums = new ArrayList();
        nums.add(5);
        nums.add(2);
        nums.add(9);

        for(Object n : nums) {
            System.out.println(n);
        }
    }
}