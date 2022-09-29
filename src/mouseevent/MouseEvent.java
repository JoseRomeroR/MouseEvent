
package mouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEvent extends Application {
    
    Text text = new Text();
    Pane pane = new Pane();
    Scene scene= new Scene(pane, 400, 400);
    
    @Override
    public void start(Stage stage) {
        //Text settings
        text.setText("Programming is fun");
        text.setX(pane.getWidth()/2);
        text.setY(pane.getHeight()/2);
        //Text event
        text.setOnMouseDragged(e -> {
           text.setX(e.getX());
            text.setY(e.getY());         
         });
        
        pane.getChildren().add(text);
        
        stage.setTitle("MouseEvent");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    } 
}
