package sample;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.IOException;


public class Cross {
    GridPane root;
    Cross() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/sample/Cross.fxml"));
    }
    protected void playCross() {

        RotateTransition rotateTransition=new RotateTransition(Duration.millis(4000),root);
        rotateTransition.setFromAngle(0);
        rotateTransition.setToAngle(360);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setAxis(Rotate.Z_AXIS);
        rotateTransition.setCycleCount(Timeline.INDEFINITE);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();

    }
}