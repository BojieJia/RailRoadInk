package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

//TODO add in theme music? and sound effects
//TODO add in an instruction screen

//Authored by Harriet
public class Game extends Application {

    static Stage classStage = new Stage();

    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    private final Group root = new Group();

    @Override
    public void start(Stage primaryStage) {
        classStage = primaryStage ;

        primaryStage.setTitle("Railroad Ink");
        Scene play = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        //image from https://boardgamegeek.com/image/4465753/railroad-ink-deep-blue-edition
        Image titleImage = new Image(Game.class.getResourceAsStream("assets/title1.jpg"));
        ImageView title = new ImageView(titleImage);
        title.setFitWidth(VIEWER_WIDTH);
        title.setFitHeight(VIEWER_HEIGHT);
        title.setX(0);
        title.setY(0);
        root.getChildren().add(title);

        Button launchSinglePlayer = new Button("Single Player");
        launchSinglePlayer.setOnAction(e -> {
            SinglePlayer ctc = new SinglePlayer();
            ctc.start(SinglePlayer.classStage);
            primaryStage.close();
        });
        launchSinglePlayer.setPrefSize(200, 75);
        launchSinglePlayer.setStyle("-fx-font-size:20");
        launchSinglePlayer.setLayoutX(100);
        launchSinglePlayer.setLayoutY(600);
        root.getChildren().add(launchSinglePlayer);

        Button launchMultiPlayer = new Button("Multi-Player");
        launchMultiPlayer.setOnAction(e -> {
            MultiPlayer ctc = new MultiPlayer();
            ctc.start(MultiPlayer.classStage);
            primaryStage.close();
        });
        launchMultiPlayer.setLayoutX(724);
        launchMultiPlayer.setLayoutY(600);
        launchMultiPlayer.setPrefSize(200, 75);
        launchMultiPlayer.setStyle("-fx-font-size:20");
        root.getChildren().add(launchMultiPlayer);

        Button rules = new Button("Rules");
        rules.setOnAction(e -> {
            Rules ctc = new Rules();
            ctc.start(Rules.classStage);
            primaryStage.close();
        });
        rules.setPrefSize(200, 75);
        rules.setStyle("-fx-font-size:20");
        rules.setLayoutX(412);
        rules.setLayoutY(600);
        root.getChildren().add(rules);

        primaryStage.setScene(play);
        primaryStage.show();
    }
}
