package com.example.mytipscalculator;

public class TipCalculator {

    private float tip;
    private  float bill;

    public  TipCalculator(float newTip, float newBill){
        tip = newTip;
        bill = newBill;
    }
    public  void setTip(float tips ){tip= tips;}
    public  void setBill(float bills){bill=bills;}

    public float getTip(){return tip;}
    public float getBill(){return bill;}

    public float tipAmount(){
        float tip;
        tip = getBill()*(getTip()/100);
        return tip;
    }
    public float totalAmount(){
        return getBill()+tipAmount();
    }

}
