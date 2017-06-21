package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(reader.readLine());
        num = num % 5;
        if (num < 3) System.out.println("зелёный");
        else if (num < 4) System.out.println("желтый");
        else if (num < 5) System.out.println("красный");
    }
}