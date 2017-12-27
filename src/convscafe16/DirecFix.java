/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convscafe16;

/**
 *
 * @author cnava
 */
public class DirecFix {
    public void reparadir(){
    
                   System.out.print(FXMLDocumentController.direct +" |anterior"+"\n");
                   FXMLDocumentController.direct=FXMLDocumentController.direct.replace("M�xico", "México");
                  
                   FXMLDocumentController.direct=FXMLDocumentController.direct.replace("�lvaro Obreg�n", "Álvaro Obregón");
               
                  FXMLDocumentController.direct=FXMLDocumentController.direct.replace("Ju�rez", "Juárez");
                  FXMLDocumentController.direct=FXMLDocumentController.direct.replace("Mart�n", "Martín");
                  FXMLDocumentController.direct=FXMLDocumentController.direct.replace("Cuautitl�n", "Cuautitlán");
                  FXMLDocumentController.direct=FXMLDocumentController.direct.replace("Atizap�n", "Atizapán");
                  FXMLDocumentController.direct=FXMLDocumentController.direct.replace("L�pez", "López");
                  FXMLDocumentController.direct=FXMLDocumentController.direct.replace("Cuauht�moc", "Cuauhtémoc");
                         
                   System.out.print(FXMLDocumentController.direct +" |final \n");
                
               
                   
    
    }
}
