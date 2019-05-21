package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rules extends Application {

    static Stage classStage = new Stage();

    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    private final Group root = new Group();
    private final Group controls = new Group();

    @Override
    public void start(Stage primaryStage) {
        classStage = primaryStage ;

        primaryStage.setTitle("Railroad Ink");
        Scene play = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        //Creating a Text object
        Text text = new Text();
        text.setX(50);
        text.setY(50);
        text.setStyle("-fx-font-size:18");
        text.setText("The objective of RailRoad ink is to place Tiles representing Highway and Railway routes so as to create a \n" +
                    "network connecting as many Exits as possible.\n" +
                    "The game is played over seven rounds.\n" +
                    "Each round, the four tile dice are rolled to determine the tiles that may be placed for that round.\n" +
                    "When placing a tile, it may be flipped or rotated in any direction, and then dragged onto the board.\n" +
                    "All four tiles must be placed, unless doing so would result in an illegal placement in which case the game ends. \n" +
                    "After placement is finished, the dice are re-rolled by pressing \"Roll Dice\" and the next round begins.\n" +
                    "One Special tile (tiles in red boxes) can be placed per round in addition to the rolled tiles.\n \n"+
                    "Legal Placements:\n" +
                    "A tile must be placed such that at least one edge connects to either an exit or a pre-existing route.\n" +
                    "Such a connection is called a valid connection. \n" +
                    "Tiles may not be placed such that a highway edge connects to a railway edge; \n" +
                    "this is referred to as an invalid connection. Highways and railways may only join at station tiles. \n" +
                    "A tile may have one or more edges touching a blank edge of another tile; this is referred to as disconnected,\n" +
                    "but the placement is still legal. " +
                    "Routes may not cross over, with the exception of the overpass tile.\n \n" +
                    "Scoring:\n" +
                    "Each player scores points based on how many exits each of their routes are connected to. \n"+
                    "| Number of Exits connected to route | 2 | 3 | 4  |  5  |  6  |  7  |  8  |  9  |  10 |  11 |  12 | \n" +
                    "| Points Awarded                                  | 4 | 8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 | 45 | \n" +
                    "Each player then loses one point for each Error: edges of routes that are not connected to an edge of the board.\n" +
                    "Routes that end at the edge of the board (whether on an exit or not), or exits that are not connected to a route \n" +
                    "*DO NOT* count as errors. \n" +
                    "Each player gets one point for each of the squares of their centre grid that are covered.\n" +
                    "Each player counts their longest Highway and gets one bonus point per square the highway covers.\n" +
                    "Likewise, each player counts their longest railway and gets one bonus point per square the railway covers.\n" +
                    "If a player has multiple Railways (or Highways) of equal longest length, they only score bonus points for one.\n" +
                    "In competitive play, the player with the most points wins."

        );
        root.getChildren().add(text);

        Button back = new Button("Back");
        back.setOnAction(e -> {
            Game ctc = new Game();
            ctc.start(Game.classStage);
            primaryStage.close();
        });
        back.setPrefSize(130, 65);
        back.setStyle("-fx-font-size:18");
        back.setLayoutX(456);
        back.setLayoutY(680);
        root.getChildren().add(back);

        //add the controls to the root
        root.getChildren().add(controls);

        primaryStage.setScene(play);
        primaryStage.show();
    }
}
