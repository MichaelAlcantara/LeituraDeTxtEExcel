/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituraexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author 48723704810
 */
public class LeituraExcel {

    public List<String> cpf;
    
    public static void main(String[] args){
        FileInputStream fis;
        List<String> cpf = new ArrayList<>();
        try {
            // Caminho do arquivo
            File file = new File("C:\\Users\\48723704810\\Downloads\\Lista_Cpfs.xlsx");
            fis = new FileInputStream(file);
            
            //Entra na planilha
            XSSFWorkbook woork = new XSSFWorkbook(fis);
            
            //Entra na planilha 1
            XSSFSheet sheet = woork.getSheetAt(0);
            
            //Recebe as linhas da planilha atual
            Iterator<Row> row = sheet.iterator();
            while(row.hasNext()){
                
                //Recebe cada linha
                Row rows = row.next();
                
                //Varrendo todas as colunas da linha atual
                Iterator<Cell> cell = rows.iterator();

                while(cell.hasNext()){
                    
                    //Recebendo a coluna atual
                    Cell cells = cell.next();
                    
                    cpf.add(cells.getStringCellValue());
                    //System.out.println(cells.getStringCellValue());
                }
            }
            System.out.println(cpf);
        }catch (IOException ex) {
                Logger.getLogger(LeituraExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
	}    
}
