package pl.waw.sgh;

 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(35);
        myList.add(76);
        myList.add(3525);

        myList.add(1, 8987); //dodaje 8987 na miejscu nr 1
        myList.set(0,677); //zamienia liczbę z miejsca 0 na 667
        myList.remove(Integer.valueOf(677)); //usuwa element o wartości 677

        System.out.println("Size of my list: " + myList.size()); //pisze ile mam elementów na liście

        myList.get(2); //da mi trzeci element z listy (który stoi na 2. miejscu)

        int indxOfval = myList.indexOf(Integer.valueOf(76));
        System.out.println("76 is at: " + indxOfval);


        for (Integer el : myList) {
            System.out.println(el);
        }

        Integer[] myArr = myList.toArray(new Integer [0]);
        System.out.println(Arrays.toString(myArr));

    }
}
