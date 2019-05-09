package comp1110.ass2.gui;

import comp1110.ass2.Pieces;
import comp1110.ass2.RailroadInk;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static comp1110.ass2.RailroadInk.generateDiceRoll;


//Authored by Harriet
public class Game extends Application {
    /* board layout */
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;

    private static final int DIMENSIONS = 80;

    private static boolean NEW_ROUND = true;
    private static final int[][] TILE_LOCATIONS = {{3 * DIMENSIONS - 35, 10 * DIMENSIONS}, {4 * DIMENSIONS, 10 * DIMENSIONS}, {5 * DIMENSIONS + 35, 10 * DIMENSIONS}, {6 * DIMENSIONS + 70, 10 * DIMENSIONS}};

    private static int TILES_TO_PLAY = 4;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();

    private HashMap<String, String> tiles = new HashMap<>();

    private TextField textField;

    private double orgSceneX, orgSceneY;
    private double orgTranslateX, orgTranslateY;

    private double imgX, imgY;

    private boolean DRAGGED = false;

    private String recentImg;

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */

    //Authored by Harriet
    private void makePlacement(String placement) {

        char[] array = placement.toCharArray();

        //create pieces until exhausted the list
        for (int i = 0; i < placement.length(); i = i + 5) {

            char[] arrayPieceName = {array[i], array[i+1]};

            int y = (array[i + 2] - 'A') * DIMENSIONS;
            int x = Character.getNumericValue(array[i + 3]) * DIMENSIONS;

            String piece = new String(arrayPieceName);

            //create a new image using current piece visual
            Image image = new Image(Game.class.getResourceAsStream("assets/" + piece + ".png"));
            ImageView imageView = new ImageView(image);

            if (Character.getNumericValue(array[i + 4]) > 3) {
                //set the image dimensions to 100
                imageView.setFitHeight(DIMENSIONS);
                imageView.setFitWidth(DIMENSIONS);
                //flip the image
                imageView.setScaleX(-1);
                //rotate the image
                imageView.setRotate(360.0 / 4 * ((double) Character.getNumericValue(array[4]) - 4));
            } else {
                //set the image dimensions
                imageView.setFitHeight(DIMENSIONS);
                imageView.setFitWidth(DIMENSIONS);
                //rotate the image
                imageView.setRotate(360.0 / 4 * (double) Character.getNumericValue(array[4]));
            }

            //set the image's location
            imageView.setX(x + DIMENSIONS);
            imageView.setY(y + DIMENSIONS);

            //add the image to root
            root.getChildren().add(imageView);
        }
    }

    /**
     * Create a basic text field for input and a refresh button.
     */

    //Edits by Harriet
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

        Button rollDice = new Button("Roll Dice");
        rollDice.setOnAction(e -> {
            //call drawNewTiles with given text
            if(NEW_ROUND) {
                drawNewTiles();
                NEW_ROUND = false;
            }
        });
        rollDice.setLayoutX(10 * DIMENSIONS);
        rollDice.setLayoutY(2 * DIMENSIONS - 35);
        controls.getChildren().add(rollDice);

    }

    void drawNewTiles() {
        //Generate a new string (then char array) of tiles for this round
        String tileString = RailroadInk.generateDiceRoll();
        char[] tiles = tileString.toCharArray();

        //For each of the four tiles, find the name of the tile,
        //then find the image that tile relates to,
        //then create a new imageview for the tile, setting the dimensions and location of it
        //set the cursor to be a hand when on the image
        //execute the clickTile event if clicked and the dragTile event if dragged
        //finally add the tile to root
        char[] tiles1 = {tiles[0], tiles[1]};
        String tile1 = new String(tiles1);
        Image tile1i = new Image(Game.class.getResourceAsStream("assets/"+ tile1 + ".png"));
        ImageView tile1iv = new ImageView(tile1i);
        tile1iv.setFitHeight(DIMENSIONS);
        tile1iv.setFitWidth(DIMENSIONS);
        tile1iv.setX(TILE_LOCATIONS[0][1]);
        tile1iv.setY(TILE_LOCATIONS[0][0]);
        tile1iv.setCursor(Cursor.HAND);
        tile1iv.setOnMousePressed(clickTile);
        tile1iv.setOnMouseDragged(dragTile);
        tile1iv.setOnMouseReleased(dropTile);
        root.getChildren().add(tile1iv);

        char[] tiles2 = {tiles[2], tiles[3]};
        String tile2 = new String(tiles2);
        Image tile2i = new Image(Game.class.getResourceAsStream("assets/"+ tile2 + ".png"));
        ImageView tile2iv = new ImageView(tile2i);
        tile2iv.setFitHeight(DIMENSIONS);
        tile2iv.setFitWidth(DIMENSIONS);
        tile2iv.setX(TILE_LOCATIONS[1][1]);
        tile2iv.setY(TILE_LOCATIONS[1][0]);
        tile2iv.setCursor(Cursor.HAND);
        tile2iv.setOnMousePressed(clickTile);
        tile2iv.setOnMouseDragged(dragTile);
        tile2iv.setOnMouseReleased(dropTile);
        root.getChildren().add(tile2iv);

        char[] tiles3 = {tiles[4], tiles[5]};
        String tile3 = new String(tiles3);
        Image tile3i = new Image(Game.class.getResourceAsStream("assets/"+ tile3 + ".png"));
        ImageView tile3iv = new ImageView(tile3i);
        tile3iv.setFitHeight(DIMENSIONS);
        tile3iv.setFitWidth(DIMENSIONS);
        tile3iv.setX(TILE_LOCATIONS[2][1]);
        tile3iv.setY(TILE_LOCATIONS[2][0]);
        tile3iv.setCursor(Cursor.HAND);
        tile3iv.setOnMousePressed(clickTile);
        tile3iv.setOnMouseDragged(dragTile);
        tile3iv.setOnMouseReleased(dropTile);
        root.getChildren().add(tile3iv);

        char[] tiles4 = {tiles[6], tiles[7]};
        String tile4 = new String(tiles4);
        Image tile4i = new Image(Game.class.getResourceAsStream("assets/"+ tile4 + ".png"));
        ImageView tile4iv = new ImageView(tile4i);
        tile4iv.setFitHeight(DIMENSIONS);
        tile4iv.setFitWidth(DIMENSIONS);
        tile4iv.setX(TILE_LOCATIONS[3][1]);
        tile4iv.setY(TILE_LOCATIONS[3][0]);
        tile4iv.setCursor(Cursor.HAND);
        tile4iv.setOnMousePressed(clickTile);
        tile4iv.setOnMouseDragged(dragTile);
        tile4iv.setOnMouseReleased(dropTile);
        root.getChildren().add(tile4iv);
    }

    //code adapted from <http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html> by Harriet
    EventHandler<MouseEvent> clickTile = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            //get the origin of the the event
            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
            //move the image with the
            orgTranslateX = ((ImageView)(t.getSource())).getTranslateX();
            orgTranslateY = ((ImageView)(t.getSource())).getTranslateY();
        }
    };

    //code adapted from <http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html> by Harriet
    EventHandler<MouseEvent> dropTile = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double offsetX = t.getSceneX() - orgSceneX;
            double offsetY = t.getSceneY() - orgSceneY;
            imgX = orgTranslateX + offsetX;
            imgY = orgTranslateY + offsetY;

            drawTile(orgTranslateX + offsetX, orgTranslateY + offsetY, (ImageView)(t.getSource()));

            root.getChildren().remove(t.getSource());
            DRAGGED = true;
        }
    };

    //code adapted from <http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html> by Harriet
    EventHandler<MouseEvent> dragTile = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double offsetX = t.getSceneX() - orgSceneX;
            double offsetY = t.getSceneY() - orgSceneY;
            double newTranslateX = orgTranslateX + offsetX;
            double newTranslateY = orgTranslateY + offsetY;

            //Move the imageview with the mouse
            ((ImageView)(t.getSource())).setTranslateX(newTranslateX);
            ((ImageView)(t.getSource())).setTranslateY(newTranslateY);

        }
    };

    void drawTile(double x, double y, ImageView imageV) {

        Image img = imageV.getImage();

        System.out.println(img.getUrl());

        ImageView tile = new ImageView(img);
        tile.setFitHeight(DIMENSIONS);
        tile.setFitWidth(DIMENSIONS);
        tile.setX(x + 10);
        tile.setY(y + 10);
        root.getChildren().add(tile);

        System.out.println("Inside drawTile");

        TILES_TO_PLAY--;
    }


    //Authored by Harriet
    void drawBoard() {

        //Draw grid
        for(int k = 1; k < 9; k++) {
            Line line1 = new Line();
            line1.setStartX(DIMENSIONS * k);
            line1.setStartY(DIMENSIONS);
            line1.setEndX(DIMENSIONS * k);
            line1.setEndY(DIMENSIONS * 8);

            root.getChildren().add(line1);

            Line line2 = new Line();
            line2.setStartX(DIMENSIONS);
            line2.setStartY(DIMENSIONS * k);
            line2.setEndX(DIMENSIONS * 8);
            line2.setEndY(DIMENSIONS * k);

            root.getChildren().add(line2);
        }

        //Draw exit tiles
        //Arrays of exit locations and orientations
        char[][] highwayExits = { {'A', '3', '0'}, {'A', '7', '0'}, {'E', '1', '3'}, {'E', '9', '1'}, {'I', '3', '2'}, {'I', '7', '2'}};
        char[][] railroadExits = { {'A', '5', '0'}, {'C', '1', '3'}, {'C', '9', '1'}, {'G', '1', '3'}, {'G', '9', '1'}, {'I', '5', '2'}};

        //For every element in the arrays
        for(int i = 0; i < highwayExits.length; i++) {

            //Set the x location and y location of the highway tile
            int hy = ((highwayExits[i][0] - 'A')) * DIMENSIONS;
            int hx = (Character.getNumericValue(highwayExits[i][1])) * DIMENSIONS;

            //Add the highway exit image to an imageview
            Image image = new Image(Game.class.getResourceAsStream("assets/HighExit.png"));
            ImageView imageView = new ImageView(image);

            //Set the orientation of the highway tile
            imageView.setRotate(360.0 / 4 * (int)highwayExits[i][2]);

            //Set the height and width of the ImageView
            imageView.setFitHeight(DIMENSIONS);
            imageView.setFitWidth(DIMENSIONS);

            //Set the x and y of the ImageView
            imageView.setX(hx - DIMENSIONS);
            imageView.setY(hy);

            root.getChildren().add(imageView);

            int ry = ((railroadExits[i][0] - 'A')) * DIMENSIONS;
            int rx = (Character.getNumericValue(railroadExits[i][1])) * DIMENSIONS;

            Image image2 = new Image(Game.class.getResourceAsStream("assets/RailExit.png"));
            ImageView imageView2 = new ImageView(image2);

            imageView2.setRotate(360.0 / 4 * (int)railroadExits[i][2]);

            imageView2.setFitHeight(DIMENSIONS);
            imageView2.setFitWidth(DIMENSIONS);

            imageView2.setX(rx - DIMENSIONS);
            imageView2.setY(ry);

            root.getChildren().add(imageView2);
        }

        int offset = -35;

        for(int p = 0; p < 4; p++) {

            Line line1 = new Line();
            line1.setStartX(DIMENSIONS * 10);
            line1.setStartY((p + 3) * DIMENSIONS + offset);
            line1.setEndX(DIMENSIONS * 11);
            line1.setEndY((p + 3) * DIMENSIONS + offset);

            root.getChildren().add(line1);

            Line line2 = new Line();
            line2.setStartX(DIMENSIONS * 10);
            line2.setStartY((p + 3) * DIMENSIONS + offset);
            line2.setEndX(DIMENSIONS * 10);
            line2.setEndY((p + 4) * DIMENSIONS + offset);

            root.getChildren().add(line2);

            Line line3 = new Line();
            line3.setStartX(DIMENSIONS * 10);
            line3.setStartY((p + 4) * DIMENSIONS + offset);
            line3.setEndX(DIMENSIONS * 11);
            line3.setEndY((p + 4) * DIMENSIONS + offset);

            root.getChildren().add(line3);

            Line line4 = new Line();
            line4.setStartX(DIMENSIONS * 11);
            line4.setStartY((p + 3) * DIMENSIONS + offset);
            line4.setEndX(DIMENSIONS * 11);
            line4.setEndY((p + 4) * DIMENSIONS + offset);

            root.getChildren().add(line4);

            offset = offset + 35;
        }
    }

    void checkGameState() {
        if(TILES_TO_PLAY == 0) {
            NEW_ROUND = true;
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Railroad Ink");
        Scene play = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        root.getChildren().add(controls);

        makeControls();
        drawBoard();
        checkGameState();

        primaryStage.setScene(play);
        primaryStage.show();

    }
}
