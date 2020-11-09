/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import static testing.FXMLDocumentController.p1;

/**
 *
 * @author yehiaa
 */
public class WonController implements Initializable {

    @FXML
    public static Label wonLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        wonLabel.setText("Hi");
        
    }
    
    

    
    
}
