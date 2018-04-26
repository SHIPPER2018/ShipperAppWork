package com.example.shipperapp;

import java.time.DayOfWeek;

public class Shipper {
    private int ShipSize;
    //dates
    private String From ;
    private String To ;
    private String DayOfWeek ;

    public Shipper (String From ,String To ,String DayOfWeek,int ShipSize){

        this.ShipSize = ShipSize ;
        this.To = To ;
        this.From = From ;
        this.DayOfWeek = DayOfWeek ;
    }

    public void setShipSize(int ShipSize){
        this.ShipSize = ShipSize ;
    }
    public int getShipSize(){
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
