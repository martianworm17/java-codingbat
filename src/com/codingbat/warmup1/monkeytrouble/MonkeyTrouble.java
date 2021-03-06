package com.codingbat.warmup1.monkeytrouble;

public class MonkeyTrouble {

    /*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false*/

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
    }

    private static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // Luckily, I got the best solution according to the "Show Solution".
        // But not the very short version.
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }

        return false;
    }
}
