package com.company.day4;
import java.util.ArrayList;

public class Collections_ArrayList {

    public static void main(String[] args) {
        // An ArrayList allows us to define a resizable array object to suit our needs
        // You don't have to define a size at object instantiation
        // ArrayList -> 0(1)

        //1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        /*ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("blue");
        myArrayList.add("orange");
        myArrayList.add("yellow");
        myArrayList.add("green");
        System.out.println(myArrayList);*/
        //2. Write a Java program to iterate through all elements in an array list.
        /*ArrayList<String> myArrayList2 = new ArrayList<String>();
        myArrayList2.add("blue");
        myArrayList2.add("orange");
        myArrayList2.add("yellow");
        for (String colors : myArrayList2) {
            System.out.println(colors);
        }*/
        //3. Write a Java program to insert an element into the array list at the first position.
        /*ArrayList<Integer> myArrayListNum = new ArrayList<Integer>();
        myArrayListNum.add(100);
        myArrayListNum.add(50);
        myArrayListNum.add(11);
        myArrayListNum.add(101);
        myArrayListNum.add(0,15);
        System.out.println(myArrayListNum);*/
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        /*ArrayList<Integer> myArrayListNum1 = new ArrayList<Integer>();
        myArrayListNum1.add(100);
        myArrayListNum1.add(50);
        myArrayListNum1.add(11);
        myArrayListNum1.add(101);
        System.out.println(myArrayListNum1.get(3));*/
        //5. Write a Java program to update specific array element by given element.
        /*ArrayList<Integer> myArrayListNum2 = new ArrayList<Integer>();
        myArrayListNum2.add(100);
        myArrayListNum2.add(50);
        myArrayListNum2.add(11);
        myArrayListNum2.add(101);
        myArrayListNum2.set(2,150);
        System.out.println(myArrayListNum2);*/
        //6. Write a Java program to remove the third element from an array list.
        /*ArrayList<Integer> myArrayListNum2 = new ArrayList<Integer>();
        myArrayListNum2.add(100);
        myArrayListNum2.add(50);
        myArrayListNum2.add(11);
        myArrayListNum2.add(101);
        System.out.println(myArrayListNum2);
        myArrayListNum2.remove(2);
        System.out.println(myArrayListNum2);*/
        //7. Write a Java program to search an element in an array list.
        /*ArrayList<Integer> myArrayListNum3 = new ArrayList<Integer>();
        myArrayListNum3.add(100);
        myArrayListNum3.add(50);
        myArrayListNum3.add(15);
        myArrayListNum3.add(11);
        myArrayListNum3.add(101);
        if (myArrayListNum3.contains(15)) {
            System.out.println("Found the element");
        } else System.out.println("Element not found");*/
        //8. Write a Java program to sort a given array list.
        /*ArrayList<Integer> myArrayListNum4 = new ArrayList<Integer>();
        myArrayListNum4.add(100);
        myArrayListNum4.add(50);
        myArrayListNum4.add(15);
        myArrayListNum4.add(11);
        myArrayListNum4.add(101);
        System.out.println(myArrayListNum4);
        Collections.sort(myArrayListNum4);
        System.out.println(myArrayListNum4);*/
        //9. Write a Java program to copy one array list into another.
        /*ArrayList<String> myArrayListNum5 = new ArrayList<String>();
        myArrayListNum5.add("Monday");
        myArrayListNum5.add("Tuesday");
        myArrayListNum5.add("Wednesday");
        myArrayListNum5.add("Thursday");
        myArrayListNum5.add("Friday");
        ArrayList<String> myArrayList5 = new ArrayList<String>();
        myArrayList5.add("A");
        myArrayList5.add("B");
        myArrayList5.add("C");
        myArrayList5.add("D");
        myArrayList5.add("E");
        System.out.println("Before copying: ");
        System.out.println(myArrayListNum5);
        System.out.println(myArrayList5);
        Collections.copy(myArrayListNum5,myArrayList5);
        System.out.println("After copying: ");
        System.out.println(myArrayListNum5);
        System.out.println(myArrayList5);*/
        //10. Write a Java program to shuffle elements in an array list.
        /*ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(12);
        myArray.add(14);
        myArray.add(16);
        myArray.add(18);
        myArray.add(20);
        Collections.shuffle(myArray);
        System.out.println(myArray);*/
        //11. Write a Java program to reverse elements in an array list.
        /*ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(12);
        myArray.add(14);
        myArray.add(16);
        myArray.add(18);
        myArray.add(20);
        Collections.reverse(myArray);
        System.out.println(myArray);*/
        //12. Write a Java program to extract a portion of an array list.
        /*ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(12);
        myArray.add(14);
        myArray.add(16);
        myArray.add(18);
        myArray.add(20);
        System.out.println(myArray);
        System.out.println(myArray.subList(0,3));*/
        //13. Write a Java program to compare two array lists.
        /*ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(12);
        myArray.add(14);
        myArray.add(16);
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
        myArray2.add(12);
        myArray2.add(14);
        myArray2.add(18);
        ArrayList<String> yesNoArray = new ArrayList<String>();

        for (Integer e : myArray) {
            yesNoArray.add(myArray2.contains(e) ? "Yes" : "No");
        }
        System.out.println(yesNoArray);*/
        //14. Write a Java program of swap two elements in an array list.
        /*ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("One");
        myArray.add("Two");
        myArray.add("Three");
        Collections.swap(myArray,1,2);
        System.out.println(myArray);*/
        //15. Write a Java program to join two array lists.
        /*ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(12);
        a.add(14);
        a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(2);
        b.add(4);
        b.add(6);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(a);
        arrayList.addAll(b);
        System.out.println(arrayList);*/
        //16. Write a Java program to clone an array list to another array list.

        //17. Write a Java program to empty an array list.

        //18. Write a Java program to test an array list is empty or not.

        //19. Write a Java program to trim the capacity of an array list the current list size.

        //20. Write a Java program to increase the size of an array list.

        //21. Write a Java program to replace the second element of a ArrayList with the specified element.

        //22. Write a Java program to print all the elements of a ArrayList using the position of the elements.








    }
}
