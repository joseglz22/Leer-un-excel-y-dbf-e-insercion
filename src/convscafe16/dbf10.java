/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

import com.linuxense.javadbf.DBFReader;
import static convscafe16.FXMLDocumentController.condominio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;


/**
 *
 * @author 
 */
public class dbf10 {
    public static int vp10;
     @FXML Alert alert = new Alert(Alert.AlertType.INFORMATION);
    public void d10() throws IOException{
    String nc110="";
   // String nc210;   

    
    
     String cond;
                cond=condominio;
                if(cond.equals("CarsoCorp")){
                cond="CARSO CORP";
               }else if(cond.equals("GanteDoce")){
               cond="gante12";
               }else if(cond.equals("PlazaBella")){
               cond="pbella";
               }else if(cond.equals("SanMartino")){
               cond="sanmo";
               } 
    
            try (InputStream inputStream = new FileInputStream( "C:\\FEabril13\\"+cond+"\\MGW10010.dbf")) {
            DBFReader reader = new DBFReader( inputStream);
            Object []rowObjects; //para almacenar cada fila
            while( (rowObjects = reader.nextRecord()) != null) {
            nc110=rowObjects[0].toString();
               // nc210=rowObjects[1].toString();
                 }
            inputStream.close();
            
            
            
             float nbf= Float.parseFloat(nc110);
      int  a=(int)(Math.round(nbf))+1;
      vp10=a;
      FXMLDocumentController.d10c1=Integer.toString(a)+" ["+condominio+"]";
      System.out.println("PARAM10 C1 :"+ a+" " +condominio+" |");
    
            
               }catch(Exception e){
                   
                   
                   
                   
                  nc110=nc110+" Error despues de este registro";
                  FXMLDocumentController.d10c1=nc110+ " ["+condominio+"]";
                    alert.setTitle("Error en lectura de dbf 10");
                    alert.setHeaderText(null);
                    alert.setContentText("El archivo dbf10 presenta un error, despues del registro: "+nc110);
                    alert.showAndWait();
                    
               }
      
        
     // float nbf2= Float.parseFloat(nc210);
     // int  b=(int)(Math.round(nbf2))+1;
      
     // vp10=b;
      
     // FXMLDocumentController.d10c2=Integer.toString(b)+" ["+condominio+"]";
     // System.out.println("PARAM10 C2:"+ b+" " +condominio+" |");
     
       
    
    }
}
