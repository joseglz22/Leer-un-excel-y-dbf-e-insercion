package convscafe16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;





public class DParam8io
{
  @FXML
  Alert alert = new Alert(Alert.AlertType.INFORMATION);
  ArrayList script = new ArrayList();
  
  public DParam8io() {}
  
  void dprm8() throws IOException, BiffException {
    Workbook workbook = Workbook.getWorkbook(new File(FXMLDocumentController.rt));
    
    Sheet sheet = workbook.getSheet(0);
    


    File folder = new File("C:\\data");
    
    if (folder.exists())
    {
      System.out.println("existe carpeta");
    } else {
      System.out.println("no existe carpeta");
      
      folder.mkdir();
    }
    




    Date fecha = new Date();
    


    String fe = new SimpleDateFormat("dd-MM-yyyy").format(fecha);
    String dat = "C:\\data\\" + fe + FXMLDocumentController.cond + "copia8.csv";
    FXMLDocumentController.rutec8 = dat;
    BufferedWriter salida = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dat), "Cp1252"));
    
        String val;
      //File file = new File(dat);



      int fila,regs;





    int Folio = 0;
    int concentradora = 1;
    int condominio = 2;
    int ocupante = 3;
    int nombre = 4;
    int recibo = 5;
    int cmetodopag = 6;
    int indiviso = 7;
    int descr = 8;
    int importe = 9;
    int Subtotal = 10;
    int IVA = 11;
    int cidclien01 = 12;
    int crazonso01 = 13;
    int crfc = 14;
    int Texto35 = 15;
    int cnumctapag = 16;
    
    int ids = Integer.parseInt(FXMLDocumentController.cidocum01);
    double sumatoria = 0.0D;
    try
    {
      for ( fila = 1; fila < sheet.getRows(); fila++)
      {


        System.out.print(ids + "    |");
        String var = Integer.toString(ids);
        salida.write(var);
        




        String moneda = "4";
        System.out.print(moneda + "  |");
        salida.write(";");
        salida.write(moneda);
        




        String paridad = FXMLDocumentController.nids;
        
        System.out.print(paridad + " |");
        salida.write(";");
        salida.write(paridad);
        




        String nada = "";
        String serA = "";
        if (FXMLDocumentController.condominio.equals("Pissarro"))
        {
          System.out.print(serA + " |");
          salida.write(";");
          serA = "A";
        }
        else {
          System.out.print(nada + " |");
          salida.write(";");
          serA = "";
        }
        
        System.out.print(serA +" |");
        salida.write(";");
        salida.write(serA);


        

        String fol = sheet.getCell(Folio, fila).getContents();
        System.out.print(fol + " |");
        salida.write(";");
        salida.write(fol);
        



        String dte = FXMLDocumentController.fech;
        System.out.print(dte + " |");
        salida.write(";");
        salida.write(dte);
        



        String clid = sheet.getCell(cidclien01, fila).getContents();
        System.out.print(clid + " |");
        salida.write(";");
        salida.write(clid);
        




        String aun1, oprs;
        aun1 = sheet.getCell(crazonso01, fila).getContents(); //setear la celda leida a nombre
        //JOptionPane.showMessageDialog(null, "se encontro : " + oprs  );
        if(aun1.contains("\n")){
         oprs=aun1.replace("\n"," "); 
         FXMLDocumentController.log1.add(fila +" "+ oprs);

        }else{
        oprs = sheet.getCell(crazonso01, fila).getContents();

        }

        if(oprs.contains("�O")){
        val=oprs.replace("�", "Ð");
        //JOptionPane.showMessageDialog(null, "se encontro ñ: " + val  );
        }else if(oprs.contains("�E")){
             val=oprs.replace("�", "¥"); 

        }else{

        val=oprs;
        }

        if(val.contains("'")){
             FXMLDocumentController.Bandera=true;
           FXMLDocumentController.log3.add(fol+ " " + val);
        alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Error: \n"
                                   + "Se detecto una comilla en el Folio: "+fol+"\n"
                                   + "Revisar el data y remplazar la comilla, no se insertaran los registros");
                alert.showAndWait();


        }


        val=val.trim();
        salida.write(";"); //pasamos a la siguiente columna
        salida.write(val);
        System.out.print(val +" |");










String cr;
        String aux2 = sheet.getCell(crfc, fila).getContents();
        
        if (aux2.contains("\n")) {
         cr  = aux2.replace("\n", " ");
          FXMLDocumentController.log1.add(fila + " " + oprs);
        }
        else {
          cr = sheet.getCell(crfc, fila).getContents();
        }
        

         cr = cr.replaceAll(" ", "");
        if (cr.length() < 12) {
          FXMLDocumentController.log2.add(fila + " " + cr);
          System.out.println("Error en RFC " + cr);
        }
        


        System.out.print(cr + " |");
        salida.write(";");
        salida.write(cr);
        



        String j = "0";
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        


        String dte1 = FXMLDocumentController.fech;
        System.out.print(dte1 + " |");
        salida.write(";");
        salida.write(dte1);
        
        dte1 = FXMLDocumentController.fech;
        System.out.print(dte1 + " |");
        salida.write(";");
        salida.write(dte1);
        



        String k = "30/12/1899";
        System.out.print(k + "  |");
        salida.write(";");
        salida.write(k);
        

        System.out.print(k + "  |");
        salida.write(";");
        salida.write(k);
        

        String nm = "1";
        System.out.print(nm + "  |");
        salida.write(";");
        salida.write(nm);
        

        String p = "1.00";
        System.out.print(p + "  |");
        salida.write(";");
        salida.write(p);
        
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        

        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(nm + "  |");
        salida.write(";");
        salida.write(nm);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(nm + "  |");
        salida.write(";");
        salida.write(nm);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(nm + "  |");
        salida.write(";");
        salida.write(nm);
        


        String ae = sheet.getCell(importe, fila).getContents();
        System.out.print(ae + " |");
        
        double sumas = Double.parseDouble(ae);
        
        salida.write(";");
        salida.write(ae);
        


        String ib = "0";
        System.out.print(ib + "  |");
        salida.write(";");
        salida.write(ib);
        

        String oo = "0.00";
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        


        String j2 = sheet.getCell(importe, fila).getContents();
        System.out.print(j2 + " |");
        salida.write(";");
        salida.write(j2);
        

        System.out.print(j2 + " |");
        salida.write(";");
        salida.write(j2);
        
        System.out.print(p + "  |");
        salida.write(";");
        salida.write(p);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        

        System.out.print(k + "  |");
        salida.write(";");
        salida.write(k);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        

        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(p + "  |");
        salida.write(";");
        salida.write(p);
        


        String DT2 = "12/30/1899 00:00:00:000";
        System.out.print(DT2 + " |");
        salida.write(";");
        salida.write(DT2);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        

        String NNN = "202";
        System.out.print(NNN + " |");
        salida.write(";");
        salida.write(NNN);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        
        System.out.print(oo + "  |");
        salida.write(";");
        salida.write(oo);
        
        System.out.print(nm + "  |");
        salida.write(";");
        salida.write(nm);
        
        System.out.print(j + "  |");
        salida.write(";");
        salida.write(j);
        

        String DRE = FXMLDocumentController.ndirect;
        System.out.print(DRE + " |");
        
        salida.write(";");
        salida.write(DRE);
        






        String DDD = sheet.getCell(Texto35, fila).getContents();
        System.out.print(DDD + " |");
        salida.write(";");
        salida.write(DDD);
        

        System.out.print(nm + "  |");
        salida.write(";");
        salida.write(nm);
        
        System.out.print(nm + "  |");
        salida.write(";");
        salida.write(nm);
        
        System.out.print(nada + " |");
        salida.write(";");
        salida.write(nada);
        

        String BNK = sheet.getCell(cnumctapag, fila).getContents();
        if (BNK.contains("\n")) {
          BNK = BNK.replace("\n", "");
        }
        
        BNK = BNK.trim();
        
        System.out.print(BNK + " |");
        salida.write(";");
        salida.write(BNK);
        
        String proyec="0";
        salida.write(";"); //escribimos importe 
        salida.write(proyec);


        String cicuenta="0";
        salida.write(";"); //escribimos importe 
        salida.write(cicuenta);



        ids += 1;
        sumatoria += sumas;
        System.out.println("\n");
        salida.write("\n");
        

        String dte2 = FXMLDocumentController.fech2;
        

        String query = "insert into \"C:\\FEabril13\\" + FXMLDocumentController.cond + "\\MGW10008.dbf\" values (" + var + "," + moneda + "," + paridad + ",'" + serA + "'," + fol + ",(CTOD('" + dte2 + "'))," + clid + ",'" + val + "','" + cr + "'," + j + ",(CTOD('" + dte2 + "')),(CTOD('" + dte2 + "')),(CTOD('" + k + "')),(CTOD('" + k + "'))," + nm + "," + p + ",'" + nada + "','" + nada + "'," + j + "," + j + "," + j + "," + nm + "," + j + "," + nm + "," + j + "," + j + "," + j + "," + j + "," + j + "," + nm + "," + ae + "," + ib + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + "," + j2 + "," + j2 + "," + p + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + "," + oo + ",'" + nada + "','" + nada + "','" + nada + "',(CTOD('" + k + "'))," + oo + "," + oo + "," + oo + "," + oo + ",'" + nada + "','" + nada + "','" + nada + "','" + nada + "'," + oo + "," + oo + "," + j + "," + j + "," + j + "," + j + "," + p + ",(CTOD('" + DT2 + "'))," + oo + "," + NNN + "," + j + "," + j + "," + nm + "," + j + ",'" + DRE + "','" + DDD + "'," + nm + "," + nm + ",'" + nada + "','" + BNK +"',"+proyec+","+ cicuenta+");"+"\n";
        




        script.add(query);
      }
      


       regs = fila - 1;
      

      FXMLDocumentController.registrost = regs;
      FXMLDocumentController.sumat = sumatoria;
      
      salida.close();
      
      String sqll = "C:\\data\\" + fe + FXMLDocumentController.cond + "sql08.sql";
     File filesql = new File(sqll);
     try (
                
                //FileWriter wsql = new FileWriter(filesql)   
            java.io.BufferedWriter wsql = new java.io.BufferedWriter(new OutputStreamWriter( new FileOutputStream(sqll), "Cp1252"));
    
                ) {
            Iterator<String> nombreIterator = script.iterator();
            while(nombreIterator.hasNext()){
                String elemento = nombreIterator.next();
                System.out.print(elemento+" \n ");
                wsql.write(elemento+"\n");
                
                // Runtime runtime = Runtime.getRuntime();
                // Process child = runtime.exec("C:\\\\Program Files\\\\DBFCommander\\\\DBFCommander.exe -q  "+elemento);
                
            }       }




if(FXMLDocumentController.Bandera==false){

  String fina = "C:\\Program Files\\DBFCommander\\DBFCommander.exe -qf "+ sqll;
      System.out.print(fina+" \n ");
      
        Runtime runtime = Runtime.getRuntime();
        Process child = runtime.exec(fina);    
      
}else{
   
   File fichero = new File(dat);
   File fichero2 = new File(sqll);
   if (fichero.delete()&&fichero2.delete()){
        System.out.println("los ficheros ha sido borrados satisfactoriamente");}
   else{
        System.out.println("El fichero no puede ser borrado");}



}
}catch(Exception e){
alert.setTitle("Error1");
        alert.setHeaderText(null);
        alert.setContentText("Errores probables1: \n"
                           + "El archivo seleccionado es erroneo o no cumple con la estructura\n"
                           + "Se cerrara el programa");
        alert.showAndWait();
     e.printStackTrace();
    System.exit(0);
}


 try{ 
   Process p = Runtime.getRuntime().exec ("rundll32 SHELL32.DLL,ShellExec_RunDLL "+dat);
  }catch(IOException e){
     e.printStackTrace();
  } 
 
//Desktop.getDesktop().open(file);
//Desktop.getDesktop().open(fegresos);

    }
    
}
