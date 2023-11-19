package tasks.imageslider.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button nextImageButton;
    @FXML
    private Pane pane;

    private void loadShapes(MouseEvent event){
        Ellipse start = new Ellipse(286, 50,41, 22);
        start.setFill(Color.BLUE);
        Text startText = new Text(266, 55, "Начало");
        Ellipse end = new Ellipse(286, 194, 41, 22);
        end.setFill(Color.BLUE);
        Text endText = new Text(266, 199, "Конец");

        Rectangle helloWorld = new Rectangle(211, 100, 148, 43);
        helloWorld.setFill(Color.BLUE);
        Text helloWorldText = new Text(247, 126, "Hello World");

        Line lineToHelloWorld = new Line();
        lineToHelloWorld.setStartX(286);
        lineToHelloWorld.setStartY(50);
        lineToHelloWorld.setEndX(286);
        lineToHelloWorld.setEndY(194);
        pane.getChildren().add(new ImageView("C:/Users/voron/Desktop/memes/1q5uoFY2Jts.jpg"));
        pane.getChildren().addAll( lineToHelloWorld, start, startText, end, endText, helloWorld, helloWorldText );
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nextImageButton.setOnMouseClicked(this::loadShapes);
    }
}