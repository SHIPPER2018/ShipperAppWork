package com.example.shipperapp;
import android.graphics.Picture;
import java.time.DayOfWeek;

public class Carrier {
    private int TruckSize;// String??????
    //dates
    private String From;
    private String To;
    private String DayOfWeek;
    private Picture Driver;// drivers photo + truck
    private String Desc;//description about driver

    public Carrier (int TruckSize,String From ,String To ,String Day,Picture Driver,String Desc){
        this.TruckSize = TruckSize;
        this.Driver = Driver ;
        this.To = To ;
        this.From = From ;
        this.DayOfWeek = DayOfWeek ;
        this.Desc = Desc ;
    }

    public void setTruckSize(int TruckSize){
        this.TruckSize = TruckSize;
    }
    public int getTruckSize(){
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

    public void setDriver(Picture Driver){
        this.Driver = Driver ;
    }
    public Picture getDriver(){
        return Driver ;
    }

}
