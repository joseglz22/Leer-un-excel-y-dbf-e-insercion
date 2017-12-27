/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

import static convscafe16.FXMLDocumentController.d10c1;
import static convscafe16.FXMLDocumentController.d8c1;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import jxl.read.biff.BiffException;

/**
 *
 * @author 
 */
public class FXMLDocumentController implements Initializable  {
    public static String d8c1,d10c1, d10c2,d45c1,d45c4;
    public static String dirrecc=null;
     public static ArrayList log1 = new ArrayList(), log2 =new ArrayList(), log3 =new ArrayList();
    public static String direct=null,ndirect=null, nids=null ;
    public static int  registrost;
    public static double sumat;
    public static LocalDate nfecha;
    public static String rt, rutec8;
  public static int nh;
  public static String fechagen,fech,fech2,cidocum01, ca, cc,p10ca,p10cb,cond ;
  public static String idecol, idecol2;
    public static   Boolean Bandera=false;
  public static String condominio, prubeal1;
    @FXML  Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
      Alert alert = new Alert(AlertType.NONE);
    @FXML  ComboBox bx;
    @FXML private TextField  P8A, P10A,P10B,P45A,P45B;
      
    @FXML  private DatePicker datepicker = new DatePicker();
    @FXML  private Label l1, l2,l3,l4,l5;
   
    private boolean fin=false;
    @FXML  private Button button;
     
    @FXML  private ProgressBar pb;
   @FXML  private ProgressIndicator pi;
      
   
    @FXML@SuppressWarnings("UnusedAssignment")
  private void generar(ActionEvent event) throws IOException, BiffException {
           
                  
        
        condominio = bx.getSelectionModel().getSelectedItem().toString();
       
        
         nfecha=datepicker.getValue();
        
        
            cidocum01=P8A.getText();
             ca=P45A.getText();
             cc=P45B.getText();
              p10ca=P10A.getText();
              p10cb=P10B.getText();
         
              
             
        if(  condominio.equals("Condominio") ||nfecha == null||cidocum01.equals("")    ||ca.equals("")  || cc.equals("")|| p10ca.equals("")||p10cb.equals("")){
         
        alert1.setTitle("Validacion de datos");
        alert1.setHeaderText(null);
        alert1.setContentText("Ingresa los valores");
        alert1.showAndWait();
        
        }else{
        
           // Tomamos el condominio
            if(FXMLDocumentController.isNumeric(cidocum01) && FXMLDocumentController.isNumeric(ca)&& FXMLDocumentController.isNumeric(cc) && FXMLDocumentController.isNumeric(p10ca)&& FXMLDocumentController.isNumeric(p10cb) ){
            
           
       fech = datepicker.getValue().format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));
         fech2 = datepicker.getValue().format(DateTimeFormatter.ofPattern("MM/dd/YYYY"));
        
            
      
       cond=condominio;
        System.out.println(cond);
       
      /* if(cond.equals("CarsoCorp")){
       cond="CARSOCORP";
      }else if(cond.equals("GanteDoce")){
      cond="GANTE12";
      }else if(cond.equals("PlazaBella")){
      cond="pbella";
      }else if(cond.equals("SanMartino")){
      cond="sanmo";
      }
     */  
       
       
       
       
       
    FileChooser chooser = new FileChooser();
    chooser.setTitle("Abrir Data de "+condominio);
     // Set extension filter
     FileChooser.ExtensionFilter extFilter = 
                        new FileChooser.ExtensionFilter(condominio+" Archivo xls(*.xls)", "*.xls");
                chooser.getExtensionFilters().add(extFilter);
                File defaultDirectory = new File("c:/FEabril13/"+cond);
                chooser.setInitialDirectory(defaultDirectory);
               // Show open file dialog  
    File file = chooser.showOpenDialog(new Stage());
    
    
     try{ 
  
      String fromFile = file.getAbsolutePath();
       rt=fromFile;
      
       
       //para los iva 0
      if(condominio.equals("Alameda") || condominio.equals("CARSOFFCC")|| condominio.equals("Cervantes") ||condominio.equals("Claudel") || condominio.equals("Pissarro") || condominio.equals("Renoir")  ){
             
        Direction0 di=new Direction0();
                    di.obdir(); 
       
       System.out.println(direct);
          
       
       
       }else{ //para los iva 16
         Direction di=new Direction();
                    di.obdir(); 
       
       System.out.println(direct);
          
       
       
       
       
       }
       
       
      
       
       
      if(file.getName().contains(condominio.toUpperCase()) ||file.getName().contains(condominio) || file.getName().contains(condominio.toLowerCase())){
         
                ndirect=direct;
                

           
                 
       Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
      alert.setTitle("Validacion de datos");
        alert.setHeaderText(null);
        alert.setContentText("Son correctos los datos? \n" +
                            "Condominio seleccionado: "+condominio +"\n\n" +
                            "Data del condominio:["+file.getName() +"]\n\n" +
                            "Direccion: "+ndirect +"\n" +
                            "Num: "+nids+"\n" +
                            "PARAM8: " +"\n"+
                            "Fecha : " +fech+""+"\n"+
                            "cidocum01 :"+cidocum01 +"\n"+
                            "PARAM45\n" +
                            "Columna A : "+ca+"\n"+
                            "Columna C : "+cc +"\n"+
                            "PARAM10 \n"+
                            "Columna A : " + p10ca+"\n"+
                            "Columna B : "+p10cb );

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            // ... user chose OK
            
            
            
            if(condominio.equals("Alameda") || condominio.equals("CARSOFFCC")|| condominio.equals("Cervantes") ||condominio.equals("Claudel") || condominio.equals("Pissarro") || condominio.equals("Renoir")  ){
            
            alert1.setTitle("Selecion "+ condominio);
            alert1.setHeaderText(null);
            alert1.setContentText("El condominio:"+condominio+" es de iva 0 \n"); 
            alert1.showAndWait();

          DParam8io dt=new DParam8io();
                     dt.dprm8();
                     
                     
             DParam45io egre=new DParam45io();
                     egre.dprm45();
             param10io par10=new param10io();
                    par10.p10();
                    
        
            }else{
             
              
              DParam8 dt=new DParam8();
                     dt.dprm8();
                 if(Bandera==true){
                 System.out.println("paso aqui");
                 }else{
                     
             DParam45 egre=new DParam45();
                     egre.dprm45();
             param10 par10=new param10();
                    par10.p10();
                 }
                
                    // generacion del log
                     
            }
            
                   Log lg=new Log();   
                     lg.generalog();   
                    
                     
                     
                     if(condominio.equals("Ginza")){
                       alert1.setTitle("Condominio: "+ condominio);
                        alert1.setHeaderText(null);
                        alert1.setContentText("Recuerda cambiar el Formato OEM al agregar los datos en DBFViewer\n"); 
                        alert1.showAndWait();

                     }else  if(condominio.equals("Altavista")){
                       alert1.setTitle("Condominio: "+ condominio);
                        alert1.setHeaderText(null);
                        alert1.setContentText("Recuerda cambiar el Formato OEM al agregar los datos en DBFViewer\n"); 
                        alert1.showAndWait();

                     }
                     
                     
             System.exit(0);
        } else {
        
        }
       
       
            }else{
        alert1.setTitle("Validacion de datos");
        alert1.setHeaderText(null);
        alert1.setContentText("El archivo no concuerda con el condominio \n");
               
        alert1.showAndWait();
               //   System.exit(0);   
                    }
       
            }catch(IOException e){
     // e.printStackTrace();
    //Stage.display(file);
        alert1.setTitle("Error");
        alert1.setHeaderText(null);
        alert1.setContentText("Errores probables: \n"
                            + "No se encontro la carpeta destino data\n"
                             + "Archivos generados abiertos");
        alert1.showAndWait();
  
      
   } 
        
        } else {
        alert1.setTitle("Validacion de datos");
        alert1.setHeaderText(null);
        alert1.setContentText("No se aceptan letras verifica que los campos \n"
                + "contengan los numeros correspondientes");
        alert1.showAndWait();
        
            }
            
            }
      
    }
    
    
    @FXML    private void Borrar1(ActionEvent event) throws Throwable{
        
        try{
             super.finalize();
             P8A.setText("");
             P45A.setText("");
             P45B.setText("");
             P10A.setText("");
             P10B.setText("");
                    direct=null;
                    nids=null;
                     bx.getSelectionModel().select("Condominio");
                 nfecha=null;
                   d8c1="";
                   l1.setText("");
                   l2.setText("");
                   l3.setText("");
                   l4.setText("");
                   l5.setText("");
                    System.out.println("Finalizando el Objeto");
                   
                   
                   
        }catch(Exception e){
      
       
        }
                    
    }
    
        
           
    
     @FXML    private void mostrar(ActionEvent event) throws IOException, InterruptedException{
       
       nuevaVentana();
       
         l1.setText("");
         l4.setText("");
        l5.setText("");
        l2.setText("");
        l3.setText("");
        button.setDisable(false);
       long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo
        
         // pb.setProgress(ProgressBar.INDETERMINATE_PROGRESS);
         
        
         condominio = bx.getSelectionModel().getSelectedItem().toString();
         
         
          //Creamos el hilo 1 que hereda de la clase Thread
        
       
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
         Hilo3 hilo3 = new Hilo3();
         // hil0 hilo = new hil0();
         
                     hilo1.start();
                     hilo2.start();         
                     hilo3.start(); 
          
            try {// espera hasta que terminen los otros hilos
      System.out.println("Espera finalizacion de los otros hilos.");
                   hilo1.join();
              hilo2.join(); 
              hilo3.join();
              
              
    } catch (InterruptedException e) {
      System.out.println("Interrupcion del hilo principal");
    }
            
    System.out.println("El hilo Uno esta¡ vivo: " + hilo1.isAlive());
    System.out.println("El hilo Dos esta¡ vivo " + new Thread(hilo2).isAlive());
    System.out.println("El hilo Tres esta¡ vivo: " + new Thread(hilo3).isAlive());
    
    
    
    
    System.out.println("Finalizaron.");
    fin=true;
          
                    l1.setText(d8c1);
                    l4.setText(d10c1);
                    l5.setText(d8c1);
                    l2.setText(d45c1);
                    l3.setText(d8c1);
    
             P8A.setText(Hilo1.vl8);
          P10A.setText(Hilo2.vl10);
          P10B.setText(Hilo1.vl8);
          P45A.setText(Hilo3.vl45);
          P45B.setText(Hilo1.vl8);
          
         
       //l1.setText(d8c1);     
       //   dbf8 pr8=new dbf8();
       //   pr8.d8();
       // dbf10 pr10=new dbf10();
       // pr10.d10();
        //l4.setText(d10c1);
        //l5.setText(d8c1);
       // dbf45 pr45=new dbf45();
       // pr45.d45();
       // l2.setText(d45c1);
        //l3.setText(d8c1);
        
     
         P8A.setEditable(true);
    
        
       
                    TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
  tiempo = (TFin - TInicio)/1000; //Calculamos los milisegundos de diferencia
  System.out.println("Tiempo de ejecución en segundos: " + tiempo+ " "+fin); 
  
    
  
    }
     
 
       @FXML private void nuevaVentana() {
          
         

           
           
        Group root = new Group();
        Stage primaryStage= new Stage();
        Label label = new Label("Datos leidos da clic en Aceptar para continuar");
		//El grupo que se desea agregar, y el tamaño ancho y alto
		Scene scene = new Scene( root, 245, 80 );
		//Titulo de la ventana
		primaryStage.setTitle("Leyendo Datos....");
		//Se agrega la scena
		primaryStage.setScene( scene );
		root.getChildren().add(label);
		//Creacion del boton
		Button boton = new Button("Aceptar");
		boton.setDefaultButton(true);
                
		boton.setOnAction((ActionEvent action) -> {
                    //Platform.exit();
                    
                    
                    primaryStage.close();
        });
		//Tamaño del boton
		boton.setPrefSize(100, 25);
		//Tamaño del boton
		//Posicion dle boton
		boton.setLayoutX(70);
		boton.setLayoutY(30);
		
              		//Se agrega el boton
		root.getChildren().add(boton);
		
		//Para mostrar la visible, semejante al setVisible(true)
		primaryStage.show();		
     
        
    }
   
    
    @FXML    private void Salir1(ActionEvent event){
     System.exit(0);
    }
  
             private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
     
    public void nad(){
    
    System.out.println("Fin");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    bx.getItems().removeAll(bx.getItems());
    bx.getItems().addAll(
            "Altavista",
            "Arcos",
            "Bosques",
            "CarsoCorp",
            "CarsoPCII",
            "Chapultepec",
            "Cuajimalpa",
            "Cuautitlan",
            "Cuernavaca",
            "Galerias",
            "Gante12",
            "Ginza",
            "Hacienda",
            "Industrial",
            "Interlomas",
            "Izcalli",
            "Jardines",
            "Lilas",
            "Lindavista",
            "LuisCabrera",
            "Medico",
            "PBella",
            "SanFrancisco",
            "SanMo",
            "Shopping",
            "Alameda", 
            "CARSOFFCC", 
            "Cervantes", 
            "Claudel",
            "Pissarro",
            "Renoir");
    
    
    bx.getSelectionModel().select("Condominio");
    }


    
}
