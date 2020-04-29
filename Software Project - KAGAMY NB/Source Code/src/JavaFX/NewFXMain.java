/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;

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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Leo
 */
public class NewFXMain extends Application {
    private static Stage pStage;
    
    @Override
    public void start(Stage primaryStage) {
        
        Rectangle2D bounds=Screen.getPrimary().getVisualBounds();
        
        setPrimaryStage(primaryStage);
        pStage=primaryStage;
        pStage.setScene(new ViewManager().getHomeScene());
        pStage.setTitle("KAGAMY NB");
        pStage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }
    public static Stage getPrimaryStage(){
        return pStage;
    }
    private void setPrimaryStage(Stage pStage)
    {
        NewFXMain.pStage=pStage;
    }
    
}
