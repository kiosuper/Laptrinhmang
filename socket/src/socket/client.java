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
public class client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket cl = new Socket("localhost", 9999);
        DataOutputStream dout = new DataOutputStream(cl.getOutputStream());
        DataInputStream din = new DataInputStream(cl.getInputStream());
        
        System.out.print("Nhap 1 so: ");
        int a = sc.nextInt();
        dout.writeInt(a);
        String kq = din.readUTF();
        System.out.println(kq);
        
        din.close();
        dout.close();
        cl.close();
    }
}
