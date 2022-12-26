/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituratxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 48723704810
 */
public class EscreveTxt {
    public static void main(String[] args){
        String[] lines = new String[]{"Bom dia", "Boa tarde", "Boa notie"};
        String path = "C:\\Users\\48723704810\\Downloads\\test.txt";
        
        //new FileWriter(path, treu) => Ele não irá recria, irá coloca no contrudo no mesmo arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                // Irá escreve os itens
                bw.write(line);
                
                //Vai dar uma quebra de linha
                bw.newLine();
            }
            System.out.println("Escrito! \n'"+path+"'");
        } catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
