/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

import com.linuxense.javadbf.DBFReader;
import static convscafe16.FXMLDocumentController.condominio;
import java.io.FileInputStream;
import java.io.InputStream;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

/**
 *
 * @author 
 */
public class Hilo1  extends Thread{
  public static int vp8;
   public static String vl8;
    @FXML Alert alert = new Alert(Alert.AlertType.INFORMATION);
   
    public Hilo1(){
        System.out.println("Iniciando Lector dbf8");
    }
 
    @Override
    public void run(){
        
        
        
    String nc18="";
     
    
            String cond;
                cond=condominio;
               
    
            try (InputStream inputStream = new FileInputStream( "C:\\FEabril13\\"+cond+"\\MGW10008.dbf")) {
            DBFReader reader = new DBFReader( inputStream);
            Object []rowObjects; //para almacenar cada fila
            while( (rowObjects = reader.nextRecord()) != null) {
             nc18=rowObjects[0].toString();
                 }
            
            
            inputStream.close();
             // System.out.println(nc18);
            
            float nbf= Float.parseFloat(nc18);
            int  a=(int)(Math.round(nbf))+1;
            vp8=a;
            vl8=Integer.toString(vp8);
            
            FXMLDocumentController.d8c1=Integer.toString(a)+" ["+cond+"-]";
            System.out.println("PARAM8 C1 :"+ a+" " +cond+" |-");
         
           FXMLDocumentController.prubeal1=Integer.toString(a)+" ["+cond+"-]";
            
               }catch(Exception e){
                  // e.printStackTrace();
                    vl8=("Error");
                  nc18=nc18+" Error despues de este registro";
                  FXMLDocumentController.d8c1=nc18+ " ["+condominio+"]";
                    alert.setTitle("Error en lectura de dbf 8");
                    alert.setHeaderText(null);
                    alert.setContentText("El archivo dbf8 presenta un error, despues del registro: "+nc18);
                    alert.showAndWait();
           
               }
      
         
        
         System.out.println("Termino Lector dbf8");
    }
    
}