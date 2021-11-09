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
public class MainElektronik {

    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TVjadul tvjadul = new TVjadul();
        TVModern tvmodern = new TVModern();

        indro.nyalakanPerangkat(tvjadul);
        indro.nyalakanPerangkat(tvmodern);
    }
}
