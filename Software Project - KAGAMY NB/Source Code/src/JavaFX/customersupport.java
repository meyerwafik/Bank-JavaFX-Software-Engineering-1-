package JavaFX;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maria
 */
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import static javafx.scene.text.Font.font;
import javafx.stage.Screen;

public class customersupport {
private static double buttonheight = 50;
     private static final String font="Verdana";
      Rectangle2D bounds=Screen.getPrimary().getVisualBounds();
      
    public static Scene contact() {
        Label l = new Label("1) What are the types of the accounts united bank offers?\n"
                + "\n"
                + "    KAGAMY NB offers the shariaa compatible and Commercial Banking accounts.\n"
                + "\n"
                + "    KAGAMY NB offers Debit cards for all accounts which can be used in withdrawal, purchases and deposits.\n"
                + "\n"
                + "    Types of accounts:\n"
                + "    Investment accounts:\n"
                + "    The united bank offers shariaa compatible and Commercial Investment accounts:\n"
                + "    A) Transactional accounts:\n"
                + "    - Customers are allowed to withdraw and deposit, with complete freedom, with a calculated varying return on the lowest balance available during the month.\n"
                + "    - The return is credited every 3 months.\n"
                + "    - Issuance of a check book is allowed for the customers .\n"
                + "\n"
                + "    Saving accounts:\n"
                + "    B) Deposit accounts:\n"
                + "    - Customers are allowed to withdraw and deposit, with complete freedom, with a calculated varying return on the lowest balance available during the month.\n"
                + "    - The return is credited every 3 months.\n"
                + "    - Check book issuance is not allowed.\n"
                + "\n"
                + "    ********************************************\n"
                + "    Current accounts:\n"
                + "    - This account can be opened for individuals and companies.\n"
                + "    - It has no return.\n"
                + "    - Issuance of a check book is allowed for the customers .\n"
                + "\n"
                + "    Foreign Currency accounts:\n"
                + "    - We serve foreign currency accounts which are USD, EUR and GBP currencies in addition to any other foreign currencies according to the Dealing room instructions.\n"
                + "    - The minimum amount for opening any account is 500 $ or what is equivalent in other currencies.\n"
                + "\n"
                + "2) What are the types of cards united bank offers?\n"
                + "\n"
                + "The united bank offers Debit, Credit (Visa Credit Card/ Islamic Master Card Rakhaa ) and Prepaid cards.\n"
                + "\n"
                + "What are the main features for each card?\n"
                + "\n"
                + "    Credit cards\n"
                + "\n"
                + "Rakaa Credit Card:\n"
                + "\n"
                + "The First Credit card that is compatible to shariaa compliance in cooperation with Master Card.\n"
                + "\n"
                + "    Available in Classic and Gold.\n"
                + "    Least Murabha return, with equal installments, up to 20 month.\n"
                + "    Longest grace period up to 58 days.\n"
                + "    The customer can apply for supplementary cards.\n"
                + "    The card is available for usage online and abroad.\n"
                + "    Allows 100% withdrawal and 100% purchases.\n"
                + "\n"
                + "Visa Credit Card\n"
                + "Enjoy the United Bank Visa Credit Card with:\n"
                + "- No fees on purchases and low withdrawal fees.\n"
                + "- The monthly minimum payment is 5% out of last statement balance.\n"
                + "- Grace period up to 55 days on purchases and cash withdrawal.\n"
                + "-The customer can apply for supplementary cards.\n"
                + "-The card is available for usage online and aboard.\n"
                + "- Allows 100% withdrawal and 100% purchases.\n"
                + "\n"
                + "Debit cards\n"
                + "\n"
                + "Visa Electron/ Master Card:\n"
                + "You can use your account safely around the world in cash withdrawals and purchases, at any time through debit card (Visa Electron and Master Card).\n"
                + "\n"
                + "Pre-paid cards:\n"
                + "Allow their holders to carry out different purchases and cash withdrawal transactions, inside and outside Egypt, with the possibility of recharging the card more than once through different UB branches and ATM’s covering all governorates.\n"
                + "\n"
                + "It’s not a must to be UB customer to get the prepaid card.\n"
                + "3) What are the types of Deposits and Certificates united bank offers?\n"
                + "\n"
                + "What are the types of Deposits and Certificates united bank offers?\n"
                + "\n"
                + "Certificates:\n"
                + "the bank offers the Islamic and commercial certificates.\n"
                + "The shariaa compatible certificates:\n"
                + "The three years certificates with monthly variable return:\n"
                + "- It is Available in EGP, and pays monthly.\n"
                + "- Its categories start from 1000 L.E.\n"
                + "\n"
                + "The three year certificates with cumulative variable return:\n"
                + "- It is Available in EGP and pays at the end of the period.\n"
                + "- Its categories start from 1000 L.E.\n"
                + "\n"
                + "The five years certificates with semi -annual variable return:\n"
                + "- It is Available in EGP, and pays semi – annually.\n"
                + "- It’s categories start from 1000 L.E.\n"
                + "\n"
                + "The annual certificates in USD with quarter variable return:\n"
                + "- It is denominated In USD, and pays every three months.\n"
                + "- Its categories start from 100$.\n"
                + "\n"
                + "The Commercial certificates:\n"
                + "Golden certificate “the three year certificates with cumulative return”:\n"
                + "- It’s denominated in EGP, and pays at the end of the period.\n"
                + "- Its categories start from 1000 L.E.\n"
                + "\n"
                + "Diamond certificates “the three certificates with three monthly return”:\n"
                + "- It is denominated in EGP, and pays every three months.\n"
                + "- Its categories start from 500 L.E.\n"
                + "\n"
                + "The five years certificates with monthly return:\n"
                + "- It is denominated in EGP, and pays monthly variable.\n"
                + "- It’s categories start from 750 L.E.\n"
                + "\n"
                + "The USD certificates with quarter return: ( 3 Years )\n"
                + "- It is denominated in USD, and pays every three months.\n"
                + "- It’s categories start from 500 $.\n"
                + "\n"
                + "The Millionaire certificate:\n"
                + "- It is a five year certificate starts from the purchasing date.\n"
                + "- The certificate value is 100 EGP.\n"
                + "- The millionaire certificate is renewed automatically.\n"
                + "- The millionaire certificate is issued without any extra charges.\n"
                + "- Both Egyptians and foreigners can buy it (only individual).\n"
                + "- The certificate prize (32 winner/year)\n"
                + "- 2 winners with the Million prize on per year.\n"
                + "- 3 winners monthly prize,\n"
                + "• 100 thousand EGP.\n"
                + "• 50 thousand EGP.\n"
                + "• 50 thousand EGP.");
        l.setAlignment(Pos.CENTER);
        l.setFont(Font.font("Cambria", FontWeight.BOLD, FontPosture.REGULAR, 16));;
        Label bottom = new Label("© KAGAMI NB. All rights reserved 2019.\n" +
"® KAGAMY NB logo and POWERING YOUR IDEAS are registered trademarks of KAGAMY NB") ;
        l.setBackground(new Background(new BackgroundFill(Color.OLDLACE, CornerRadii.EMPTY, Insets.EMPTY)));
        
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(3.0);
        dropShadow.setOffsetX(2.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setColor(Color.color(0.4, 0.5, 0.5));
        
        bottom.setEffect(dropShadow);
        ImageView img1 = new ImageView("JavaFX/img.jpeg");
        img1.setFitHeight(150);
        img1.setFitWidth(150);
        ImageView img2 = new ImageView("JavaFX/email.jpeg");
        img2.setFitHeight(170);
        img2.setFitWidth(150);
        
        Label num = new Label("Hotline : 19973\n"+"Stolen Credit Cards : 50555");
        num.setEffect(dropShadow);
        Label email = new Label("E-mail us: KAGAMINB@BANK.GOV.EG");
        email.setEffect(dropShadow);
        
        ScrollPane sp = new ScrollPane(l);
        HBox hbabove= new HBox(img1,num,img2,email);
        hbabove.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        HBox hbbott= new HBox(bottom);
        hbbott.setBackground(new Background(new BackgroundFill(Color.WHEAT, CornerRadii.EMPTY, Insets.EMPTY)));
        
        BorderPane bp = new BorderPane(sp);
        bp.setBottom(hbbott);
        
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
        home.setOnMouseClicked((MouseEvent event) -> {
        Stage s= NewFXMain.getPrimaryStage();
        s.setScene(new ViewManager().getHomeScene());
    }
     );
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
            policy.setOnMouseClicked((MouseEvent event) -> {
        Stage s= NewFXMain.getPrimaryStage();
        s.setScene(new Policy().getPolicyScene());
    }
     );
        Scene scene = new Scene(bp,900,650);
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
        l.prefWidthProperty().bind(scene.widthProperty());
        HBox hb = new HBox();
        hb.getChildren().addAll(home,contact,location,policy);
            VBox vbtop = new VBox(hb,hbabove);
            bp.setTop(vbtop);
            bp.setPadding(new Insets(0,0,0,2));
            return scene;

        }
}