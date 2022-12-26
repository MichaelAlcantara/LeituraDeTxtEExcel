/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituratxt;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author 48723704810
 */
public class LeituraTxt {
    public static void main(String[] args){
        String path = "C:\\Users\\48723704810\\Downloads\\insert_usuario.txt";
        //File file = new File("C:\\Users\\48723704810\\Downloads\\insert_usuario.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line!=null){
            System.out.println(line);
            line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
    }
}
