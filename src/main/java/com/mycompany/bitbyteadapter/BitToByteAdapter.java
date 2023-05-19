/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitbyteadapter;

/**
 *
 * @author alu10701951
 */
public class BitToByteAdapter implements ByteSpitterInterf {
    private BitSpitter bitSpitter;

    public BitToByteAdapter(BitSpitter bitSpitter) {
        this.bitSpitter = bitSpitter;
    }
    

    @Override
    public byte nextByte(){
        String bitString = "";
        for(int i = 0; i < 8; i++){
           bitString += bitSpitter.nextBit();
        }
        return (byte) Integer.parseInt(bitString, 2);
    }
    
}
