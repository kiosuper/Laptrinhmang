/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess_random;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public class client {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Socket cl = new Socket("localhost", 9999);
        DataInputStream din = new DataInputStream(cl.getInputStream());
        DataOutputStream dout = new DataOutputStream(cl.getOutputStream());
        boolean check = true;
        int a;
        String s;
        while(check){
            System.out.print("So ma ban doan la: ");
            a = sc.nextInt();
            dout.writeInt(a);
            s = din.readUTF();
            System.out.println(s);
            if("Ban da doan dung so.".equals(s)){
                check = false;
            }
        }
    }
    
}
