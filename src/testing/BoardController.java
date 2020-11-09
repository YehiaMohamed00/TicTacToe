/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static testing.FXMLDocumentController.p1;
import static testing.FXMLDocumentController.p2;
import static testing.FXMLDocumentController.s;
import static testing.FXMLDocumentController.sn;


/**
 *
 * @author yehiaa
 */
public class BoardController implements Initializable,EventHandler<ActionEvent> {
    
    public int maxScore;
    public String whoseTurn = "X";
    boolean first,second,third,fourth,fifth,sixth,seventh,eigth,ninth;
    Button re,ch;
    Stage won;
    
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Label p1name;
    @FXML
    private Label p1score;
    @FXML
    private Label p2name;
    @FXML
    private Label p2score;
    @FXML
    private Button resetS;
    @FXML
    private Button startG;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         
        startG.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.S)){
                startG();
            }
        });
        
        
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        this.avoidDoubles(event);
    }

    @FXML
    private void resetS(ActionEvent event) {  
        resetS();
    }

    @FXML
    private void startG(ActionEvent event) {
    startG();
    }
    
    public void changeLabel(){

    p1name.setText("Player 1 : " + p1.name);
    p1score.setText("Score : "+p1.Score);
    p2name.setText("Player 2 : " + p2.name);
    p2score.setText("Score : "+ p2.Score);
    
    }
    public void sleep(){
    try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println("Ana Hena!");
            }
    }
    public void avoidDoubles(ActionEvent event){
    if(event.getSource() == b1){
            
        if("X".equals(whoseTurn) && (b1.getText()).equals(""))
        {
      
            b1.setTextFill(Color.RED);
            b1.setText(whoseTurn);
            checkWIN();
            
            whoseTurn = "O";
        }        
        else if("O".equals(whoseTurn) && (b1.getText()).equals(""))
        {
            b1.setTextFill(Color.BLUE);
            b1.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
            
            
        }
        else{
        
        notHere();
        }
        
        }
        if(event.getSource() == b2){
        
            if("X".equals(whoseTurn) && (b2.getText()).equals(""))
        {
      
            b2.setTextFill(Color.RED);
            b2.setText(whoseTurn);
            checkWIN();
            whoseTurn = "O";
            
            
        }        
        else if("O".equals(whoseTurn) && (b2.getText()).equals(""))
        {
            b2.setTextFill(Color.BLUE);
            b2.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
            
        }
        else{
            
        notHere();
        }
        }
        if(event.getSource() == b3){
        
        if("X".equals(whoseTurn) && (b3.getText()).equals(""))
        {
      
            b3.setTextFill(Color.RED);
            b3.setText(whoseTurn);
            checkWIN();
            whoseTurn = "O";
            
        }        
        else if("O".equals(whoseTurn) && (b3.getText()).equals(""))
        {
            b3.setTextFill(Color.BLUE);
            b3.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
            
        }
        else{
            
        notHere();
        }
        }
        
        if(event.getSource() == b4){
        
        if("X".equals(whoseTurn) && (b4.getText()).equals(""))
        {
      
            b4.setTextFill(Color.RED);
            b4.setText(whoseTurn);
            checkWIN();
            whoseTurn = "O";
            
        }        
        else if("O".equals(whoseTurn) && (b4.getText()).equals(""))
        {
            b4.setTextFill(Color.BLUE);
            b4.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
            
        }
        else{
            
        notHere();
        }
        }
        if(event.getSource() == b5){
        
        if("X".equals(whoseTurn) && (b5.getText()).equals(""))
        {
      
            b5.setTextFill(Color.RED);
            b5.setText(whoseTurn);
            checkWIN();
            whoseTurn = "O";
            
        }        
        else if("O".equals(whoseTurn) && (b5.getText()).equals(""))
        {
            b5.setTextFill(Color.BLUE);
            b5.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
            
        }
        else{
            
        notHere();
        }
        }
        if(event.getSource() == b6){
        
        if("X".equals(whoseTurn) && (b6.getText()).equals(""))
        {
      
            b6.setTextFill(Color.RED);
            b6.setText(whoseTurn);
            checkWIN();
            whoseTurn = "O";
            
        }        
        else if("O".equals(whoseTurn) && (b6.getText()).equals(""))
        {
            b6.setTextFill(Color.BLUE);
            b6.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
            
        }
        else{
            notHere();
        }
        }
        if(event.getSource() == b7){
        
         if("X".equals(whoseTurn) && (b7.getText()).equals(""))
        {
      
            b7.setTextFill(Color.RED);
            b7.setText(whoseTurn);
            checkWIN();
            whoseTurn = "O";
            
        }        
        else if("O".equals(whoseTurn) && (b7.getText()).equals(""))
        {
            b7.setTextFill(Color.BLUE);
            b7.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
            
        }
         else{
            
        notHere();
        }
        }
        if(event.getSource() == b8){
        
        if("X".equals(whoseTurn) && (b8.getText()).equals(""))
        {
      
            b8.setTextFill(Color.RED);
            b8.setText(whoseTurn);
           checkWIN();
            whoseTurn = "O";
            
        }        
        else if("O".equals(whoseTurn) && (b8.getText()).equals(""))
        {
            b8.setTextFill(Color.BLUE);
            b8.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
            
        }
        else{
            
        notHere();
        }
        }
        if(event.getSource() == b9){
        
        if("X".equals(whoseTurn) && (b9.getText()).equals(""))
        {
      
            b9.setTextFill(Color.RED);
            b9.setText(whoseTurn);
            checkWIN();
            whoseTurn = "O";
        }        
        else if("O".equals(whoseTurn) && (b9.getText()).equals(""))
        {
            b9.setTextFill(Color.BLUE);
            b9.setText(whoseTurn);
            checkWIN();
            whoseTurn = "X";
        }
        else{
            
        notHere();
        }
        }
    }
    
    public void checkWIN(){

        if( "X".equals(b1.getText()) && "X".equals(b2.getText()) && "X".equals(b3.getText())){
       
            p1.Score++;
            p1score.setText("Score : "+p1.Score);
            
            emptyCells();
            tryMaxScore();
            
        }
        
        if( "X".equals(b4.getText()) && "X".equals(b5.getText()) && "X".equals(b6.getText())){
            p1.Score++;p1score.setText("Score : "+p1.Score);
            
            emptyCells();
           tryMaxScore();
        }
        
        if( "X".equals(b7.getText()) && "X".equals(b8.getText()) && "X".equals(b9.getText())){
            p1.Score++;p1score.setText("Score : "+p1.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "X".equals(b1.getText()) && "X".equals(b4.getText()) && "X".equals(b7.getText())){
            p1.Score++;p1score.setText("Score : "+p1.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "X".equals(b2.getText()) && "X".equals(b5.getText()) && "X".equals(b8.getText())){
            p1.Score++;p1score.setText("Score : "+p1.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "X".equals(b3.getText()) && "X".equals(b6.getText()) && "X".equals(b9.getText())){
            p1.Score++;p1score.setText("Score : "+p1.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "X".equals(b1.getText()) && "X".equals(b5.getText()) && "X".equals(b9.getText())){
            p1.Score++;p1score.setText("Score : "+p1.Score);
            emptyCells();
            tryMaxScore();
        }
       
        if("X".equals(b3.getText()) && "X".equals(b5.getText()) && "X".equals(b7.getText())){
            p1.Score++;p1score.setText("Score : "+p1.Score);
            emptyCells();
            tryMaxScore();
        }
        
        ///////////////////////
        
        if( "O".equals(b1.getText()) && "O".equals(b2.getText()) && "O".equals(b3.getText())){
            p2.Score++;p2score.setText("Score : "+p2.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "O".equals(b4.getText()) && "O".equals(b5.getText()) && "O".equals(b6.getText())){
            p2.Score++;p2score.setText("Score : "+p2.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "O".equals(b7.getText()) && "O".equals(b8.getText()) && "O".equals(b9.getText())){
            p2.Score++;p2score.setText("Score : "+p2.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "O".equals(b1.getText()) && "O".equals(b4.getText()) && "O".equals(b7.getText())){
            p2.Score++;p2score.setText("Score : "+p2.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "O".equals(b2.getText()) && "O".equals(b5.getText()) && "O".equals(b8.getText())){
            p2.Score++;p2score.setText("Score : "+p2.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "O".equals(b3.getText()) && "O".equals(b6.getText()) && "O".equals(b9.getText())){
            p2.Score++;p2score.setText("Score : "+p2.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if( "O".equals(b1.getText()) && "O".equals(b5.getText()) && "O".equals(b9.getText())){
            p2.Score++;p2score.setText("Score : "+p2.Score);
            emptyCells();
            tryMaxScore();
        }
       
        if("O".equals(b3.getText()) && "O".equals(b5.getText()) && "O".equals(b7.getText())){
            p2.Score++;p2score.setText("Score : "+p2.Score);
            emptyCells();
            tryMaxScore();
        }
        
        if(isTie()){
            emptyCells();
        Stage sw1 = new Stage();
        
        
        GridPane p = new GridPane();
        Label l = new Label("It's a Tie!!");
        l.setFont(Font.font("Tahoma", 48.0));
        
        p.getChildren().add(l);
        p.setStyle("-fx-background-color: #bdbdbd;");
        p.setAlignment(Pos.CENTER);
        Scene s = new Scene(p,380,145);
        sw1.setScene(s);
        sw1.setTitle("OOPS!");
        sw1.show();
       

        sw1.setResizable(false);
        
        sleep();
        sw1.toBack();
        sw1.close();
        }
        
}
    
    public boolean isTie(){
        boolean isTie = false;

        first   = !(b1.getText().equals(""));
        second  = !(b2.getText().equals(""));
        third   = !(b3.getText().equals(""));
        fourth  = !(b4.getText().equals(""));
        fifth   = !(b5.getText().equals(""));
        sixth   = !(b6.getText().equals(""));
        seventh = !(b7.getText().equals(""));
        eigth   = !(b8.getText().equals(""));
        ninth   = !(b9.getText().equals(""));
        
        if( first && second && third && fourth && fifth && sixth && seventh && eigth && ninth ){
        isTie = true;
        }
        
        return isTie;
    }
    
    public void checkMaxScore()throws Exception{
    if(p1.Score == maxScore){ 

        won = new Stage();
        
        AnchorPane p = new AnchorPane();
        VBox v = new VBox();
        HBox h = new HBox();
        
        Label l = new Label(p1.name + " Won!!!");
        l.setFont(Font.font("Tahoma", 48.0));
        v.setAlignment(Pos.CENTER);
        
        re = new Button("Rematch");
        re.setFont(Font.font("Tahoma", 12.0));
        re.setStyle("-fx-background-radius: 15; -fx-background-color: #78909c;");
        re.setPrefSize(250,74);
        re.setOnAction(this);
        
        ch = new Button("Change players");
        ch.setFont(Font.font("Tahoma", 12.0));
        ch.setStyle("-fx-background-radius: 15; -fx-background-color: #78909c;");
        ch.setPrefSize(250,74);
        ch.setOnAction(this);
        
        p.getChildren().add(v);
        v.getChildren().addAll(l,h);
        h.getChildren().addAll(re,ch);
        
        p.setStyle("-fx-background-color: #bdbdbd;" );
        
        v.setSpacing(30);
        v.setPadding(new Insets(10));
        
        h.setSpacing(5);
        h.setPadding(new Insets(10));
       
       
        
       
        Scene s = new Scene(p);
        won.setScene(s);
        won.setTitle("Congratulations!");
        won.show();
        
        resetS();
        
    }
    if(p2.Score == maxScore){
    
        won = new Stage();
        
        AnchorPane p = new AnchorPane();
        VBox v = new VBox();
        HBox h = new HBox();
        
        Label l = new Label(p2.name + " Won!!!");
        l.setFont(Font.font("Tahoma", 48.0));
        v.setAlignment(Pos.CENTER);
        
        re = new Button("Rematch");
        re.setFont(Font.font("Tahoma", 12.0));
        re.setStyle("-fx-background-radius: 15; -fx-background-color: #78909c;");
        re.setPrefSize(250,74);
        re.setOnAction(this);
        
        ch = new Button("Change players");
        ch.setFont(Font.font("Tahoma", 12.0));
        ch.setStyle("-fx-background-radius: 15; -fx-background-color: #78909c;");
        ch.setPrefSize(250,74);
        ch.setOnAction(this);
        
        p.getChildren().add(v);
        v.getChildren().addAll(l,h);
        h.getChildren().addAll(re,ch);
        
        p.setStyle("-fx-background-color: #bdbdbd;" );
        
        v.setSpacing(30);
        v.setPadding(new Insets(10));
        
        h.setSpacing(5);
        h.setPadding(new Insets(10));
       
       
        
       
        Scene s = new Scene(p);
        won.setScene(s);
        won.setTitle("Congratulations!");
        won.show();
        
        resetS(); 
   }
    }
    public void tryMaxScore(){
    try{checkMaxScore();}catch(Exception e){}
    }
    
    public void emptyCells(){
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
    }
    
    public void resetG(){
        p1.Score = 0;
        p2.Score = 0;
       
    }
    public void notHere(){
    Stage sw1 = new Stage();
        
        
        GridPane p = new GridPane();
        Label l = new Label("You Can't Play Here!!");
        l.setFont(Font.font("Tahoma", 48.0));
        
        p.getChildren().add(l);
        p.setAlignment(Pos.CENTER);
        p.setStyle("-fx-background-color: #bdbdbd;");
        Scene s = new Scene(p,460,145);
        sw1.setScene(s);
        sw1.setTitle("OOPS!");
        sw1.show();
       

        sw1.setResizable(false);
        
        sleep();
        sw1.toBack();
        
        sw1.close();
    }
    
    public void startG(){
    b1.setDisable(false);
    b2.setDisable(false);
    b3.setDisable(false);
    b4.setDisable(false);
    b5.setDisable(false);
    b6.setDisable(false);
    b7.setDisable(false);
    b8.setDisable(false);
    b9.setDisable(false);
    resetS.setDisable(false);
    
    this.changeLabel();
    }
    public void resetS(){
    resetG();
        p1score.setText("Score : "+p1.Score);
        p2score.setText("Score : "+ p2.Score);
        emptyCells();
    }

    @Override
    public void handle(ActionEvent t) {
       
       if(t.getSource() == re){
       won.close();
       resetS();
       }
       if(t.getSource() == ch){
       sn.show();
       won.close();
       s.close();
       }
    }

    
}
