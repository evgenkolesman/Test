package com.company;

public class Test {
    private static int size =10;
    private static int[] sourceArr = new int[size];

    public static void main(String[] args) {

        for (int i = 0; i < sourceArr.length; i++) {
            sourceArr[i] = i;
        }
        int index = 3;
        System.arraycopy(sourceArr, index, sourceArr, index - 1, sourceArr.length - index);
        sourceArr[sourceArr.length - 1] = 0;
        size--;
        for (int i = 0; i < sourceArr.length; i++) {
            System.out.print(sourceArr[i] + " ");
        }
    }
}
// мой способ

/*
        int size1 = size-1;
        int[] arrayFinal;
        //arrayFinal = new int[size1];
        System.arraycopy(sourceArr, 0, arrayFinal, 0, size-1);
        int poz1 = index;
        int poz2 = index+1;
        System.arraycopy(arrayFinal, poz1, arrayFinal, poz2, size-1);
        //этим мы решаем проблемы сокращения длины
        //sourceArr = arrayFinal;
        for (int i = 0; i < arrayFinal.length; i++) {

            System.out.print(" " + arrayFinal[i] +  " ");
        }
    }*/

