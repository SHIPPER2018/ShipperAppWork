package com.example.shipperapp;
import android.graphics.Picture;
import java.time.DayOfWeek;

public class Carrier {
    public double TruckSize;// String??????
    //dates
    public String From;
    public String To;
    public String DayOfWeek;
    public String Driver;// drivers photo + truck -----> Change back to picture
    public String Desc;//description about driver

    public Carrier (double TruckSize,String From ,String To ,String Day,String Driver,String Desc){
        this.TruckSize = TruckSize;
        this.Driver = Driver ;
        this.To = To ;
        this.From = From ;
        this.DayOfWeek = DayOfWeek ;
        this.Desc = Desc ;
    }

    public void setTruckSize(double TruckSize){
        this.TruckSize = TruckSize;
    }
    public double getTruckSize(){
        return TruckSize ;
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

    public void setDesc(String Desc){
        this.Desc = Desc ;
    }
    public String getDesc(){
        return Desc;
    }

    public void setDriver(String Driver){
        this.Driver = Driver ;
    }
    public String getDriver(){
        return Driver ;
    }

}
