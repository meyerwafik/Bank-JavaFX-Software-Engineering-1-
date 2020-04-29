/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;


/**
 *
 * @author Leo
 */
public class ViewManager  {
    Rectangle2D bounds=Screen.getPrimary().getVisualBounds();
    private Stage mainstage;
    private Scene mainscene;
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
//     private static final String img1 = "JavaFX/1.jpeg";
     public ViewManager()
     {     
         mainstage=new Stage();
     }
     public  Scene getHomeScene()
     {
         pane=new MainPane();
     hb=new HBox();
     hb1=new HBox(20);
     hb1.setStyle("-fx-background-color:#28cc9e");
//     vb1=new VBox();
//     loginfields();
     sp= new StackPane();
     sp.setLayoutY(buttonheight);
     hb1.setLayoutY(length-(buttonheight+60));
     sp.setAlignment(Pos.CENTER);
//     pane.setCenter(sp);
     createBackground();
//     pane.setBottom(hb1);
     hb.setPrefSize(width, buttonheight);
     mainscene=new Scene(pane,width,length);
     hb1.setPrefSize(width, buttonheight+60);
     hb1.setAlignment(Pos.CENTER);
    
     
//     hb.setAlignment(Pos.CENTER_RIGHT);
     pane.getChildren().addAll(sp,hb,hb1);
//     pane.setTop(hb);
     buttons();
   
    sp.setPrefSize(width, length-(2*buttonheight + 60));
    
     
         
         return mainscene;
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
    Button login = new Button("login");
    Button signup = new Button("Sign Up");
    login.setStyle("-fx-background-color:#197f63");
    signup.setStyle("-fx-background-color:#197f63");
    login.setFont(Font.font(font));
    login.setTextFill(Color.WHITE);
    signup.setFont(Font.font(font));
    signup.setTextFill(Color.WHITE);
     
     login.setPrefSize(250, buttonheight+20);
     signup.setPrefSize(250, buttonheight+20);
     login.setOnMouseClicked((MouseEvent event) -> {
         Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new Login().loginScene());
    }
     );
     
    
     login.setOnMouseEntered((MouseEvent event) -> {
         login.setEffect(new Glow());
    });
    login.setOnMouseExited((MouseEvent event) -> {
            login.setEffect(null);
        });
    signup.setOnMouseEntered((MouseEvent event) -> {
         signup.setEffect(new Glow());
    });
    signup.setOnMouseExited((MouseEvent event) -> {
            signup.setEffect(null);
        });
    signup.setOnMouseClicked((MouseEvent event) -> {
        Stage s= NewFXMain.getPrimaryStage();
        s.setScene(new signup().signupScene());
    }
     );
    login.setAlignment(Pos.BASELINE_CENTER);
    signup.setAlignment(Pos.BASELINE_CENTER);
    hb1.setAlignment(Pos.CENTER);
    hb1.getChildren().addAll(login,signup);
    
     }  
     
     public Stage getmainstage(){
     return mainstage;
     }
     
     private void createBackground()
    {
        Image img = new Image(url);
        ImageView background = new ImageView(img);
        background.setFitHeight(length-(2*buttonheight+20));
        background.setFitWidth(width);
        sp.getChildren().add(background);
//BackgroundImage bgImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));
//sp.setBackground(new Background(bgImg));


    }
     
//     public void loginfields(){
//         Label username=new Label("Username");
//         TextField tf=new TextField();
//         tf.setPrefWidth(100);
//         Label password=new Label("Password");
//         PasswordField pf=new PasswordField();
//         vb1.getChildren().addAll(username,tf,password,pf);
//         vb1.setAlignment(Pos.BASELINE_CENTER);
//     }
     
}
