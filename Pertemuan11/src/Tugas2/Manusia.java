/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ddiko
 */
public class Manusia {

    public void nyalakanPerangkat(Elektronik pkt) {
        String info1 = "Nyalakan televisi ";
        String info2 = " dengan Input: ";
        String info3 = "\nVoltase televisi: ";
        if (pkt instanceof TVjadul) {
            info1 += "jadul";
            info2 += ((TVjadul) pkt).getModelInput();
            info3 += ((TVjadul) pkt).getVoltase();
        } else if (pkt instanceof TVModern) {
            info1 += "modern";
            info2 += ((TVModern) pkt).getModelInput();
            info3 += ((TVModern) pkt).getVoltase();
        }
        System.out.println(info1 + info2 + info3);
    }
}
