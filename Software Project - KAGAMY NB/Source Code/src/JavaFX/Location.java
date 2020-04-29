/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;
import static JavaFX.Policy.width;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import static javafx.scene.text.Font.font;
import javafx.stage.Stage;
/**
 *
 * @author meyer
 */
public class Location {
    
    private static final String font="Verdana";
private BorderPane bp ;

 private Button[] btn;
 private VBox governments ;
 private HBox hb;
 Scene sc;
 private static final double length= 650;
 private static final double width =900;
 private static final double buttonheight=50;
 private FlowPane fp1;
    public Scene getlocationscene()
    {
        Label Cairob = new Label("25 MAkram Ebied, Nasr City\n\n\n\n\n\n"
            + "5 Markaz el m3lomat, Nasr City\n\n\n\n\n\n"
            + "3 Sayed Zakeria Khalil,Shiraton,Heliopolice \n\n\n\n\n\n");
    Label Alexb = new Label("12 seedy beshr,kornesh el ahlam\n\n\n\n\n\n" + "6 beer Masoud,el sa5ra el shemal");
    Label Gizab = new Label("2 Haram 5ofo , el masala el ymeen\n\n\n\n\n\n" + "45 Share3 nefrteti , haret toot 3an5 kamoon");

        fp1=new FlowPane();
        fp1.setAlignment(Pos.CENTER);
        btn= new Button[3];
        btn[0] =new Button("Cairo");
        btn[1] =new Button("Alexandria");
        btn[2]=new Button("Giza");
         for(int i =0 ; i<3 ;i++){
             btn[i].setStyle("-fx-font-size: 30");
        btn[i].setPrefSize(150, 100);
       btn[i].setTextFill(Color.WHITE);
       btn[i].setFont(Font.font(font));
        btn[i].setStyle("-fx-background-color:#197f63");
         }
         bp=new BorderPane();
         hb=new HBox();
         buttons();
               
         bp.setTop(hb);
         btn[0].setOnAction(e -> {
        bp.setCenter(Cairob);
        
           });
         btn[1].setOnAction(e -> {
        bp.setCenter(Alexb);
           });
         btn[2].setOnAction(e -> {
        bp.setCenter(Cairob);
           });
         
    
      
        
        
     
        
        governments = new VBox();
        governments.setPrefSize(500, 300);
        governments.setAlignment(Pos.CENTER);
        governments.getChildren().addAll(btn[0],btn[1],btn[2]);
         bp.setLeft(governments);
          sc = new Scene(bp, 900, 650);
         return sc;
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
    home.setOnMouseClicked((MouseEvent e)->{
        
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new ViewManager().getHomeScene());
        
    });
    contact.setOnMouseEntered((MouseEvent event) -> {
         contact.setEffect(new DropShadow());
    });
        contact.setOnMouseExited((MouseEvent event) -> {
            contact.setEffect(null);
        });
        contact.setOnMouseClicked(e->{
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(customersupport.contact());
        });
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
        policy.setOnMouseClicked(e->{
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new Policy().getPolicyScene());
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
    hb.getChildren().addAll(home,contact,location,policy);
    
     }  
    
}
