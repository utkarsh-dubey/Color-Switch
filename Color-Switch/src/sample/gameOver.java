package sample;
import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.List;

public class gameOver {

    public AnchorPane root;
    int highScore=0;
    int starCount=0;


    gameOver(int score) throws IOException {

        root = FXMLLoader.load(getClass().getResource("gameOver.fxml"));
        HighStarSaver op=new HighStarSaver(highScore,starCount);

            op.deserializeArrayList();
            highScore=op.highStar.get(0);
            starCount=op.highStar.get(1);


        highScore=Math.max(highScore,score);
        starCount+=score;
        op.highStar.set(0,highScore);
        op.highStar.set(1,starCount);
        op.serializeArrayList();
        List<Node> children=root.getChildren();
        Text scoreText=(Text)children.get(5);
        scoreText.setText(""+score);
        Text highScoreText=(Text)children.get(8);
        highScoreText.setText(""+highScore);
        Text starCountText=(Text)children.get(2);
        starCountText.setText(""+starCount);


    }


}







