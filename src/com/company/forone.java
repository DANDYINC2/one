package com.company;

import java.util.Scanner;

public class forone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxRange = 100;//максимальное значение для числа в массиве
        int []a ;// Выделил память под массив
        a = new int[in.nextInt()];// Обьявил массив ( кол-во эл вводим с клавиватуры)
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (maxRange + 1)); //Целое число 0..max
            //То есть i - это номер элимента и цикл фор задает ему значение
        }
// выводим массив на консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");//Вывод номера массива по индексу
        }

    }
}