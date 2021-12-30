/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.Java.Activity.Java.satu;

/**
 *
 * @author Raihan
 */
public class proseshitung {
    
    public Double pharga(String hgkilo, String jhbeli){
        Double harga_perkilo = Double.parseDouble(hgkilo);
        Double jumlah_beli = Double.parseDouble(jhbeli);
        
        Double harga = harga_perkilo * jumlah_beli;
        return harga;
    }
    
    public String pdiskon(Double nharga){
        String ndiskon = null;
        
        if (nharga < 16000){
            ndiskon = "0%";
        }
        else if (nharga >= 16000 && nharga <= 25000){
            ndiskon = "10%";
        }
        else if (nharga > 25000){
            ndiskon = "15%";
        }
        return ndiskon;
    }
    
    public Double pjumlah_diskon(Double nharga){
        Double njumlah_diskon = null;
        
        if (nharga < 16000){
            njumlah_diskon = nharga*0/100;
        }
        else if (nharga >= 16000 && nharga <= 25000){
            njumlah_diskon = nharga*10/100;
        }
        else if (nharga > 25000){
            njumlah_diskon = nharga*15/100;
        }
        return njumlah_diskon;
    }
    
    public Double ptotal_harga(Double nharga){
        Double total_harga = null;
        
        if (nharga < 16000){
            total_harga = nharga - (nharga*0/100);
        }
        else if (nharga >= 16000 && nharga <= 25000){
            total_harga = nharga - (nharga*10/100);
        }
        else if (nharga > 25000){
            total_harga = nharga - (nharga*15/100);
        }
        return total_harga;
    }
}
