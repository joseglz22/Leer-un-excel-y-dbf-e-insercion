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
public class Direction {
    @FXML Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
    
    
     void obdir() throws IOException, BiffException{
    
         
         
         String sFichero = "LibreriaInsertTo8-10-45.xls";
         File fuente = new File(sFichero);
         
         if(fuente.exists()){
         System.out.println("Existe fichero");
         
        
 Workbook workbookdir = Workbook.getWorkbook(fuente); //Pasamos el excel que vamos a leer
 Workbook workbookdid = Workbook.getWorkbook(fuente);
 

  
//pestañas-hojas


      Sheet sheet = workbookdir.getSheet(3);
      Sheet sheet1 = workbookdid.getSheet(5);


System.out.println("comparando"+ FXMLDocumentController.condominio);




                 if(FXMLDocumentController.condominio.equals("Altavista")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 0).getContents(); //Obtenemos la direccion de Alameda desde el excel llamado libreria8
                    FXMLDocumentController.nids= sheet.getCell(3, 0).getContents(); //obtenemos el numeor del proyecto 3002
                    //definimos el cidocu que se usa en el archivo 10 con iva 16
                    // en esta cambia  
                   // FXMLDocumentController.idecol=sheet1.getCell(5, 0).getContents();
                     
                     FXMLDocumentController.idecol2=sheet1.getCell(10, 0).getContents();
                    
                    
                    }else if(FXMLDocumentController.condominio.equals("Arcos")){
                            //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 1).getContents(); //Obtenemos la direccion de Cervantes desde el excel llamado libreria8
                 FXMLDocumentController.nids= sheet.getCell(3, 1).getContents();
                   //FXMLDocumentController.idecol=sheet1.getCell(5, 1).getContents();
                     FXMLDocumentController.idecol2=sheet1.getCell(10, 1).getContents();
                 
                    }else if(FXMLDocumentController.condominio.equals("Bosques")){
                            //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 2).getContents(); //Obtenemos la direccion de CarsoFFCC desde el excel llamado libreria8
                    FXMLDocumentController.nids= sheet.getCell(3, 2).getContents();
                     // FXMLDocumentController.idecol=sheet1.getCell(5, 2).getContents();
                        FXMLDocumentController.idecol2=sheet1.getCell(10, 2).getContents();
                    }else if(FXMLDocumentController.condominio.equals("CarsoCorp")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 3).getContents(); //Obtenemos la direccion de Claudel desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 3).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 3).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 3).getContents();
                    }else if(FXMLDocumentController.condominio.equals("CarsoPCII")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 4).getContents(); //Obtenemos la direccion de Pissarro desde el excel llamado libreria
                     FXMLDocumentController.nids= sheet.getCell(3, 4).getContents();
                     //  FXMLDocumentController.idecol=sheet1.getCell(5, 4).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 4).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Chapultepec")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 5).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 5).getContents();
                    //   FXMLDocumentController.idecol=sheet1.getCell(5, 5).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 5).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Cuajimalpa")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 6).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 6).getContents();
                    //   FXMLDocumentController.idecol=sheet1.getCell(5, 6).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 6).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Cuautitlan")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 7).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 7).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 7).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 7).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Cuernavaca")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 8).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 8).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 8).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 8).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Galerias")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 9).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 9).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 9).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 9).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Gante12")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 10).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 10).getContents();
                     //  FXMLDocumentController.idecol=sheet1.getCell(5, 10).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 10).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Ginza")){
                        
                        
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 11).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3,11).getContents();
                     //  FXMLDocumentController.idecol=sheet1.getCell(5, 11).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 11).getContents();
                         
                         
                         
                    }else if(FXMLDocumentController.condominio.equals("Hacienda")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 12).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 12).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 12).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 12).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Industrial")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 13).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 13).getContents();
                     //  FXMLDocumentController.idecol=sheet1.getCell(5, 13).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 13).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Interlomas")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 14).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 14).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 14).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 14).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Izcalli")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 15).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 15).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 15).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 15).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Jardines")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 16).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 16).getContents();
                       //FXMLDocumentController.idecol=sheet1.getCell(5, 16).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 16).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Lilas")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 17).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 17).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 17).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 17).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Lindavista")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 18).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 18).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 18).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 18).getContents();
                    }else if(FXMLDocumentController.condominio.equals("LuisCabrera")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 19).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 19).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 19).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 19).getContents();
                    }else if(FXMLDocumentController.condominio.equals("Medico")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 20).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 20).getContents();
                       //FXMLDocumentController.idecol=sheet1.getCell(5, 20).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 20).getContents();
                    }else if(FXMLDocumentController.condominio.equals("PBella")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 21).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 21).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 21).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 21).getContents();
                    }else if(FXMLDocumentController.condominio.equals("SanFrancisco")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 22).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 22).getContents();
                      // FXMLDocumentController.idecol=sheet1.getCell(5, 22).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 22).getContents();
                    }else if(FXMLDocumentController.condominio.equals("SanMo")){
                        
                        
                        System.out.println("entro "+ FXMLDocumentController.condominio);

                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 23).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 23).getContents();
                     //  FXMLDocumentController.idecol=sheet1.getCell(5, 23).getContents();
                         FXMLDocumentController.idecol2=sheet1.getCell(10, 23).getContents();
                         
                        System.out.println("paso "+ FXMLDocumentController.condominio); 
                         
                    }else if(FXMLDocumentController.condominio.equals("Shopping")){
                              //recorremos (columna  filas)
                    FXMLDocumentController.direct = sheet.getCell(79, 24).getContents(); //Obtenemos la direccion de Renoir desde el excel llamado libreria8
                     FXMLDocumentController.nids= sheet.getCell(3, 24).getContents();
                     // FXMLDocumentController.idecol=sheet1.getCell(5, 24).getContents();
                        FXMLDocumentController.idecol2=sheet1.getCell(10, 24).getContents();
                    }
                    // entramos a obtener direcciones y datos de iva 0
                    
                    
                    else{
                    
                     alert1.setTitle("Error No se definio el proyecto ");
                    alert1.setHeaderText(null);
                    alert1.setContentText("No existe\n"
                            + "Revisar que se encuentre definido ");
                    alert1.showAndWait();

                    
                    
                    }
                 
                 
                 
                 // en esta parte eliminamos signos y se tiene que hacer las validaciones con los acentos 
                 //control de acentos  
                                
                 DirecFix di=new DirecFix();
                 di.reparadir();
                                    
                  System.out.print(FXMLDocumentController.direct +" |");
                  System.out.print(FXMLDocumentController.nids +" |");
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
