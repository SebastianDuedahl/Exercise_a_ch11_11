package Chapter_11_a_11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set containing
their symmetric set difference (that is, the set of elements contained in either of the two sets but not in both). For
example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].
*/
public class Exercise_11
{
    public static void main(String[] args)
    {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,4,7,9));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(2,4,5,6,7));

        System.out.println(symmetricSetDifference(set1,set2));


    }


    public static Set symmetricSetDifference (Set<Integer> set1, Set<Integer> set2)
    {

        HashSet<Integer> temp = new HashSet<>(set1); // temp indeholder alle værdier fra set1

        temp.removeAll(set2); // fjerne tallene fra temp som er i set2

        set2.removeAll(set1); // fjerner alle tallene fra sset 2 som er i set 1

        temp.addAll(set2); // tilføjer alt fra set2 til temp

        return temp;

    }

}
