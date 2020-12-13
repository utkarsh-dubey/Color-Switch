package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

public class MainPageController {

    StackPane pane;
    @FXML
    public void play(MouseEvent event) throws IOException {
        System.out.println("playing");
//        ConCircle a = new ConCircle();
        circle a=new circle();
        pauseSymbol c=new pauseSymbol();
//        StackPane pane= FXMLLoader.load(getClass().getResource("/sample/concircle.fxml"));
        a.initiateTransition();
        pane=new StackPane();
        balljump b=new balljump();
        Star d=new Star();
        Score e=new Score();
        d.spawnstar();
        c.root.setTranslateX(400);
        c.root.setTranslateY(25);
        b.root.setTranslateX(50);
        b.root.setTranslateY(400);

        pane.getChildren().addAll(a.root,b.root,c.root,d.imageView,e.a);
//        pane.setOnMouseClicked(event2 -> {
//            System.out.println("Something happened");
//            a.things();
//                });

        b.jump(pane,a);
        Main.root1.getChildren().setAll(pane);

    }

//    public void collision(balljump b)
//    {
//        List<Node> aa=b.root.getChildren();
//        System.out.println(aa.get(0).getTranslateY());
//    }
    @FXML
    public void savedGames(MouseEvent event){
        System.out.println("saved games");
    }

    @FXML
    public void exit(MouseEvent event){
        System.out.println("exiting");
        System.exit(0);
    }
    @FXML
    public void help(MouseEvent event){
        System.out.println("Made by Utkarsh");

    }

}
