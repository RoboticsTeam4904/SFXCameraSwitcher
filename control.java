import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Control implements Initializable {

    @FXML //  fx:id="webView"
    private WebView webView; // Value injected by FXMLLoader


    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        webView.getEngine().loadContent("<iframe width='420' height='315' src='http://www.youtube.com/embed/ZDzVLhjB3bk' />");
    }

}