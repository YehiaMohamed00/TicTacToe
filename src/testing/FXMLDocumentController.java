/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 *
 * @author yehiaa
 */
public class FXMLDocumentController implements Initializable {
    
    public static Parent root1;
    public static Scene game;
    public static Stage s;
    
    public static Playerr p1;
    public static Playerr p2;
    public static Stage sn;
    @FXML
    private TextField inp1;
    @FXML
    private TextField inp2;
    
    @FXML
    private TextField inr;
    @FXML
    private Button save;
    @FXML
    private Label error;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        inp1.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)){
                inp2.requestFocus();
            }
        });
        
        inp2.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)){
                inr.requestFocus();
            }
        });
        
        inr.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)){
                save.requestFocus();
            }
        });
        
        save.setOnKeyPressed(e -> {
        
            switch(e.getCode()){
                case ENTER:
                 trySave();
            
            }
        });
        
    }    
    
    

    @FXML
    private void save(ActionEvent event) {
        
        trySave();
    }
    
    public void save() throws Exception{
    
        p1 = new Playerr(inp1.getText());
        p2 = new Playerr(inp2.getText());
        
        p1.Score = 0;
        p2.Score = 0;
        
        
       
        
        s = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Board.fxml"));
            root1 = loader.load();
            
            BoardController control = loader.getController();
            
            control.maxScore = Integer.parseInt(inr.getText());
        
        
        game = new Scene(root1,600,592);

        s.setScene(game); 
        s.show();
        
        sn.close();
    
    }
    public void trySave(){
    try{save();
    
    }
    catch(Exception E){
    error.setText("اكتب اي حاجة هنا مش قادر اتنفس");
    inr.requestFocus();
    }
    
    }
}
