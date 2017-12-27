/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author 
 */
public class ConvSCaFE16 extends Application {
     
      // 
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        
        
        
         stage.setTitle("ConvSCaFE16 v1.3");
        stage.show();
    }

    
    
     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
        
        launch(args);
        
    }
    
}
