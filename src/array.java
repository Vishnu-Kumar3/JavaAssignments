import java.util.*;
public class array
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(2, 5);
        arr.addFirst(9);
        arr.addLast(0);
        System.out.println(arr.contains(5));
        System.out.println(arr);
    }
}