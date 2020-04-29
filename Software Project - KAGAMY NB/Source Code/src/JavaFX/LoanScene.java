
package JavaFX;


import Bankingsystem.*;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class LoanScene 
{
    private static double buttonheight = 70;
     private static final String font = "Verdana";
      Rectangle2D bounds=Screen.getPrimary().getVisualBounds();
          private HBox hb;

      
public  Scene loan()
{
    //Buttons of loan options
    Button btcarloan = new Button("Car Loan");
    Button btpremises = new Button("Premises");
    Button btproject = new Button("Project");
     hb=new HBox();
    hb.setPrefSize(bounds.getWidth(), 40);
    
    //hbox to contain the loan buttons
    HBox hboxloan = new HBox();
    hboxloan.getChildren().addAll(btcarloan, btpremises, btproject);
    
    //borderpane to contain everything in the scene
    BorderPane bploan = new BorderPane();
    
    
    
    //Objects from the three types of loans
    Carloan carloan = new Carloan();
    Premises premises = new Premises();
    Project project = new Project();
    
    
    //car loan button effect
    
    btcarloan.setOnMouseEntered((MouseEvent event) -> {
             btcarloan.setEffect(new DropShadow());
        });
        btcarloan.setOnMouseExited((MouseEvent event) -> {
                btcarloan.setEffect(null);
            });
    
    //premises button effect
        
    btpremises.setOnMouseEntered((MouseEvent event) -> {
             btpremises.setEffect(new DropShadow());
        });
        btpremises.setOnMouseExited((MouseEvent event) -> {
                btpremises.setEffect(null);
            });
    
    //project button effect    
        
    btproject.setOnMouseEntered((MouseEvent event) -> {
             btproject.setEffect(new DropShadow());
        });
        btproject.setOnMouseExited((MouseEvent event) -> {
                btproject.setEffect(null);
            });
    
        btcarloan.setStyle("-fx-background-color:#197f63");
        btpremises.setStyle("-fx-background-color:#197f63");
        btproject.setStyle("-fx-background-color:#197f63");
    
        //creating the scene 
        
        Scene scene = new Scene(bploan,900,650);
        
        
        btcarloan.prefWidthProperty().bind(scene.widthProperty().divide(3));
        btcarloan.setPrefHeight(buttonheight);
        btproject.prefWidthProperty().bind(scene.widthProperty().divide(3));
        btproject.setPrefHeight(buttonheight);
        btpremises.prefWidthProperty().bind(scene.widthProperty().divide(3));
        btpremises.setPrefHeight(buttonheight);
        
        
        //crearing funds label and input
        
        Label fundslabel = new Label("Funds: ");
        
        TextField fundsinput = new TextField();
        
        //creating securities label and input
        
        Label securitieslabel = new Label("Securities: ");
        
        TextField securitiesinput = new TextField();
        
        //creating cartype label and input
        Label CarTypelabel = new Label("Cartype: ");
        
        TextField CarTypeinput = new TextField();
        
        //creating address and areas label and input
        Label Addresslabel = new Label("Address: ");
        
        TextField Addressinput = new TextField();
        
        Label Arealabel = new Label("Area: ");
        
        TextField Areainput = new TextField();
        
        //create success% label and inputs
        Label SuccessPercentagelabel = new Label("Success Percentage: ");
        
        TextField SuccessPercentageinput = new TextField();
        
        
   
        
        GridPane grid = new GridPane();
        
        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.setVgap(8);

        grid.setHgap(10);
        
        Button btok = new Button("Ok");
        GridPane.setConstraints(btok, 10, 10);
        grid.setAlignment(Pos.CENTER);
        
        VBox carvbox = new VBox();
        carvbox.getChildren().addAll(fundslabel, fundsinput, securitieslabel, 
                securitiesinput, CarTypelabel, CarTypeinput);
        
        VBox premisesvbox = new VBox();
        premisesvbox.getChildren().addAll(fundslabel,fundsinput, securitieslabel,
                securitiesinput, Addresslabel, Addressinput, Arealabel, Areainput);
        
        VBox projectvbox = new VBox();
        projectvbox.getChildren().addAll(fundslabel,fundsinput, securitieslabel,
                securitiesinput, SuccessPercentagelabel, SuccessPercentageinput);
        
        bploan.setBottom(hboxloan);
        
        bploan.setLeft(carvbox);
        bploan.setCenter(premisesvbox);
        bploan.setRight(projectvbox);
         buttons();
        bploan.setTop(hb);
        
//        bploan.setBottom(grid);
        
    return scene;
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
    home.setStyle("-fx-background-color:#197f63");
    location.setStyle("-fx-background-color:#197f63");
    policy.setStyle("-fx-background-color:#197f63");
    contact.setStyle("-fx-background-color:#197f63");
    home.setPrefWidth(bounds.getWidth()/4);
    home.setPrefHeight(buttonheight);
    contact.setPrefWidth(bounds.getWidth()/4);
    contact.setPrefHeight(buttonheight);
    location.setPrefHeight(buttonheight);
    policy.setPrefHeight(buttonheight);
    location.setPrefWidth(bounds.getWidth()/4);
    policy.setPrefWidth(bounds.getWidth()/4);
    hb.getChildren().addAll(home,contact,location,policy);   
}
}
