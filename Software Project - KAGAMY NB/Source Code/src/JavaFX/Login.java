package JavaFX;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login{
    HBox hb;
    BorderPane p;
    private static final double width = 900;
    private static final double length = 650;
    private static final double buttonheight= 50;
    private static final String font="Verdana";
    
    public  Scene loginScene(){
        
        p = new BorderPane();
       hb=new HBox();
       hb.setPrefSize(width, buttonheight);
       buttons();
       p.setTop(hb);

        //GridPane with 10px padding around edge

        GridPane grid = new GridPane();

        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.setVgap(8);

        grid.setHgap(10);
        



        //Name Label - constrains use (child, column, row)

        Label nameLabel = new Label("Username:");

        GridPane.setConstraints(nameLabel, 0, 0);



        //Name Input

        TextField nameInput = new TextField();

        GridPane.setConstraints(nameInput, 1, 0);



        //Password Label

        Label passLabel = new Label("Password:");

        GridPane.setConstraints(passLabel, 0, 1);



        //Password Input

        PasswordField passInput = new PasswordField();

        passInput.setPromptText("password");

        GridPane.setConstraints(passInput, 1, 1);



        //Login

        Button loginButton = new Button("Log In");

        GridPane.setConstraints(loginButton, 1, 2);
        loginButton.setOnMouseClicked(e->{
            Stage s= NewFXMain.getPrimaryStage();
         s.setScene(new HomeScene().getScene());
        }
        );



        //Add everything to grid

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
        grid.setAlignment(Pos.CENTER); 
        p.setCenter(grid);


        Scene scene = new Scene(p, 900, 650);
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
}
    
   
    
