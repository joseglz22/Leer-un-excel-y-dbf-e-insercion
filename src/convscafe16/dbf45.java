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
public class dbf45 {
    public static int vp45;
    public String dl1;
    @FXML Alert alert = new Alert(Alert.AlertType.INFORMATION);
         public void d45() throws IOException{
          //   System.out.println("entro al dbf45");
    String nc145="";
    //String nc245=null;
    int cancelados=0;
    int totl=0;
    
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
        
            try (InputStream inputStream = new FileInputStream( "C:\\FEabril13\\"+cond+"\\MGW10045.dbf")) {
            DBFReader reader = new DBFReader( inputStream);
            Object []rowObjects; //para almacenar cada fila
            while( (rowObjects = reader.nextRecord()) != null) {
            nc145=rowObjects[0].toString();
                //nc245=rowObjects[3].toString();
                //System.out.println(nc245);
             
                
                

            }
            
            //cuando termina para el ultimo valor o registro
                   inputStream.close();   
                   
                   float nbf= Float.parseFloat(nc145);
                int  a=(int)(Math.round(nbf))+1;
                
                vp45=a;
                FXMLDocumentController.d45c1=Integer.toString(a)+" ["+condominio+"]";
                System.out.println("PARAM45 C1 :"+ a+" " +condominio+" |");
 
                   
                   
                   
               }catch(Exception e){
                  nc145=nc145+" Error despues de este registro";
                  FXMLDocumentController.d45c1=nc145+ " ["+condominio+"]";
                    alert.setTitle("Error en lectura de dbf 45");
                    alert.setHeaderText(null);
                    alert.setContentText("El archivo dbf45 presenta un error, despues del registro: "+nc145);
                    alert.showAndWait();
                    
               }
      
       
        
        
                

              /*float nbf2= Float.parseFloat(nc245);
                int  b=(int)(Math.round(nbf2))+1;
                FXMLDocumentController.d45c4=Integer.toString(b)+" ["+condominio+"]";
                System.out.println("PARAM45 C2:"+ b+" " +condominio+" |");
                      */      
    
    
       
              }
}
