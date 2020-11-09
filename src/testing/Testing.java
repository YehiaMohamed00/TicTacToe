/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static testing.FXMLDocumentController.sn;

/**
 *
 * @author yehiaa
 */
public class Testing extends Application {
    
    public static Parent root;
    public static Scene home;
    
    @Override
    public void start(Stage stage) throws Exception {
        sn = stage;
        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        home = new Scene(root,446,497);
        
        stage.setScene(home);
        stage.show();
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}
