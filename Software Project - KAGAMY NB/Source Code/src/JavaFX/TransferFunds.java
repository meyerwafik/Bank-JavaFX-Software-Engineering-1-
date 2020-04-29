/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.scene.Scene;
import javafx.geometry.Orientation;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import static javafx.scene.text.Font.font;
import javafx.stage.Screen;

/**
 *
 * @author Maria
 */
public class TransferFunds {
    private static double buttonheight = 50;
     private static final String font="Verdana";
      Rectangle2D bounds=Screen.getPrimary().getVisualBounds();
    public static Scene transferfunds() {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(2.0);
        dropShadow.setOffsetX(1.0);
        dropShadow.setOffsetY(1.0);
        dropShadow.setColor(Color.color(0.4, 0.5, 0.5));
        
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        Label l1 = new Label("Sender bank account ID");
        l1.setEffect(dropShadow);
        Label l2 = new Label("Amount of money to transfer");
        l2.setEffect(dropShadow);
        Label l3 = new Label("Receiver's Bank");
        l3.setEffect(dropShadow);
        Label l4 = new Label("Receiver bank account ID");
        l4.setEffect(dropShadow);
        Label l5 = new Label("Receiver's country");
        l5.setEffect(dropShadow);
        
        TextField t1 = new TextField("");
        TextField t2 = new TextField("");
        TextField t3 = new TextField("");
        TextField t4 = new TextField("");
        TextField t5 = new TextField("");
        
        Button b1 = new Button("Transfer");
        b1.setEffect(new DropShadow());
        Button b2 = new Button("Cancel");
        b2.setEffect(new DropShadow());
       

        gp.addColumn(0,l1,l2,l3,l4,l5,b1);
        gp.addColumn(1,t1,t2,t3,t4,t5,b2);
        gp.setHgap(5);
        gp.setVgap(10);
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
        HBox hb = new HBox();
        BorderPane bp = new BorderPane(gp); 
        bp.setTop(hb);
        Scene scene = new Scene(bp,800,800);
        home.setStyle("-fx-background-color:#197f63");
        location.setStyle("-fx-background-color:#197f63");
        policy.setStyle("-fx-background-color:#197f63");
        contact.setStyle("-fx-background-color:#197f63");
        home.prefWidthProperty().bind(scene.widthProperty().divide(4));
        home.setPrefHeight(buttonheight);
        contact.prefWidthProperty().bind(scene.widthProperty().divide(4));
        contact.setPrefHeight(buttonheight);
        location.setPrefHeight(buttonheight);
        policy.setPrefHeight(buttonheight);
        location.prefWidthProperty().bind(scene.widthProperty().divide(4));
        policy.prefWidthProperty().bind(scene.widthProperty().divide(4));
        hb.getChildren().addAll(home,contact,location,policy);
        return scene;
    }
}
