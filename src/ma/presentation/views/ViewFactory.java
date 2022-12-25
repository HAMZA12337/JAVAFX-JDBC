package ma.presentation.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ViewFactory {

    public ViewFactory() {
    }

    public void showDashboard(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboardProduct.fxml"));
        Scene scene= null;
        try{
            scene = new Scene(fxmlLoader.load());
        }catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = new Stage();
//        stage.initStyle(StageStyle.UNDECORATED);

        stage.setTitle("HAMZA APPLICATION");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
