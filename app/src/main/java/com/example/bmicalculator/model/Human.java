package com.example.bmicalculator.model;
public class Human {
    private double height;
    private double weight;
    private double bmi;

    public Human(double height , double weight){
        this.height = height;
        this.weight = weight;
        bmi = 0;
    }
    public String calculator(){
        bmi = weight / ((height/100)*(height/100));
        String value = String.format("%.2f",bmi);
        return  value;
    }
    public String valueBMI(){
        String str = "";
        if(bmi < 18.5)
            str = "น้ำหนักน้อยกว่าปกติ(ผอม)";
        else if(bmi >= 18.5 && bmi <25)
            str = "น้ำหนักปกติ";
        else if(bmi >=25 && bmi <30){
            str = "น้ำหนักมากกว่าปกติ(ท้วม)";
        }
        else if(bmi >= 30)
            str = "น้ำหนักมากกว่าปกติมาก(อ้วน)";
        return str;
    }
}
