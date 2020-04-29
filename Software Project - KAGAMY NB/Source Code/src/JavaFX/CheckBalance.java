package JavaFX;

import JavaFX.NewFXMain;
import JavaFX.Policy;
import JavaFX.ViewManager;
import JavaFX.customersupport;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CheckBalance {
    HBox hb;
    private static final String font="Verdana";
    private static double buttonheight = 50;
     
     private static final double length =650;
     private static final double width =900;
    public  Scene checkbalanceScene (){
        
     Pane p =new Pane();
     hb=new HBox();
     hb.setPrefSize(width, buttonheight);
     Label checkbalance = new Label("Your current balance is 100500 Egyption pounds");
      checkbalance.setStyle("-fx-font: 20 Verdana");
      checkbalance.layoutXProperty().bind(p.widthProperty().subtract(checkbalance.widthProperty()).divide(2));
      checkbalance.layoutYProperty().bind(p.heightProperty().subtract(checkbalance.heightProperty()).divide(2));
p.getChildren().add(hb);
     p.getChildren().add(checkbalance);
     buttons();
     Scene s = new Scene(p, 900, 650);
     return s;
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
    home.setOnMouseClicked((MouseEvent e)->{
        
        Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new HomeScene().getScene());
        
    });
     contact.setOnMouseClicked((MouseEvent event) -> {
         Stage s= NewFXMain.getPrimaryStage();
         s.setScene(customersupport.contact());
    }
     );
      location.setOnMouseClicked((MouseEvent event) -> {
         Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new Location().getlocationscene());
    }
     );
    hb.getChildren().addAll(home,contact,location,policy);
 }
}
