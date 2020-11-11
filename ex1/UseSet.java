package it.unibo.oop.lab05.ex1;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        Collection<String> coll = new TreeSet<>();
        
        for (int i = 1; i <= 20; i++) {
            coll.add(Integer.toString(i));
        }
        System.out.println(coll);
        
        var iter = coll.iterator();
        while(iter.hasNext()) {
            if ( Integer.parseInt(iter.next()) % 3 == 0) {
                iter.remove();
            }
        }
        
        for (String s : coll) {
            System.out.println(s);
        }
        
        for (String str : coll) {
            if(Integer.parseInt(str) % 2 != 0) {
                System.out.println(str + " is odd");
            }
            else {
                System.out.println(str + " is even");
            }
        }
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even (pari)
         */
    }
}
