/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.Java.Activity.Java.satu;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Raihan
 */
@Controller
public class Activitycontroller {
    
    @RequestMapping("/kirimdata")
    public String getData(HttpServletRequest data, Model kurir){
        
        String nmbuah = data.getParameter("var_nmbuah");
        String hgkilo = data.getParameter("var_hgkilo");
        String jhbeli = data.getParameter("var_jhbeli");
        
        proseshitung ph = new proseshitung();
        
        Double harga = ph.pharga(hgkilo, jhbeli);
        String diskon = ph.pdiskon(harga);
        Double jumlah_diskon = ph.pjumlah_diskon(harga);
        Double total_harga = ph.ptotal_harga(harga);
 
        kurir.addAttribute("nb", nmbuah);
        kurir.addAttribute("hk", hgkilo);
        kurir.addAttribute("jhbeli", jhbeli);
        kurir.addAttribute("harga", harga);
        kurir.addAttribute("ph", diskon);
        kurir.addAttribute("jph", jumlah_diskon);
        kurir.addAttribute("tot_harga", total_harga);
   
        return "Raihanf";
    }
}