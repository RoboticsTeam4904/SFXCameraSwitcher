/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017camera;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

/**
 *
 * @author botprovoking
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        WebView webView = new WebView();

        final WebEngine webEngine = webView.getEngine();
        root.getChildren().addAll(webView);
        stage.setScene(new Scene(root, 450, 350));

        webEngine.loadContent("<iframe width='420' height='315' src='http://10.49.4.69' frameborder='0' allowfullscreen></iframe>");

        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
