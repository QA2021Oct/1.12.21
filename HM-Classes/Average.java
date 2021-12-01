package com.company;

public class Average {

    public float printAvg(float num1, float num2, float num3){
        float avg = (num1 + num2 + num3) / 3;
        return  avg; /// 103.96
    }

    public void printAvgWithoutReturn(float num1, float num2, float num3){
        System.out.println((num1 + num2 + num3) / 3);
    }
}
