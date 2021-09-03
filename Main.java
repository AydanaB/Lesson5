package com.company;

public class Main {

    public static void main(String[] args) {
	double[] array = {1.5, -0.7, 3.41, 2.55, -0.47, 5.1, -6.09, - 8.5, -4.25, 0.125, -2.6, 7.83, 4.72, 0.35, -9.07};
    double length = 0;
    double sum = 0;
    boolean firstNegative = false;

    for (double average : array){
        if (average < 0){
            firstNegative = true;
        }
        if (firstNegative){
            if (average > 0){
                length++;
                sum += average;
            }
        }
    }
        System.out.printf("Средне арифметическое положительных чисел после первого отрицательго: " + sum/length);
    }
}
