//Lambda expressions in Java

/*
 * Functional Interface
 * Any interface with only one abstract method is called functional interface
 */
interface MaxFinder{
    public int max(int i,int j);
}
 public class MaxFinderTest{
    public static void main(String[] args){
        MaxFinder obj=new MaxFinderImpl();
        System.out.println(obj.max(12,22));

        MaxFinder obj1= (int i,int j)-> (i>j)? i:j
;
System.out.println(obj1.max(12, 22));
    }
 }

class MaxFinderImpl implements MaxFinder{
@Override
public int max(int i,int j){
    return (i>j)?i:j;
}
}