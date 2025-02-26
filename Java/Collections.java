import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

class Collections {
    public static void main(String args[]) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        
        for(Object n : nums) {
            //System.out.println(n);
        }

        List<Integer> newNums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> s1 = newNums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

        s2.forEach(System.out::println);
    }
}