/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author 
 */
public class Direction0 {
    @FXML Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
    
    
     void obdir() throws IOException, BiffException{
    
         
         
         String sFichero = "LibreriaInsertTo8-10-45.xls";
         File fuente = new File(sFichero);
         
         if(fuente.exists()){
         
         
         
 Workbook workbookdir = Workbook.getWorkbook(fuente); //Pasamos el excel que vamos a leer
 Workbook workbookdid = Workbook.getWorkbook(fuente);
 
 
 
 
 
 
//pestañas-hojas

Sheet sheet = workbookdir.getSheet(0); //Seleccionamos la hoja que vamos a leer
Sheet sheet1 = workbookdid.getSheet(2);

                 if(FXMLDocumentController.condominio.equals("Alameda")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 0).getContents(); //Obtenemos la direccion de Alameda desde el excel llamado libreria8
                    FXMLDocumentController.nids= sheet.getCell(3, 0).getContents(); //obtenemos el numeor del proyecto 3002
                    //  FXMLDocumentController.idecol=sheet1.getCell(5, 0).getContents();
                     FXMLDocumentController.idecol2=sheet1.getCell(10, 0).getContents();
                    }else if(FXMLDocumentController.condominio.equals("CARSOFFCC")){
                            //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 1).getContents(); //Obtenemos la direccion de Cervantes desde el excel llamado libreria8
                 FXMLDocumentController.nids= sheet.getCell(3, 1).getContents();
                 
                   //FXMLDocumentController.idecol=sheet1.getCell(5, 1).getContents();
                     FXMLDocumentController.idecol2=sheet1.getCell(10, 1).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Cervantes")){
                            //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 2).getContents(); //Obtenemos la direccion de CarsoFFCC desde el excel llamado libreria8
                    FXMLDocumentController.nids= sheet.getCell(3, 2).getContents();
                    
                  // FXMLDocumentController.idecol=sheet1.getCell(5, 2).getContents();
                     FXMLDocumentController.idecol2=sheet1.getCell(10, 2).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Claudel")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 3).getContents(); //Obtenemos la direccion de Claudel desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 3).getContents();
                     
                  // FXMLDocumentController.idecol=sheet1.getCell(5, 3).getContents();
                     FXMLDocumentController.idecol2=sheet1.getCell(10, 3).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Pissarro")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 4).getContents(); //Obtenemos la direccion de Pissarro desde el excel llamado libreria
                     FXMLDocumentController.nids= sheet.getCell(3, 4).getContents();
                     
                  // FXMLDocumentController.idecol=sheet1.getCell(5, 4).getContents();
                     FXMLDocumentController.idecol2=sheet1.getCell(10, 4).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Renoir")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 5).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 5).getContents();
                 //  FXMLDocumentController.idecol=sheet1.getCell(5, 5).getContents();
                     FXMLDocumentController.idecol2=sheet1.getCell(10, 5).getContents();
                    }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 // en esta parte eliminamos signos y se tiene que hacer las validaciones con los acentos 
                  DirecFix di=new DirecFix();
                 di.reparadir();
                 
                  System.out.print(FXMLDocumentController.direct +" |");
                  System.out.print(FXMLDocumentController.nids +" |");
                  
                   System.out.println("obtubo dir");
     }else{
         
         alert1.setTitle("Error No se encuentra el archvio fuente");
        alert1.setHeaderText(null);
        alert1.setContentText("No existe: Libreria8-10-45.xls\n"
                + "Revisar que se encuentre el archivo en la misma ruta que el ejecutable Data.jar");
        alert1.showAndWait();
        
        
         System.exit(0);
         }
         
        

     }
}
