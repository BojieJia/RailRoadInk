package comp1110.ass2.gui;

import comp1110.ass2.Board;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;


/**
 * A very simple viewer for tile placements in the Railroad Ink game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various tile placements.
 */
public class Viewer extends Application {
    /* board layout */
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;

    private static int OFFSET = 0;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    TextField textField;

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */

    //Authored by Harriet
    void makePlacement(String placement) {

        char[] array = placement.toCharArray();

        //create pieces until exhausted the list
        for (int i = 0; i < placement.length(); i = i + 5) {

            char[] arrayPieceName = {array[i], array[i+1]};

            int y = (array[i + 2] - 'A') * 75;
            int x = Character.getNumericValue(array[i + 3]) * 75;

            String piece = new String(arrayPieceName);

            //create a new image using current piece visual
            Image image = new Image(Viewer.class.getResourceAsStream("assets/" + piece + ".png"));
            ImageView imageView = new ImageView(image);

            if (Character.getNumericValue(array[i + 4]) > 3) {
                //set the image dimensions to 100
                imageView.setFitHeight(75);
                imageView.setFitWidth(75);
                //flip the image
                imageView.setScaleX(-1);
                //rotate the image
                imageView.setRotate(360.0 / 4 * ((double) Character.getNumericValue(array[4]) - 4));
            } else {
                //set the image dimensions
                imageView.setFitHeight(75);
                imageView.setFitWidth(75);
                //rotate the image
                imageView.setRotate(360.0 / 4 * (double) Character.getNumericValue(array[4]));
            }

            //set the image's location
            imageView.setX(x + 75);
            imageView.setY(y + 75);

            //add the image to root
            root.getChildren().add(imageView);
        }
    }

    /**
     * Create a basic text field for input and a refresh button.
     */
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(e -> {
            //call makePlacement with given text
            makePlacement(textField.getText());
            textField.clear();
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(115);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
    }

    void drawBoard() {

        for(int k = 0; k < 9; k++) {

            Line line1 = new Line();
            line1.setStartX(75 * k);
            line1.setStartY(75);
            line1.setEndX(75 * k);
            line1.setEndY(75 * 8);

            root.getChildren().add(line1);

            Line line2 = new Line();
            line2.setStartX(75);
            line2.setStartY(75 * k);
            line2.setEndX(75 * 8);
            line2.setEndY(75 * k);

            root.getChildren().add(line2);

        }


        char[][] highwayExits = { {'A', '3', '0'}, {'A', '7', '0'}, {'E', '1', '3'}, {'E', '9', '1'}, {'I', '3', '2'}, {'I', '7', '2'}};
        char[][] railroadExits = { {'A', '5', '0'}, {'C', '1', '3'}, {'C', '9', '1'}, {'G', '1', '3'}, {'G', '9', '1'}, {'I', '5', '2'}};

        for(int i = 0; i < highwayExits.length; i++) {

            int hy = ((highwayExits[i][0] - 'A')) * 75;
            int hx = (Character.getNumericValue(highwayExits[i][1])) * 75;

            Image image = new Image(Viewer.class.getResourceAsStream("assets/HighExit.png"));
            ImageView imageView = new ImageView(image);

            imageView.setRotate(360.0 / 4 * (int)highwayExits[i][2]);

            imageView.setFitHeight(75);
            imageView.setFitWidth(75);

            imageView.setX(hx - 75);
            imageView.setY(hy);


            root.getChildren().add(imageView);

            int ry = ((railroadExits[i][0] - 'A')) * 75;
            int rx = (Character.getNumericValue(railroadExits[i][1])) * 75;

            Image image2 = new Image(Viewer.class.getResourceAsStream("assets/RailExit.png"));
            ImageView imageView2 = new ImageView(image2);

            imageView2.setRotate(360.0 / 4 * (int)railroadExits[i][2]);

            imageView2.setFitHeight(75);
            imageView2.setFitWidth(75);

            imageView2.setX(rx - 75);
            imageView2.setY(ry);

            root.getChildren().add(imageView2);
        }

        /*int hy = (0);
        int hx = (75);

        Image image = new Image(Viewer.class.getResourceAsStream("assets/HighExit.png"));
        ImageView imageView = new ImageView(image);

        imageView.setFitHeight(75);
        imageView.setFitWidth(75);

        imageView.setX(hx);
        imageView.setY(hy);

        root.getChildren().add(imageView);

        Image image2 = new Image(Viewer.class.getResourceAsStream("assets/RailExit.png"));
        ImageView imageView2 = new ImageView(image2);

        imageView2.setFitHeight(75);
        imageView2.setFitWidth(75);

        int ry = (0);
        int rx = (75);

        imageView2.setX(rx);
        imageView2.setY(ry);

        root.getChildren().add(imageView2);*/

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("StepsGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        root.getChildren().add(controls);

        makeControls();
        drawBoard();

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
