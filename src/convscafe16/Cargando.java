/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

/**
 *
 * @author 
 */
public class Cargando {
     @FXML  public ProgressBar pb;
    @FXML  public ProgressIndicator pi;
    public void cbarra(){
      pb.setProgress(ProgressBar.INDETERMINATE_PROGRESS);
          pi.setProgress(ProgressBar.INDETERMINATE_PROGRESS);
        
    
    
    }
}
