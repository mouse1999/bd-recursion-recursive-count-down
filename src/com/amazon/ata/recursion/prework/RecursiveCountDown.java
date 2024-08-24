package com.amazon.ata.recursion.prework;

import java.util.ArrayList;
import java.util.List;

public class RecursiveCountDown {

    /**
     * This recursive method will return a string consisting of all the integers from the target
     * down to zero. ex: target=3 will return "3210"
     * @param target - this is the number we are counting down from
     * @return - this is a String that has combined all the numbers from target down to 0.
     */
    public String countDown(int target) {
        if (target == 0) {
            return "0";
        }

        // Recursive case: concatenate target with the result of countDown(target - 1)
        return  target + countDown(target - 1);
    }
}
