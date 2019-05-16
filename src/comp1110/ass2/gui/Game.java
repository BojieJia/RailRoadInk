package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Game extends Application {

    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    private TextField textField;
    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group board = new Group();
    private static final int DIMENSIONS = 75;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Railroad Ink");
        Scene play = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        Image titleImage = new Image(Game.class.getResourceAsStream("assets/title.png"));
        ImageView title = new ImageView(titleImage);
        title.setFitWidth(titleImage.getWidth() * 2);
        title.setFitHeight(titleImage.getHeight() * 2);
        title.setX(130);
        title.setY(100);
        root.getChildren().add(title);

        Button launchMultiPlayer = new Button("Multi-Player");
        Button launchSinglePlayer = new Button("Single Player");
        launchSinglePlayer.setOnAction(e -> {
            SinglePlayer ctc = new SinglePlayer();
            ctc.start(SinglePlayer.classStage);
            primaryStage.close();
        });

        launchSinglePlayer.setLayoutX(100);
        launchSinglePlayer.setLayoutY(500);
        root.getChildren().add(launchSinglePlayer);
        launchMultiPlayer.setOnAction(e -> {
            MultiPlayer ctc = new MultiPlayer();
            ctc.start(MultiPlayer.classStage);
            primaryStage.close();
        });
        launchMultiPlayer.setLayoutX(850);
        launchMultiPlayer.setLayoutY(500);
        root.getChildren().add(launchMultiPlayer);


        //add the controls to the root
        root.getChildren().add(controls);
        root.getChildren().add(board);

        primaryStage.setScene(play);
        primaryStage.show();
    }
}
