/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;

import static java.awt.Font.SERIF;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.rgb;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Leo
 */
public class Policy {
    final static double width =900;
    final static double length =650;
   ViewManager vm;
   Rectangle2D bounds=Screen.getPrimary().getVisualBounds();
   private final static String img="JavaFX/people29_MIDDLECROPedit.jpg"; 
    private Stage mainstage;
    private Stage primaryStage;
    private Scene mainscene;
    private Scene policyscene;
     private BorderPane pane;
     private HBox hb;
      private HBox hb1;
     private VBox vb1;
     private VBox vb;
     private StackPane sp;
     private static double buttonheight = 70;
     private static final String font="Verdana";
     private static final String url ="JavaFX/logo_transparent.png";
//     private static final String img1 = "JavaFX/1.jpeg";
     public Policy()
     {      
  
     }
     
     public Scene getPolicyScene(){
         Image i=new Image(img);
     ImageView policybackground=new ImageView(i);
     
     pane=new BorderPane();
     hb=new HBox();
     hb1=new HBox(20);
//     vb1=new VBox();
//     loginfields();
     sp= new StackPane();
     sp.getChildren().add(policybackground);
     sp.setAlignment(Pos.CENTER);
     pane.setCenter(sp);
      mainscene=new Scene(pane,900,650);
     policyscene=mainscene;
     hb.setPrefSize(width, 40);
     hb1.setPrefSize(width/2, 200);
     hb1.setAlignment(Pos.CENTER);
     pane.setBottom(hb1);
     VBox vbb1=new VBox();
     vbb1.setAlignment(Pos.CENTER_LEFT);
     Text text1=new Text("Our Vision");
     text1.setFill(Color.rgb(41, 204, 159));
     text1.setFont(Font.font("Virdana",24));
    text1.setTextAlignment(TextAlignment.CENTER);
    Text text2=new Text("Providing the maximum means of luxury is our number one target. This is accomplished during the designing,creating and maintenance phases of the system,which is more user-friendly than ever.");
     text2.setFill(Color.GRAY);
     text2.setTextAlignment(TextAlignment.JUSTIFY);
     text2.setWrappingWidth(300);
     vbb1.getChildren().addAll(text1,text2);
     hb1.getChildren().add(vbb1);
     pane.setTop(hb);
     buttons();
    
    sp.setPrefSize(width, length-200);
     mainstage=new Stage();
     mainstage.setScene(mainscene);
//     hb.setAlignment(Pos.CENTER_RIGHT);
     
     
     return this.policyscene;
     }
     //buttons
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
        location.setOnMouseClicked((MouseEvent event) -> {
        Stage s= NewFXMain.getPrimaryStage();
        s.setScene(new Location().getlocationscene());
    }
     );
        
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
     
     public Stage getmainstage(){
     return mainstage;
     }
     
     private void createBackground()
    {
        Image img = new Image(url);
BackgroundImage bgImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));
sp.setBackground(new Background(bgImg));
    }
     
//     public Scene setViewManager(ViewManager vmm){
//        
//     
//     }
     
     
     
     public void setScene(Scene scene){
     mainstage.setScene(scene);
     }
     
//     public Scene gethomescene(ViewManager vm){
//         vm.setmainscene();
//     }
     
}
