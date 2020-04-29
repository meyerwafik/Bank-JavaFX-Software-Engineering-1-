/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author meyer
 */
public class HomeScene {
    
    
    private BorderPane pane1;
     private MainPane pane;
     private HBox hb;
      private HBox hb1;
     private VBox vb1;
     private VBox vb;
     private StackPane sp;
     private static double buttonheight = 50;
     private static final String font="Verdana";
     private static final String url ="JavaFX/logo1.png";
     private static final double length =650;
     private static final double width =900;
     private VBox functions;
     Scene mainScene;
     
     public Scene getScene()
     {
         functions = new VBox(25);
     pane=new MainPane();
     hb=new HBox();
     hb1=new HBox(20);
     hb1.setStyle("-fx-background-color:#28cc9e");

     sp= new StackPane();
      sp.setStyle("-fx-background-color:#28cc9e");
     sp.setLayoutY(buttonheight);
     hb1.setLayoutY(length-(buttonheight+60));
     sp.setAlignment(Pos.CENTER);
     functions.setLayoutY(150);
     functions.setLayoutX((width/2)-125);
     functionbuttons();
//     sp.getChildren().add(functions);
//     pane.setCenter(sp);
   
//     pane.setBottom(hb1);
     hb.setPrefSize(width, buttonheight);
     mainScene=new Scene(pane,width,length);
     hb1.setPrefSize(width, buttonheight+60);
     hb1.setAlignment(Pos.CENTER);
    
     
//     hb.setAlignment(Pos.CENTER_RIGHT);
     pane.getChildren().addAll(sp,hb,hb1,functions);
//     pane.setTop(hb);
     buttons();
   
    sp.setPrefSize(width, length-(2*buttonheight + 60));
    
     
         
         return mainScene;
     }
 public void buttons(){
    Button home=new Button("Home");
    Button contact=new Button("Contact");
    Button location=new Button("Location");
    Button policy=new Button("Policy");
    home.setFont(Font.font(font));
    contact.setFont(Font.font(font));
    location.setFont(Font.font(font));
    policy.setFont(Font.font(font));
    home.setTextFill(Color.WHITE);
    location.setTextFill(Color.WHITE);
    policy.setTextFill(Color.WHITE);
    contact.setTextFill(Color.WHITE);
    home.setOnMouseEntered((MouseEvent event) -> {
         home.setEffect(new DropShadow());
    });
    home.setOnMouseExited((MouseEvent event) -> {
            home.setEffect(null);
        });
    contact.setOnMouseEntered((MouseEvent event) -> {
         contact.setEffect(new DropShadow());
    });
        contact.setOnMouseExited((MouseEvent event) -> {
            contact.setEffect(null);
        });
        contact.setOnMouseClicked((MouseEvent event) -> {
         Stage s= NewFXMain.getPrimaryStage();
         s.setScene(customersupport.contact());
    }
     );
    location.setOnMouseEntered((MouseEvent event) -> {
         location.setEffect(new DropShadow());
    });
        location.setOnMouseExited((MouseEvent event) -> {
            location.setEffect(null);
        });
        
    policy.setOnMouseEntered((MouseEvent event) -> {
         policy.setEffect(new DropShadow());
    });
        policy.setOnMouseExited((MouseEvent event) -> {
            policy.setEffect(null);
        });
    home.setStyle("-fx-background-color:#197f63");
    location.setStyle("-fx-background-color:#197f63");
    policy.setStyle("-fx-background-color:#197f63");
    contact.setStyle("-fx-background-color:#197f63");
    home.setPrefWidth(width/4);
    home.setPrefHeight(buttonheight);
    contact.setPrefWidth(width/4);
    contact.setPrefHeight(buttonheight);
    location.setPrefHeight(buttonheight);
    policy.setPrefHeight(buttonheight);
    location.setPrefWidth(width/4);
    policy.setPrefWidth(width/4);
    policy.setOnMouseClicked((MouseEvent event) -> {
         Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new Policy().getPolicyScene());
    }
     );
   
    hb.getChildren().addAll(home,contact,location,policy);
 }
 public void functionbuttons()
 {
     Button checkbalance = new Button("Check Balance");
     Button requestcard = new Button("Request Card");
     Button requestloan = new Button("Request Loan");
     Button transferfunds= new Button ("Transfer Funds")  ;
     Button viewtransactions = new Button("View Transactions");
      checkbalance.setFont(Font.font(font));
    requestcard.setFont(Font.font(font));
    requestloan.setFont(Font.font(font));
    transferfunds.setFont(Font.font(font));
     viewtransactions.setFont(Font.font(font));
    checkbalance.setTextFill(Color.WHITE);
   requestcard.setTextFill(Color.WHITE);
    requestloan.setTextFill(Color.WHITE);
    transferfunds.setTextFill(Color.WHITE);
    viewtransactions.setTextFill(Color.WHITE);
    checkbalance.setPrefSize(250, buttonheight+20);
    requestcard.setPrefSize(250, buttonheight+20);
    requestloan.setPrefSize(250, buttonheight+20);
    transferfunds.setPrefSize(250, buttonheight+20);
    viewtransactions.setPrefSize(250, buttonheight+20);
    checkbalance.setStyle("-fx-background-color:#197f63");
    requestcard.setStyle("-fx-background-color:#197f63");
    requestloan.setStyle("-fx-background-color:#197f63");
    transferfunds.setStyle("-fx-background-color:#197f63");
    viewtransactions.setStyle("-fx-background-color:#197f63");
    checkbalance.setOnMouseEntered((MouseEvent event) -> {
         checkbalance.setEffect(new Glow());
    });
    checkbalance.setOnMouseExited((MouseEvent event) -> {
            checkbalance.setEffect(null);
        });
    checkbalance.setOnMouseClicked((MouseEvent e)->{
        
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new CheckBalance().checkbalanceScene());
        
    });
    requestcard.setOnMouseEntered((MouseEvent event) -> {
         requestcard.setEffect(new Glow());
    });
    requestcard.setOnMouseExited((MouseEvent event) -> {
            requestcard.setEffect(null);
        });
    requestcard.setOnMouseClicked(e->{
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new RequestCredit().requestcreditScene());
        });
    requestloan.setOnMouseEntered((MouseEvent event) -> {
         requestloan.setEffect(new Glow());
    });
    requestloan.setOnMouseExited((MouseEvent event) -> {
            requestloan.setEffect(null);
        });
    requestloan.setOnMouseClicked(e->{
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new LoanScene().loan());
        });
    transferfunds.setOnMouseEntered((MouseEvent event) -> {
         transferfunds.setEffect(new Glow());
    });
    transferfunds.setOnMouseExited((MouseEvent event) -> {
            transferfunds.setEffect(null);
        });
    transferfunds.setOnMouseClicked(e->
    {
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(TransferFunds.transferfunds());
    });
    viewtransactions.setOnMouseEntered((MouseEvent event) -> {
       viewtransactions.setEffect(new Glow());
    });
    viewtransactions.setOnMouseExited((MouseEvent event) -> {
           viewtransactions.setEffect(null);
        });
    viewtransactions.setOnMouseClicked(e->
    {
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new ViewTransactions().viewtransactions());
    });
    functions.getChildren().addAll(checkbalance,requestcard,requestloan,transferfunds,viewtransactions);
     
     
 }
}
