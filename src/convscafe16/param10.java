package convscafe16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class param10
{
  public param10() {}
  
  public void p10() throws IOException, BiffException
  {
    ArrayList script = new ArrayList();
    Workbook workbook = Workbook.getWorkbook(new File(FXMLDocumentController.rt));
    





    Sheet sheet = workbook.getSheet(FXMLDocumentController.nh);
    



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
    String dat = "C:\\data\\" + fe + FXMLDocumentController.condominio + "copia10.csv";
    
    BufferedWriter salida = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dat), "Cp1252"));
    





int fila;


    int Folio = 0;
    int concentradora = 1;
    int condominio = 2;
    int ocupante = 3;
    int nombre = 4;
    int recibo = 5;
    int indiviso = 6;
    int cmetodopag = 7;
    int descr = 8;
    int importe = 9;
    int Subtotal = 10;
    int IVA = 11;
    int cidclien01 = 12;
    int crazonso01 = 13;
    int crfc = 14;
    int Texto35 = 15;
    int cnumctapag = 16;
    
    int ids = Integer.parseInt(FXMLDocumentController.p10ca);
    int ids2 = Integer.parseInt(FXMLDocumentController.p10cb);
    
    String fol;
    
    for ( fila = 1; fila < sheet.getRows(); fila++)
    {



      System.out.print(ids + "    |");
      String var = Integer.toString(ids);
      salida.write(var);
      



      System.out.print(ids2 + "    |");
      String var2 = Integer.toString(ids2);
      salida.write(";");
      salida.write(var2);
      



      String nm = "1";
      System.out.print(nm + "  |");
      salida.write(";");
      salida.write(nm);
      



      String moneda = "4";
      System.out.print(moneda + "  |");
      salida.write(";");
      salida.write(moneda);
      







      String paridad = sheet.getCell(indiviso, fila).getContents();
      
      System.out.print(paridad + " |");
      



      salida.write(";");
      salida.write(paridad);
      




      String j = "0";
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
      


      String mone = FXMLDocumentController.idecol2;
      System.out.print(mone + "  |");
      salida.write(";");
      salida.write(mone);
      

      System.out.print(j + "  |");
      salida.write(";");
      salida.write(j);
      



      fol = sheet.getCell(importe, fila).getContents();
      System.out.print(fol + " |");
      salida.write(";");
      salida.write(fol);
      
      System.out.print(fol + " |");
      salida.write(";");
      salida.write(fol);
      


      System.out.print(j + "  |");
      salida.write(";");
      salida.write(j);
      
      System.out.print(j + "  |");
      salida.write(";");
      salida.write(j);
      


      String impor = sheet.getCell(Subtotal, fila).getContents();
      System.out.print(impor + " |");
      salida.write(";");
      salida.write(impor);
      

      String iba = sheet.getCell(IVA, fila).getContents();
      System.out.print(iba + " |");
      salida.write(";");
      salida.write(iba);
      











      String d16 = "16";
      System.out.print(d16 + "  |");
      salida.write(";");
      salida.write(d16);
      
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
      
      System.out.print(j + "  |");
      salida.write(";");
      salida.write(j);
      
      System.out.print(j + "  |");
      salida.write(";");
      salida.write(j);
      
      System.out.print(j + "  |");
      salida.write(";");
      salida.write(j);
      
      System.out.print(fol + " |");
      salida.write(";");
      salida.write(fol);
      
      System.out.print(j + "  |");
      salida.write(";");
      salida.write(j);
      
      String nada = " ";
      System.out.print(nada + " |");
      salida.write(";");
      salida.write(nada);
      

      String descrb = sheet.getCell(descr, fila).getContents();
      String val;
      if (descrb.contains("�n"))
      {
         val = descrb.replace("�", "ó");
        
        System.out.print(val + " |");
        salida.write(";");
        salida.write(val);
      }
      else
      {
        System.out.print(descrb + " |");
        salida.write(";");
        val = descrb;
        salida.write(val);
      }
      




      String dos = "2";
      System.out.print(dos + " |");
      salida.write(";");
      salida.write(dos);
      

      System.out.print(nm + "  |");
      salida.write(";");
      salida.write(nm);
      

      System.out.print(nm + "  |");
      salida.write(";");
      salida.write(nm);
      


      String dte1 = FXMLDocumentController.fech;
      System.out.print(dte1 + " |");
      salida.write(";");
      salida.write(dte1);
      
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
      
      System.out.print(nada + " |");
      salida.write(";");
      salida.write(nada);
      System.out.print(nada + " |");
      salida.write(";");
      salida.write(nada);
      System.out.print(nada + " |");
      salida.write(";");
      salida.write(nada);
      


      String dd = "0";
      System.out.print(dd + "  |");
      salida.write(";");
      salida.write(dd);
      
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
      
      String dn = "12/30/1899 00:00:00:000";
      System.out.print(dn + "  |");
      salida.write(";");
      salida.write(dn);
      
      System.out.print(j + "  |");
      salida.write(";");
      salida.write(j);
      
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
      

      ids += 1;
      ids2 += 1;
      

      System.out.println("\n");
      salida.write("\n");
      


      String dte2 = FXMLDocumentController.fech2;
      


      String query = "insert into \"C:\\FEabril13\\" + FXMLDocumentController.cond + "\\MGW10010.dbf\" values (" + var + "," + var2 + "," + nm + "," + moneda + "," + paridad + "," + j + "," + nm + "," + j + "," + nm + "," + mone + "," + j + "," + fol + "," + fol + "," + j + "," + j + "," + impor + "," + iba + "," + d16 + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + j + "," + fol + "," + j + ",'" + nada + "','" + val + "'," + dos + "," + nm + "," + nm + ",(CTOD('" + dte2 + "'))," + j + "," + j + "," + j + "," + nm + "," + j + "," + j + "," + j + "," + nm + "," + j + ",'" + nada + "','" + nada + "','" + nada + "',(CTOD('" + dd + "'))," + j + "," + j + "," + j + "," + j + ",(CTOD('" + dn + "'))," + j + ",'" + nada + "'," + j + "," + j + "," + j + ");\n";
      





      script.add(query);
    }
    



    salida.close();
    

    String sqll = "C:\\data\\" + fe + FXMLDocumentController.cond + "sql10.sql";
    File filesql = new File(sqll);
    FileWriter wsql = new FileWriter(filesql);
    

    Iterator<String> nombreIterator = script.iterator();
    while (nombreIterator.hasNext()) {
      String elemento = (String)nombreIterator.next();
      System.out.print(elemento + " \n ");
      wsql.write(elemento + "\n");
    }
    



    wsql.close();
    







 try{ 
     
     
     
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
