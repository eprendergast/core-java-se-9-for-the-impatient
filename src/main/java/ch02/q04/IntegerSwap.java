package ch02.q04;

// Write a method that swaps the contents of two IntHolder objects

// IN PROGRESS

import org.omg.CORBA.IntHolder;

public class IntegerSwap {

    public static void main(String[] args) {
        IntegerSwap swap = new IntegerSwap(new IntHolder(2), new IntHolder(3));
        System.out.println(swap.varA.toString());
        System.out.println(swap.varB.toString());
    }

    IntHolder varA;
    IntHolder varB;

    public IntegerSwap(IntHolder varA, IntHolder varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public void swapIntegers(IntHolder varA, IntHolder varB) {

    }


}
