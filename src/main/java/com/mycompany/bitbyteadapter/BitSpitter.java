/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitbyteadapter;

/**
 *
 * @author alu10701951
 */
public class BitSpitter {
    public String nextBit(){
        double r = Math.random();
        if(r > 0.5){
            return "0";
        }else{
            return "1";
        }

    }
}
