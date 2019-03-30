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

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    TextField textField;

    private String CURRENT_PIECE = "";

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */
    void makePlacement(String placement) {
        // FIXME Task 4: implement the simple placement viewer

        char[] array = placement.toCharArray();
        char[] arrayp = {array[0], array[1]};

        int y = (array[2] - 'A') * 100;
        int x = Character.getNumericValue(array[3]) * 100;

        String piece = new String(arrayp);

        CURRENT_PIECE = piece;

        //create a new image using current piece visual
        Image image = new Image(Viewer.class.getResourceAsStream("assets/" + CURRENT_PIECE + ".png"));
        ImageView imageView = new ImageView(image);

        if(Character.getNumericValue(array[4]) > 3) {
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);
            imageView.setScaleX(-1);
            imageView.setRotate(360.0/4 * ((double)Character.getNumericValue(array[4]) - 4));
        } else {
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);
            imageView.setRotate(360.0/4 * (double)Character.getNumericValue(array[4]));
        }

        imageView.setX(x);
        imageView.setY(y);

        root.getChildren().add(imageView);
    }

    int[] getLocation(String placement, int counter) {

        char[] placementArray = placement.toCharArray();

        int y = placementArray[counter] - 'A' * 100;
        int x = placementArray[counter + 1] * 100;

        int[] array = {x, y};

        return array;
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
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("StepsGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        root.getChildren().add(controls);

        makeControls();

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
