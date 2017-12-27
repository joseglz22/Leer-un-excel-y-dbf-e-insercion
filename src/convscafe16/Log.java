/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 */
public class Log {
    public void generalog() throws IOException{
       java.util.Date fecha = new Date();
      String fe=new SimpleDateFormat("dd-MM-yyyy").format(fecha);
        String nombreArchivo= "C:\\data\\"+fe+FXMLDocumentController.condominio+"log.txt"; // Aqui se le asigna el nombre y 
FileWriter fw = null;	// la extension al archivo 
try { 
fw = new FileWriter(nombreArchivo); 
BufferedWriter bw = new BufferedWriter(fw); 
PrintWriter salArch = new PrintWriter(bw); 
salArch.print("********************************************************************"); 
salArch.println(); 
salArch.print("Datos de: "+FXMLDocumentController.condominio); 
salArch.println(); 
salArch.print( "Total: $"+FXMLDocumentController.sumat ); 
salArch.println();
salArch.println("Registros: "+ FXMLDocumentController.registrost); 
salArch.println("********************************************************************");

salArch.println("Condominio: "+ FXMLDocumentController.condominio); 
salArch.println();
salArch.println("Param        8: "); 
salArch.println();
salArch.println("Fecha: "+ FXMLDocumentController.fech); 
salArch.println();
int dif, textob8;
textob8=Integer.parseInt(FXMLDocumentController.cidocum01);
dif=Hilo1.vp8-textob8;

salArch.println("Param8: "+ FXMLDocumentController.cidocum01 +" vs "+  FXMLDocumentController.d8c1 +" Diferencia = "+dif); 
salArch.println();






salArch.println("Param        45: "); 
salArch.println();
int di45,dif2,rst45,rst2;
rst45=Integer.parseInt(FXMLDocumentController.ca);
di45=Hilo3.vp45-rst45;
rst2=Integer.parseInt(FXMLDocumentController.cc);
dif2=Hilo1.vp8-rst2;

salArch.println("Param45: "+ FXMLDocumentController.ca +" vs "+  FXMLDocumentController.d45c1+" Diferencia = "+di45); 
salArch.println();
salArch.println("Param45: "+ FXMLDocumentController.cc +" vs "+  FXMLDocumentController.d8c1+" Diferencia = "+dif2); 
salArch.println();



salArch.println("Param        10: "); 
salArch.println();
int di10,dif102,rst10,rst102;
rst10=Integer.parseInt(FXMLDocumentController.p10ca);
di10=Hilo2.vp10-rst10;
rst102=Integer.parseInt(FXMLDocumentController.p10cb);
dif102=Hilo1.vp8-rst102;

salArch.println("Param10: "+ FXMLDocumentController.p10ca +" vs "+  FXMLDocumentController.d10c1+" Diferencia = "+di10); 
salArch.println();
salArch.println("Param10: "+ FXMLDocumentController.p10cb +" vs "+  FXMLDocumentController.d8c1+" Diferencia = "+dif102); 
salArch.println();


salArch.println("logs con salto de linea");

 for(Object o: FXMLDocumentController.log1){
     
              salArch.println(o);
            System.out.println(o);
}
salArch.println();
salArch.println();
salArch.println("logs con error en RFC ");

 for(Object o: FXMLDocumentController.log2){
              salArch.println(o);
            System.out.println(o);
}


salArch.println("logs con salto de linea");

 for(Object o: FXMLDocumentController.log3){
              salArch.println(o);
            System.out.println(o);
}



salArch.close();
} 
catch (IOException ex) { 
} 
       

 Runtime obj = Runtime.getRuntime();
                obj.exec("notepad "+nombreArchivo);



    
    }
}
