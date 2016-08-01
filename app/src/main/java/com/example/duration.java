package com.example;

public class duration {
    int num1;
    int num2;
    public void setNum1(int number1){
        if(number1<0||number1>2400)
        {
this.num1=-1;
        }else {
        this.num1=((number1/100)*60)+(number1%100);}
//this.num1=number1;
    }
    public  void setNum2(int number2){
       // int s=number2/100;
       // this.num2=number2;
        if(number2<0||number2>2400)
        {
        this.num2=-1;
        }else{
       this.num2=((number2/100)*60)+(number2%100);}

    }
    public int getDuration(){
        if(num1==-1 || num2==-1)
        {
            return  -1;
        }

        return num2-num1;
    }
}
