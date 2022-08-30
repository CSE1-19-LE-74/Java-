import java.util.*;
 
class GFG {
 
    public static void print(int array[])
    {
 
        System.out.print("Array: [ ");
 
        for (int i = 0; i < 5; i++)
            System.out.print(array[i] + " ");
 
        System.out.print("]");
    }
   
    public static void main(String[] args)
    {
        ArrayList<String> arrayList
            = new ArrayList<String>();

        arrayList.add("Iust");
        arrayList.add("Live");
        arrayList.add("Awntipora");
 
        int array[] = { 10, 3, 5, 11, 20 };
 
    Arrays.sort(array);
 
        System.out.println("ArrayList: " + arrayList);
 
        print(array);
    }
}
