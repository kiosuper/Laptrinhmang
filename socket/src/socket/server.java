/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public class server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //B1:
        ServerSocket ss = new ServerSocket(9999);
        Socket srs = ss.accept();
        //B2:
        DataOutputStream dout = new DataOutputStream(srs.getOutputStream());
        DataInputStream din = new DataInputStream(srs.getInputStream());
        //B3:
        System.out.println("Connected.");
        int a = din.readInt();
        String kq ="";
        if(a%2==0){
            kq = "so chan";
        }
        else{
            kq = "so le";
        }
        dout.writeUTF(kq);
        //B4:
        din.close();
        dout.close();
        srs.close();
    }
    
}
