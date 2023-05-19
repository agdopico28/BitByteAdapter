/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bitbyteadapter;

/**
 *
 * @author alu10701951
 */
public class BitByteAdapter {

    public static void main(String[] args) {
        BitSpitter bitSpitter = new BitSpitter();
        BitToByteAdapter adapter = new BitToByteAdapter(bitSpitter);
        ByteEater byteEater = new ByteEater(adapter);
        
        byteEater.eatByte();
    }
}
