package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        File  f     = new File("img.png");
        Image image = new Image(f.toURI().toString());

        ImageView view = new ImageView(image);
        VBox      vBox = new VBox(view);

        primaryStage.setResizable(false);
        primaryStage.setTitle("YEEEAH!");
        primaryStage.setScene(new Scene(vBox));
        primaryStage.show();
    }
}
