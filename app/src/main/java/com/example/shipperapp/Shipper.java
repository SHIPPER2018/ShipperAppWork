package com.example.shipperapp;

import java.time.DayOfWeek;

public class Shipper {
    public double ShipSize;
    //dates
    public String From ;
    public String To ;
    public String DayOfWeek ;

    public Shipper (String From ,String To ,String DayOfWeek,double ShipSize){

        this.ShipSize = ShipSize ;
        this.To = To ;
        this.From = From ;
        this.DayOfWeek = DayOfWeek ;
    }

    public void setShipSize(int ShipSize){
        this.ShipSize = ShipSize ;
    }
    public double getShipSize(){
        return ShipSize ;
    }
    public void setTo(String To){
        this.To = To ;
    }
    public String getTo(){
        return To ;
    }
    public void setFrom(String From){
        this.From = From ;
    }
    public String getFrom(){
        return From ;
    }
    public void setDay(String Day){
        this.DayOfWeek = DayOfWeek ;
    }
    public String getDay(){
        return DayOfWeek;
    }

}
