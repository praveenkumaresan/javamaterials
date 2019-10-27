package com.kpk.demo;


public class ConstructorFirst {

    String testVariable;

    public ConstructorFirst() {
        System.out.println("this reference -->" +this.testVariable);
    }

    public ConstructorFirst(String testVariable) {
        this.testVariable = testVariable;
        System.out.println("this is one argument -->" +this.testVariable);
    }

   /* public static void main (String[] args)
    {
        new ConstructorFirst();
        new ConstructorFirst("Test Constructor with one Argument");
    }*/
}
