import java.util.*;
import java.util.stream.Collectors;


public class StreamDemo {
    public static void main(String[] args){
        List<Integer> myList=Arrays.asList(7, 18, 5, 10, 24, 17, 5, 7);
        long c=myList.stream().count();
        System.out.println(c);
        myList.stream()
        .distinct().forEach(e-> System.out.println(e));
        List<Integer> uniList= myList.stream().distinct().collect(Collectors.toList());

        uniList=myList.stream()
        .filter(n ->n%2==0)
        .collect(Collectors.toList());

        System.out.println(uniList);
        uniList= myList.stream()
        .sorted() 
        .collect(Collectors.toList());
        System.out.println("Sorted"+ uniList);

        uniList=myList.stream().sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        System.out.println("Sorted - reverse"+ uniList);
    }
}
