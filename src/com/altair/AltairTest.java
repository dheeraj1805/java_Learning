package com.altair;

public class AltairTest{

    //Type 1:Method with No Args and No return type
    public void printProductOfTwoNumbers(){
        int a=10;
        int b=10;
        int c=a*b;
        System.out.println("Product Of 2 Numbers is:"+c);
    }

    //Type 2:Method with  Args and No return type
    public void printProductOfTwoNumbersViaMethodParameters(int a,int b){
        int c= a*b;
        System.out.println("Product of 2 Numbers:"+c);
    }
    //Type 3:Method with Args and  return type
    public int printProductOfTwoNumbersViaMethodParametersWithReturnType(int a,int b){
        int c= a*b;
        return c;
    }
    //Type 4:Method with No Args and  return type
    public int printProductOfTwoNumbersWithNoArgsAndReturnType(){
        int a=10;
        int b=10;
        int c= a*b;
        return c;
    }
    public static void main(String[] args) {
        AltairTest altairTest = new AltairTest();
        altairTest.printProductOfTwoNumbers();
        altairTest.printProductOfTwoNumbersViaMethodParameters(15,10);
        int valueReturnedFromMethod = altairTest.printProductOfTwoNumbersViaMethodParametersWithReturnType(20,20);
        int finalOutputOfThreeNumbers = valueReturnedFromMethod*20;
        System.out.println("Total Product of Three Numbers is:"+finalOutputOfThreeNumbers);

        int outputValue = altairTest.printProductOfTwoNumbersWithNoArgsAndReturnType();
        int value = outputValue*10;
        System.out.println("Final Value is"+value);

    }
}