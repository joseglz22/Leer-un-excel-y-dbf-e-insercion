/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
/**
 *
 * @author
 */
public class DParam45io {
    public  void dprm45() throws IOException, BiffException{
        System.out.println("entro al 45");
         ArrayList script = new ArrayList();
    Workbook workbook = Workbook.getWorkbook(new File(FXMLDocumentController.rt)); //Pasamos el excel que vamos a leer
//pestañas-hojas
Sheet sheet = workbook.getSheet(FXMLDocumentController.nh); //Seleccionamos la hoja que vamos a leer


File folder = new File("C:\\data");

if(folder.exists()){
//JOptionPane.showMessageDialog(null, "existe la ruta");
System.out.println("existe carpeta");
}else{
System.out.println("no existe carpeta");

folder.mkdir();
}

    
  
// WritableSheet wsheet = (WritableSheet) workbook.getSheet(0);
java.util.Date fecha = new Date();



String fe=new SimpleDateFormat("dd-MM-yyyy").format(fecha);
String dat="C:\\data\\"+fe+FXMLDocumentController.condominio+"copia45.csv";


File file = new File(dat);


FileWriter salida = new FileWriter(file);


int fila;
//Columnas
int     Folio=0,
        concentradora=1,
        condominio=2,
        ocupante=3,
        nombre=4,
         recibo=5,
        cmetodopag=6,
        indiviso=7,
        descr=8,
        importe=9,
        Subtotal=10,
        IVA=11,
        cidclien01=12,
        crazonso01=13,
        crfc=14,
        Texto35=15,
        cnumctapag=16;

int ids=Integer.parseInt(FXMLDocumentController.ca);
int ids2=Integer.parseInt(FXMLDocumentController.cc);

for (fila = 1; fila < sheet.getRows(); fila++) { //recorremos las filas

//egresoid = sheet.getCell(0, fila).getContents(); //setear la celda leida a nombre

System.out.print(ids +"    |");
String var =Integer.toString(ids);
salida.write(var);

 
//columna concentradora

String moneda;
moneda="4";
System.out.print(moneda +"  |");
salida.write(";"); //pasamos a la siguiente columna
salida.write(moneda);




//columna concentradora    depende del proyecto alameda= 3002  altavista = 3007  luiscabrera=3002 
String paridad=FXMLDocumentController.nids;
//condominio = sheet1.getCell(6, fila).getContents(); //setear la celda leida a nombre
System.out.print(paridad +" |");
salida.write(";"); //pasamos a la siguiente columna
salida.write(paridad);

//columna concentradora


System.out.print(ids2 +"    |");
String var2 =Integer.toString(ids2);
salida.write(";");
salida.write(var2);

String j;
j="0";
System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);



System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);


System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);



String nada="";
String serA="";
if(FXMLDocumentController.condominio.equals("Pissarro")){
    
System.out.print(serA +" |");
salida.write(";"); //pasamos a la siguiente columna
serA="A";

}else{
System.out.print(nada +" |");
salida.write(";"); //pasamos a la siguiente columna
serA="";
}

System.out.print(serA +" |");
salida.write(";");
salida.write(serA);



String fol;
fol = sheet.getCell(Folio, fila).getContents(); //escribimos columna i
System.out.print(fol +" |");
salida.write(";"); //pasamos a la siguiente columna
salida.write(fol);


System.out.print(j +"  |");
salida.write(";"); //escribimos 0            j
salida.write(j);


String diag="  /  /";
System.out.print(diag +" |");
salida.write(";"); //escribimos   /  /         k
salida.write(diag);



String nm;
nm="1";
System.out.print(nm +"  |");
salida.write(";"); //escribimos 1
salida.write(nm);


System.out.print(j +"  |");
salida.write(";"); //escribimos 0  columna m
salida.write(j);

//escribimos fecha
String dte;
dte =FXMLDocumentController.fech ;//
System.out.print(dte +" |");
salida.write(";"); //
salida.write(dte);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);


System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);

System.out.print(diag +" |");
salida.write(";"); //escribimos   /  /
salida.write(diag);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);


String mone;
mone="3";
System.out.print(mone +"  |");
salida.write(";"); //pasamos a la siguiente columna
salida.write(mone);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);


System.out.print(diag +" |");
salida.write(";"); //escribimos   /  /
salida.write(diag);

System.out.print(diag +" |");
salida.write(";"); //escribimos   /  /
salida.write(diag);


System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);



System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);


System.out.print(nada +" |");
salida.write(";"); ////escribimos nada CAJ
salida.write(nada);


String oo;
oo="0.00";
System.out.print(oo +"  |");
salida.write(";"); //escribimos 0.00
salida.write(oo);


System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);



System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0   columna OA
salida.write(j);


System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada 
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);


String gastg="";
System.out.print(gastg +" |");
salida.write(";"); ////escribimos gasto general
salida.write(gastg);



System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada columna AV
salida.write(nada);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0
salida.write(j);


System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada CAZ
salida.write(nada);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0 columna BA
salida.write(j);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada CBB 
salida.write(nada);


System.out.print(j +"  |");
salida.write(";"); //escribimos 0 CBC
salida.write(j);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada CBD
salida.write(nada);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0 CBE
salida.write(j);

System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);
System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);
System.out.print(nada +" |");
salida.write(";"); ////escribimos nada
salida.write(nada);

System.out.print(j +"  |");
salida.write(";"); //escribimos 0 CBI
salida.write(j);


ids=ids+1;
ids2=ids2+1;

  
System.out.println("\n");
salida.write("\n");

String dte2;
dte2 =FXMLDocumentController.fech2 ;


String query = "insert into \"C:\\FEabril13\\"+FXMLDocumentController.cond+"\\MGW10045.dbf\"  values ("+var+","+moneda+","+paridad+","+var2+","+j+","+j+","+j+",'"+serA+"',"+fol+","+j+",(CTOD('"+ diag+"')),"+ nm+","+ j+",(CTOD('"+dte2+"')),'"+nada+"','"+nada+"','"+nada+"',"+j+", (CTOD('"+ diag+"')),'"+nada+"',"+ mone+",'"+nada+"','"+nada+"',(CTOD('"+diag+"')),(CTOD('"+diag+"')),'"+nada+"','"+nada+"',"+j+",'"+nada+"','"+nada+"',"+j+","+j+","+j+","+j+","+j+",'"+nada+"',"+oo+",'"+nada+"',"+j+",'"+nada+"',"+j+",'"+nada+"','"+nada+"','"+nada+"','"+gastg+"','"+nada+"','"+nada+"','"+nada+"',"+j+",'"+nada+"','"+nada+"','"+nada+"',"+j+",'"+nada+"',"+j+",'"+nada+"',"+j+",'"+nada+"','"+nada+"','"+nada+"',"+j+",'');"+"\n";
 


 //String pathDB = "C:\\Program Files\\DBFCommander\\DBFCommander.exe -q insert into \"C:\\FEabril13\\"+FXMLDocumentController.condominio+"\\MGW10045.dbf\"  values ("+var+","+moneda+","+paridad+","+var2+","+j+","+j+","+j+",'"+nada+"',"+fol+","+j+",(CTOD('"+ diag+"')),"+ nm+","+ j+",(CTOD('"+dte+"')),'"+nada+"','"+nada+"','"+nada+"',"+j+", (CTOD('"+ diag+"')),'"+nada+"',"+ mone+",'"+nada+"','"+nada+"',(CTOD('"+diag+"')),(CTOD('"+diag+"')),'"+nada+"','"+nada+"',"+j+",'"+nada+"','"+nada+"',"+j+","+j+","+j+","+j+","+j+",'"+nada+"',"+oo+",'"+nada+"',"+j+",'"+nada+"',"+j+",'"+nada+"','"+nada+"','"+nada+"','"+nada+"','"+nada+"','"+nada+"','"+nada+"',"+j+",'"+nada+"','"+nada+"','"+nada+"',"+j+",'"+nada+"',"+j+",'"+nada+"',"+j+",'"+nada+"','"+nada+"','"+nada+"',"+j+",'');";

 script.add(query);


 

}

salida.close();

String sqll="C:\\data\\"+fe+FXMLDocumentController.cond+"sql45.sql";
File filesql = new File(sqll);
FileWriter wsql = new FileWriter(filesql);


Iterator<String> nombreIterator = script.iterator();
while(nombreIterator.hasNext()){
	String elemento = nombreIterator.next();
	System.out.print(elemento+" \n ");
        wsql.write(elemento+"\n");
         
       // Runtime runtime = Runtime.getRuntime();
       // Process child = runtime.exec("C:\\\\Program Files\\\\DBFCommander\\\\DBFCommander.exe -q  "+elemento);         

}
wsql.close();

 




try{ 
 
  // Runtime.getRuntime().exec("cmd /c start "+file);

     String fina = "C:\\Program Files\\DBFCommander\\DBFCommander.exe -qf "+ sqll;
      System.out.print(fina+" \n ");
      
        Runtime runtime = Runtime.getRuntime();
        Process child = runtime.exec(fina);             
                       
   Process p = Runtime.getRuntime().exec ("rundll32 SHELL32.DLL,ShellExec_RunDLL "+dat);
  }catch(IOException e){
     e.printStackTrace();
  } 
    }
    
}
