package com.company;

public class Test {
    public static void main(String[] args) {
        int size = 10;
        int[] sourceArr = new int[size];
        //sourceArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] destArr =new int [9];
        for (int i = 0; i < sourceArr.length; i++) {
            sourceArr[i] = i;
        }
        //System.arraycopy(sourceArr, 4, destArr, 5,   4 );
        int index = 3;
        System.arraycopy(sourceArr, index, sourceArr, index - 1, sourceArr.length - index);
        sourceArr[sourceArr.length - 1] = 0;
        //sourceArr[sourceArr.length]=sourceArr[size];
        size--;
        //sourceArr [].System.arraycopy(sourceArr, index, sourceArr, index, sourceArr.length - index-1)}
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

