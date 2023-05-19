/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitbyteadapter;

/**
 *
 * @author alu10701951
 */
public class ByteEater {
    private ByteSpitterInterf byteSpitter;
    
    public ByteEater(ByteSpitterInterf byteSpitter){
        this.byteSpitter = byteSpitter;
    }
    
    public void eatByte(){
        byte b = byteSpitter.nextByte();
        System.out.println(b);
    }
    
}
