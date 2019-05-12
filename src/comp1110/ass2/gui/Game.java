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
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.HashMap;

//TODO make it so the game ends if a tile can't be played
//TODO make it so your turn doesn't end before playing a special
//TODO add in theme music? and sound effects
//TODO add in game end - show score, etc

//Authored by Harriet
public class Game extends Application {
    //setup variables
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    private TextField textField;
    private final Group root = new Group();
    private final Group controls = new Group();
    private static final int DIMENSIONS = 75;
    private static final int[][] TILE_LOCATIONS = {{3 * DIMENSIONS - 35, 10 * DIMENSIONS}, {4 * DIMENSIONS, 10 * DIMENSIONS},
            {5 * DIMENSIONS + 35, 10 * DIMENSIONS}, {6 * DIMENSIONS + 70, 10 * DIMENSIONS}};

    //updated values
    private static int[][] SPECIAL_LOCATIONS = new int[6][2];
    private HashMap<String, String> tiles = new HashMap<>();
    private double orgSceneX, orgSceneY;
    private double orgTranslateX, orgTranslateY;
    private int TILES_TO_PLAY = 0;
    private int ROUND = 0;

    private String i1;
    private String i2;
    private String i3;
    private String i4;

    private ImageView t1;
    private ImageView t2;
    private ImageView t3;
    private ImageView t4;

    private ImageView s0;
    private ImageView s1;
    private ImageView s2;
    private ImageView s3;
    private ImageView s4;
    private ImageView s5;

    private int T1_ROTATION = 0;
    private int T2_ROTATION = 0;
    private int T3_ROTATION = 0;
    private int T4_ROTATION = 0;

    private int S0_ROTATION = 0;
    private int S1_ROTATION = 0;
    private int S2_ROTATION = 0;
    private int S3_ROTATION = 0;
    private int S4_ROTATION = 0;
    private int S5_ROTATION = 0;

    private int T1_FLIP = 1;
    private int T2_FLIP = 1;
    private int T3_FLIP = 1;
    private int T4_FLIP = 1;

    private int S0_FLIP = 1;
    private int S1_FLIP = 1;
    private int S2_FLIP = 1;
    private int S3_FLIP = 1;
    private int S4_FLIP = 1;
    private int S5_FLIP = 1;

    private int S_PLAYED = 0;

    //Authored by Harriet
    private void makeControls() {
        Button rollDice = new Button("Roll Dice");
        rollDice.setOnAction(e -> {
            //call drawNewTiles with given text
            if(TILES_TO_PLAY == 0) {
                drawNewTiles();
                TILES_TO_PLAY = 4;
                S_PLAYED = 0;
                ROUND++;
                if(ROUND > 7) {
                    root.getChildren().clear();
                    endGame();
                }
                T1_ROTATION = 0;
                T2_ROTATION = 0;
                T3_ROTATION = 0;
                T4_ROTATION = 0;
            }
        });
        rollDice.setLayoutX(10 * DIMENSIONS);
        rollDice.setLayoutY(2 * DIMENSIONS - 35);
        controls.getChildren().add(rollDice);

        Button setDimensions1 = new Button("Rotate");
        setDimensions1.setOnAction(e -> {
            //set tile1's rotation
            T1_ROTATION++;
            if(T1_ROTATION >= 4) {
                T1_ROTATION = 0;
            }
            t1.setRotate(360.0 / 4 * T1_ROTATION);
        });
        setDimensions1.setLayoutX(TILE_LOCATIONS[0][1] + 90);
        setDimensions1.setLayoutY(TILE_LOCATIONS[0][0] + DIMENSIONS/3);
        controls.getChildren().add(setDimensions1);

        Button setDimensions2 = new Button("Rotate");
        setDimensions2.setOnAction(e -> {
            //set tile2's rotation
            T2_ROTATION++;
            if(T2_ROTATION >= 4) {
                T2_ROTATION = 0;
            }
            t2.setRotate(360.0 / 4 * T2_ROTATION);
        });
        setDimensions2.setLayoutX(TILE_LOCATIONS[1][1] + 90);
        setDimensions2.setLayoutY(TILE_LOCATIONS[1][0] + DIMENSIONS/3);
        controls.getChildren().add(setDimensions2);

        Button setDimensions3 = new Button("Rotate");
        setDimensions3.setOnAction(e -> {
            //set tile3's rotation
            T3_ROTATION++;
            if(T3_ROTATION >= 4) {
                T3_ROTATION = 0;
            }
            t3.setRotate(360.0 / 4 * T3_ROTATION);
        });
        setDimensions3.setLayoutX(TILE_LOCATIONS[2][1] + 90);
        setDimensions3.setLayoutY(TILE_LOCATIONS[2][0] + DIMENSIONS/3);
        controls.getChildren().add(setDimensions3);

        Button setDimensions4 = new Button("Rotate");
        setDimensions4.setOnAction(e -> {
            //set tile4's rotation
            T4_ROTATION++;
            if(T4_ROTATION >= 4) {
                T4_ROTATION = 0;
            }
            t4.setRotate(360.0 / 4 * T4_ROTATION);
        });
        setDimensions4.setLayoutX(TILE_LOCATIONS[3][1] + 90);
        setDimensions4.setLayoutY(TILE_LOCATIONS[3][0] + DIMENSIONS/3);
        controls.getChildren().add(setDimensions4);

        Button flip1 = new Button("Flip");
        flip1.setOnAction(e -> {
            T1_FLIP = T1_FLIP * -1;
            t1.setScaleX(T1_FLIP);
        });
        flip1.setLayoutX(TILE_LOCATIONS[0][1] + 90);
        flip1.setLayoutY(TILE_LOCATIONS[0][0] + 2* DIMENSIONS/3);
        controls.getChildren().add(flip1);

        Button flip2 = new Button("Flip");
        flip2.setOnAction(e -> {
            T2_FLIP = T2_FLIP * -1;
            t2.setScaleX(T2_FLIP);
        });
        flip2.setLayoutX(TILE_LOCATIONS[1][1] + 90);
        flip2.setLayoutY(TILE_LOCATIONS[1][0] + 2 * DIMENSIONS/3);
        controls.getChildren().add(flip2);

        Button flip3 = new Button("Flip");
        flip3.setOnAction(e -> {
            T3_FLIP = T3_FLIP * -1;
            t3.setScaleX(T3_FLIP);
        });
        flip3.setLayoutX(TILE_LOCATIONS[2][1] + 90);
        flip3.setLayoutY(TILE_LOCATIONS[2][0] + 2* DIMENSIONS/3);
        controls.getChildren().add(flip3);

        Button flip4 = new Button("Flip");
        flip4.setOnAction(e -> {
            T4_FLIP = T4_FLIP * -1;
            t4.setScaleX(T4_FLIP);
        });
        flip4.setLayoutX(TILE_LOCATIONS[3][1] + 90);
        flip4.setLayoutY(TILE_LOCATIONS[3][0] + 2 * DIMENSIONS/3);
        controls.getChildren().add(flip4);

        Button setDimensionsS0 = new Button("Rotate");
        setDimensionsS0.setOnAction(e -> {
            //set tile1's rotation
            S0_ROTATION++;
            if(S0_ROTATION >= 4) {
                S0_ROTATION = 0;
            }
            s0.setRotate(360.0 / 4 * S0_ROTATION);
        });
        setDimensionsS0.setLayoutX(SPECIAL_LOCATIONS[0][0] + DIMENSIONS + 10);
        setDimensionsS0.setLayoutY(SPECIAL_LOCATIONS[0][1]);
        controls.getChildren().add(setDimensionsS0);

        Button setDimensionsS1 = new Button("Rotate");
        setDimensionsS1.setOnAction(e -> {
            //set tile1's rotation
            S1_ROTATION++;
            if(S1_ROTATION >= 4) {
                S1_ROTATION = 0;
            }
            s1.setRotate(360.0 / 4 * S1_ROTATION);
        });
        setDimensionsS1.setLayoutX(SPECIAL_LOCATIONS[1][0] + DIMENSIONS + 10);
        setDimensionsS1.setLayoutY(SPECIAL_LOCATIONS[1][1]);
        controls.getChildren().add(setDimensionsS1);

        Button setDimensionsS2 = new Button("Rotate");
        setDimensionsS2.setOnAction(e -> {
            //set tile1's rotation
            S2_ROTATION++;
            if(S2_ROTATION >= 4) {
                S2_ROTATION = 0;
            }
            s2.setRotate(360.0 / 4 * S2_ROTATION);
        });
        setDimensionsS2.setLayoutX(SPECIAL_LOCATIONS[2][0] + DIMENSIONS + 10);
        setDimensionsS2.setLayoutY(SPECIAL_LOCATIONS[2][1]);
        controls.getChildren().add(setDimensionsS2);

        Button setDimensionsS3 = new Button("Rotate");
        setDimensionsS3.setOnAction(e -> {
            //set tile1's rotation
            S3_ROTATION++;
            if(S3_ROTATION >= 4) {
                S3_ROTATION = 0;
            }
            s3.setRotate(360.0 / 4 * S3_ROTATION);
        });
        setDimensionsS3.setLayoutX(SPECIAL_LOCATIONS[3][0] + DIMENSIONS + 10);
        setDimensionsS3.setLayoutY(SPECIAL_LOCATIONS[3][1]);
        controls.getChildren().add(setDimensionsS3);

        Button setDimensionsS4 = new Button("Rotate");
        setDimensionsS4.setOnAction(e -> {
            //set tile1's rotation
            S4_ROTATION++;
            if(S4_ROTATION >= 4) {
                S4_ROTATION = 0;
            }
            s4.setRotate(360.0 / 4 * S4_ROTATION);
        });
        setDimensionsS4.setLayoutX(SPECIAL_LOCATIONS[4][0] + DIMENSIONS + 10);
        setDimensionsS4.setLayoutY(SPECIAL_LOCATIONS[4][1]);
        controls.getChildren().add(setDimensionsS4);

        Button setDimensionsS5 = new Button("Rotate");
        setDimensionsS5.setOnAction(e -> {
            //set tile1's rotation
            S5_ROTATION++;
            if(S5_ROTATION >= 4) {
                S5_ROTATION = 0;
            }
            s5.setRotate(360.0 / 4 * S5_ROTATION);
        });
        setDimensionsS5.setLayoutX(SPECIAL_LOCATIONS[5][0] + DIMENSIONS + 10);
        setDimensionsS5.setLayoutY(SPECIAL_LOCATIONS[5][1]);
        controls.getChildren().add(setDimensionsS5);


        Button flipS0 = new Button("Flip");
        flipS0.setOnAction(e -> {
            S0_FLIP = S0_FLIP * -1;
            s0.setScaleX(S0_FLIP);
        });
        flipS0.setLayoutX(SPECIAL_LOCATIONS[0][0] + DIMENSIONS + 10);
        flipS0.setLayoutY(SPECIAL_LOCATIONS[0][1] + DIMENSIONS/3);
        controls.getChildren().add(flipS0);

        Button flipS1 = new Button("Flip");
        flipS1.setOnAction(e -> {
            S1_FLIP = S1_FLIP * -1;
            s1.setScaleX(S1_FLIP);
        });
        flipS1.setLayoutX(SPECIAL_LOCATIONS[1][0] + DIMENSIONS + 10);
        flipS1.setLayoutY(SPECIAL_LOCATIONS[1][1] + DIMENSIONS/3);
        controls.getChildren().add(flipS1);

        Button flipS2 = new Button("Flip");
        flipS2.setOnAction(e -> {
            S2_FLIP = S2_FLIP * -1;
            s2.setScaleX(S2_FLIP);
        });
        flipS2.setLayoutX(SPECIAL_LOCATIONS[2][0] + DIMENSIONS + 10);
        flipS2.setLayoutY(SPECIAL_LOCATIONS[2][1] + DIMENSIONS/3);
        controls.getChildren().add(flipS2);

        Button flipS3 = new Button("Flip");
        flipS3.setOnAction(e -> {
            S3_FLIP = S3_FLIP * -1;
            s3.setScaleX(S3_FLIP);
        });
        flipS3.setLayoutX(SPECIAL_LOCATIONS[3][0] + DIMENSIONS + 10);
        flipS3.setLayoutY(SPECIAL_LOCATIONS[3][1] + DIMENSIONS/3);
        controls.getChildren().add(flipS3);

        Button flipS4 = new Button("Flip");
        flipS4.setOnAction(e -> {
            S4_FLIP = S4_FLIP * -1;
            s4.setScaleX(S4_FLIP);
        });
        flipS4.setLayoutX(SPECIAL_LOCATIONS[4][0] + DIMENSIONS + 10);
        flipS4.setLayoutY(SPECIAL_LOCATIONS[4][1] + DIMENSIONS/3);
        controls.getChildren().add(flipS4);

        Button flipS5 = new Button("Flip");
        flipS5.setOnAction(e -> {
            S5_FLIP = S5_FLIP * -1;
            s5.setScaleX(S5_FLIP);
        });
        flipS5.setLayoutX(SPECIAL_LOCATIONS[5][0] + DIMENSIONS + 10);
        flipS5.setLayoutY(SPECIAL_LOCATIONS[5][1] + DIMENSIONS/3);
        controls.getChildren().add(flipS5);

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
        i1 = new String(tiles1);
        Image image1 = new Image(Game.class.getResourceAsStream("assets/"+ i1 + ".png"));
        t1 = new ImageView(image1);
        t1.setFitHeight(DIMENSIONS);
        t1.setFitWidth(DIMENSIONS);
        t1.setX(TILE_LOCATIONS[0][1]);
        t1.setY(TILE_LOCATIONS[0][0]);
        t1.setCursor(Cursor.HAND);
        t1.setOnMousePressed(clickTile);
        t1.setOnMouseDragged(dragTile);
        t1.setOnMouseReleased(dropTile1);
        root.getChildren().add(t1);

        char[] tiles2 = {tiles[2], tiles[3]};
        i2 = new String(tiles2);
        Image image2 = new Image(Game.class.getResourceAsStream("assets/"+ i2 + ".png"));
        t2 = new ImageView(image2);
        t2.setFitHeight(DIMENSIONS);
        t2.setFitWidth(DIMENSIONS);
        t2.setX(TILE_LOCATIONS[1][1]);
        t2.setY(TILE_LOCATIONS[1][0]);
        t2.setCursor(Cursor.HAND);
        t2.setOnMousePressed(clickTile);
        t2.setOnMouseDragged(dragTile);
        t2.setOnMouseReleased(dropTile2);
        root.getChildren().add(t2);

        char[] tiles3 = {tiles[4], tiles[5]};
        i3 = new String(tiles3);
        Image image3 = new Image(Game.class.getResourceAsStream("assets/"+ i3 + ".png"));
        //i3 = "assets/" + tile3 + ".png";
        t3 = new ImageView(image3);
        t3.setFitHeight(DIMENSIONS);
        t3.setFitWidth(DIMENSIONS);
        t3.setX(TILE_LOCATIONS[2][1]);
        t3.setY(TILE_LOCATIONS[2][0]);
        t3.setCursor(Cursor.HAND);
        t3.setOnMousePressed(clickTile);
        t3.setOnMouseDragged(dragTile);
        t3.setOnMouseReleased(dropTile3);
        root.getChildren().add(t3);

        char[] tiles4 = {tiles[6], tiles[7]};
        i4 = new String(tiles4);
        Image image4 = new Image(Game.class.getResourceAsStream("assets/"+ i4 + ".png"));
        //i4 = "assets/"+ tile4 + ".png";
        t4 = new ImageView(image4);
        t4.setFitHeight(DIMENSIONS);
        t4.setFitWidth(DIMENSIONS);
        t4.setX(TILE_LOCATIONS[3][1]);
        t4.setY(TILE_LOCATIONS[3][0]);
        t4.setCursor(Cursor.HAND);
        t4.setOnMousePressed(clickTile);
        t4.setOnMouseDragged(dragTile);
        t4.setOnMouseReleased(dropTile4);
        root.getChildren().add(t4);
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
    EventHandler<MouseEvent> dragTile = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX() - orgSceneX;
            double y = t.getSceneY() - orgSceneY;

            //Move the imageview with the mouse
            ((ImageView)(t.getSource())).setTranslateX(x);
            ((ImageView)(t.getSource())).setTranslateY(y);

        }
    };

    //code adapted from <http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html> by Harriet
    EventHandler<MouseEvent> dropTile1 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, i1, T1_ROTATION, T1_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));
                Image image1 = new Image(Game.class.getResourceAsStream("assets/"+ i1 + ".png"));
                //i1 = "assets/" + tile1 + ".png";
                t1 = new ImageView(image1);
                t1.setFitHeight(DIMENSIONS);
                t1.setFitWidth(DIMENSIONS);
                t1.setX(TILE_LOCATIONS[0][1]);
                t1.setY(TILE_LOCATIONS[0][0]);
                t1.setScaleX(T1_FLIP);
                t1.setRotate(360.0 / 4 * T1_ROTATION);
                t1.setCursor(Cursor.HAND);
                t1.setOnMousePressed(clickTile);
                t1.setOnMouseDragged(dragTile);
                t1.setOnMouseReleased(dropTile1);
                root.getChildren().add(t1);
            }
        }
    };

    //code adapted from <http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html> by Harriet
    EventHandler<MouseEvent> dropTile2 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, i2, T2_ROTATION, T2_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));
                Image image2 = new Image(Game.class.getResourceAsStream("assets/"+ i2 + ".png"));
                //i2 = "assets/"+ tile2 + ".png";
                t2 = new ImageView(image2);
                t2.setFitHeight(DIMENSIONS);
                t2.setFitWidth(DIMENSIONS);
                t2.setX(TILE_LOCATIONS[1][1]);
                t2.setY(TILE_LOCATIONS[1][0]);
                t2.setScaleX(T2_FLIP);
                t2.setRotate(360.0 / 4 * T2_ROTATION);
                t2.setCursor(Cursor.HAND);
                t2.setOnMousePressed(clickTile);
                t2.setOnMouseDragged(dragTile);
                t2.setOnMouseReleased(dropTile2);
                root.getChildren().add(t2);
            }
        }
    };

    //code adapted from <http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html> by Harriet
    EventHandler<MouseEvent> dropTile3 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, i3, T3_ROTATION, T3_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));
                Image image3 = new Image(Game.class.getResourceAsStream("assets/"+ i3 + ".png"));
                t3 = new ImageView(image3);
                t3.setFitHeight(DIMENSIONS);
                t3.setFitWidth(DIMENSIONS);
                t3.setX(TILE_LOCATIONS[2][1]);
                t3.setY(TILE_LOCATIONS[2][0]);
                t3.setScaleX(T3_FLIP);
                t3.setRotate(360.0 / 4 * T3_ROTATION);
                t3.setCursor(Cursor.HAND);
                t3.setOnMousePressed(clickTile);
                t3.setOnMouseDragged(dragTile);
                t3.setOnMouseReleased(dropTile3);
                root.getChildren().add(t3);
            }
        }
    };

    //Authored by Harriet
    private EventHandler<MouseEvent> dropTile4 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, i4, T4_ROTATION, T4_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));
                Image image4 = new Image(Game.class.getResourceAsStream("assets/"+ i4 + ".png"));
                t4 = new ImageView(image4);
                t4.setFitHeight(DIMENSIONS);
                t4.setFitWidth(DIMENSIONS);
                t4.setX(TILE_LOCATIONS[3][1]);
                t4.setY(TILE_LOCATIONS[3][0]);
                t4.setScaleX(T4_FLIP);
                t4.setRotate(360.0 / 4 * T4_ROTATION);
                t4.setCursor(Cursor.HAND);
                t4.setOnMousePressed(clickTile);
                t4.setOnMouseDragged(dragTile);
                t4.setOnMouseReleased(dropTile4);
                root.getChildren().add(t4);
            }
        }
    };

    //Authored by Harriet
    private EventHandler<MouseEvent> dropTileS0 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, "S0", S0_ROTATION, S0_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView)(t.getSource()));
            } else {
                root.getChildren().remove((ImageView)(t.getSource()));
                Image image0 = new Image(Game.class.getResourceAsStream("assets/S0.png"));
                s0 = new ImageView(image0);
                s0.setFitHeight(DIMENSIONS);
                s0.setFitWidth(DIMENSIONS);
                s0.setX(SPECIAL_LOCATIONS[0][0]);
                s0.setY(SPECIAL_LOCATIONS[0][1]);
                s0.setScaleX(S0_FLIP);
                s0.setRotate(360.0 / 4 * S0_ROTATION);
                s0.setCursor(Cursor.HAND);
                s0.setOnMousePressed(clickTile);
                s0.setOnMouseDragged(dragTile);
                s0.setOnMouseReleased(dropTileS0);
                root.getChildren().add(s0);
            }
        }
    };

    //Authored by Harriet
    private EventHandler<MouseEvent> dropTileS1 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, "S1", S1_ROTATION, S1_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));
                Image image1 = new Image(Game.class.getResourceAsStream("assets/S1.png"));
                s1 = new ImageView(image1);
                s1.setFitHeight(DIMENSIONS);
                s1.setFitWidth(DIMENSIONS);
                s1.setX(SPECIAL_LOCATIONS[1][0]);
                s1.setY(SPECIAL_LOCATIONS[1][1]);
                s1.setScaleX(S1_FLIP);
                s1.setRotate(360.0 / 4 * S1_ROTATION);
                s1.setCursor(Cursor.HAND);
                s1.setOnMousePressed(clickTile);
                s1.setOnMouseDragged(dragTile);
                s1.setOnMouseReleased(dropTileS1);
                root.getChildren().add(s1);
            }
        }
    };

    //Authored by Harriet
    private EventHandler<MouseEvent> dropTileS2 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, "S2", S2_ROTATION, S2_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));
                Image image2 = new Image(Game.class.getResourceAsStream("assets/S2.png"));
                s2 = new ImageView(image2);
                s2.setFitHeight(DIMENSIONS);
                s2.setFitWidth(DIMENSIONS);
                s2.setX(SPECIAL_LOCATIONS[2][0]);
                s2.setY(SPECIAL_LOCATIONS[2][1]);
                s2.setScaleX(S2_FLIP);
                s2.setRotate(360.0 / 4 * S2_ROTATION);
                s2.setCursor(Cursor.HAND);
                s2.setOnMousePressed(clickTile);
                s2.setOnMouseDragged(dragTile);
                s2.setOnMouseReleased(dropTileS2);
                root.getChildren().add(s2);
            }
        }
    };

    //Authored by Harriet
    private EventHandler<MouseEvent> dropTileS3 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, "S3", S3_ROTATION, S3_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));

                Image image3 = new Image(Game.class.getResourceAsStream("assets/S3.png"));
                s3 = new ImageView(image3);
                s3.setFitHeight(DIMENSIONS);
                s3.setFitWidth(DIMENSIONS);
                s3.setX(SPECIAL_LOCATIONS[3][0]);
                s3.setY(SPECIAL_LOCATIONS[3][1]);
                s3.setScaleX(S3_FLIP);
                s3.setRotate(360.0 / 4 * S3_ROTATION);
                s3.setCursor(Cursor.HAND);
                s3.setOnMousePressed(clickTile);
                s3.setOnMouseDragged(dragTile);
                s3.setOnMouseReleased(dropTileS3);
                root.getChildren().add(s3);

            }
        }
    };

    //Authored by Harriet
    private EventHandler<MouseEvent> dropTileS4 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, "S4", S4_ROTATION, S4_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));

                Image image4 = new Image(Game.class.getResourceAsStream("assets/S4.png"));
                s4 = new ImageView(image4);
                s4.setFitHeight(DIMENSIONS);
                s4.setFitWidth(DIMENSIONS);
                s4.setX(SPECIAL_LOCATIONS[4][0]);
                s4.setY(SPECIAL_LOCATIONS[4][1]);
                s4.setScaleX(S4_FLIP);
                s4.setRotate(360.0 / 4 * S4_ROTATION);
                s4.setCursor(Cursor.HAND);
                s4.setOnMousePressed(clickTile);
                s4.setOnMouseDragged(dragTile);
                s4.setOnMouseReleased(dropTileS4);
                root.getChildren().add(s4);
            }
        }
    };

    //Authored by Harriet
    private EventHandler<MouseEvent> dropTileS5 = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX();
            double y = t.getSceneY();

            boolean drawT = drawTile(x, y, "S5", S5_ROTATION, S5_FLIP);

            if(drawT) {
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                root.getChildren().remove((ImageView) (t.getSource()));
                Image image5 = new Image(Game.class.getResourceAsStream("assets/S5.png"));
                s5 = new ImageView(image5);
                s5.setFitHeight(DIMENSIONS);
                s5.setFitWidth(DIMENSIONS);
                s5.setX(SPECIAL_LOCATIONS[5][0]);
                s5.setY(SPECIAL_LOCATIONS[5][1]);
                s5.setScaleX(S5_FLIP);
                s5.setRotate(360.0 / 4 * S5_ROTATION);
                s5.setCursor(Cursor.HAND);
                s5.setOnMousePressed(clickTile);
                s5.setOnMouseDragged(dragTile);
                s5.setOnMouseReleased(dropTileS5);
                root.getChildren().add(s5);
            }
        }
    };


    private boolean drawTile(double x, double y, String tileName, int rotation, int orientation) {
        char tileY = (char)('A' + (int)y/DIMENSIONS - 1);
        String tileX = Integer.toString((int)x/(DIMENSIONS) - 1);

        int orientationValue;

        if(orientation == -1) {
            orientationValue = rotation + 4;
        } else {
            orientationValue = rotation;
        }

        String tileLocation = tileY + tileX;
        String tileString = tileName + tileLocation + orientationValue;

        String boardString = RailroadInk.boardListToBoardString(tiles) + tileString;

        if (tileName.toCharArray()[0] == 'S') {
            if(S_PLAYED == 1) {
                return false;
            }
        }

        if(RailroadInk.isTilePlacementWellFormed(tileString)) {
            if (RailroadInk.isValidPlacementSequence(boardString)) {
                tiles.put(tileLocation, tileString);

                Image img = new Image(Game.class.getResourceAsStream("assets/" + tileName + ".png"));
                ImageView tile = new ImageView(img);
                tile.setFitHeight(DIMENSIONS);
                tile.setFitWidth(DIMENSIONS);
                int[] location = snapToGrid(x, y);
                tile.setX(location[0]);
                tile.setY(location[1]);
                tile.setRotate(360.0 / 4 * rotation);
                tile.setScaleX(orientation);
                root.getChildren().add(tile);

                if (tileName.toCharArray()[0] != 'S') {
                    TILES_TO_PLAY--;
                } else {
                    S_PLAYED = 1;
                }

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private int[] snapToGrid(double x, double y) {
        int[][] xValues = new int[7][2];
        int[][] yValues = new int[7][2];
        int[] finalLocation = {DIMENSIONS, DIMENSIONS};

        for(int i = 0; i < 7; i++) {
            xValues[i][0] = i * DIMENSIONS + DIMENSIONS;
            xValues[i][1] = i * DIMENSIONS + 2 * DIMENSIONS;
        }

        for(int i = 0; i < 7; i++) {
            yValues[i][0] = i * DIMENSIONS + DIMENSIONS;
            yValues[i][1] = i * DIMENSIONS + 2 * DIMENSIONS;
        }

        for(int i = 0; i < 7; i++) {
            if(x > xValues[i][0] && x < xValues[i][1]) {
                finalLocation[0] = i * DIMENSIONS + DIMENSIONS;
            }
            if(y > yValues[i][0] && y < yValues[i][1]) {
                finalLocation[1] = i * DIMENSIONS + DIMENSIONS;
            }
        }

        return finalLocation;
    }


    //Authored by Harriet
    private void drawBoard() {

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

        for(int k = 0; k < 6; k++) {
            Line line1 = new Line();
            line1.setStartX(SPECIAL_LOCATIONS[k][0]);
            line1.setStartY(SPECIAL_LOCATIONS[k][1]);
            line1.setEndX(SPECIAL_LOCATIONS[k][0] + DIMENSIONS);
            line1.setEndY(SPECIAL_LOCATIONS[k][1]);
            root.getChildren().add(line1);

            Line line2 = new Line();
            line2.setStartX(SPECIAL_LOCATIONS[k][0]);
            line2.setStartY(SPECIAL_LOCATIONS[k][1] + DIMENSIONS);
            line2.setEndX(SPECIAL_LOCATIONS[k][0] + DIMENSIONS);
            line2.setEndY(SPECIAL_LOCATIONS[k][1] + DIMENSIONS);

            root.getChildren().add(line2);

            Line line3 = new Line();
            line3.setStartX(SPECIAL_LOCATIONS[k][0]);
            line3.setStartY(SPECIAL_LOCATIONS[k][1]);
            line3.setEndX(SPECIAL_LOCATIONS[k][0]);
            line3.setEndY(SPECIAL_LOCATIONS[k][1] + DIMENSIONS);

            root.getChildren().add(line3);

            Line line4 = new Line();
            line4.setStartX(SPECIAL_LOCATIONS[k][0] + DIMENSIONS);
            line4.setStartY(SPECIAL_LOCATIONS[k][1]);
            line4.setEndX(SPECIAL_LOCATIONS[k][0] + DIMENSIONS);
            line4.setEndY(SPECIAL_LOCATIONS[k][1] + DIMENSIONS);

            root.getChildren().add(line4);
        }
    }

    private void endGame() {
        String boardString = RailroadInk.boardListToBoardString(tiles);

        //Creating a Text object
        Text text = new Text();

        //Setting font to the text
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));

        //setting the position of the text
        text.setX(50);
        text.setY(130);

        //Setting the color
        text.setFill(Color.BROWN);

        //Setting the Stroke
        text.setStrokeWidth(2);

        // Setting the stroke color
        text.setStroke(Color.BLUE);

        //Setting the text to be added.
        text.setText("Hi how are you");

        root.getChildren().add(text);

    }

    void drawSpecial() {
        Image image0 = new Image(Game.class.getResourceAsStream("assets/S0.png"));
        s0 = new ImageView(image0);
        s0.setFitHeight(DIMENSIONS);
        s0.setFitWidth(DIMENSIONS);
        s0.setX(SPECIAL_LOCATIONS[0][0]);
        s0.setY(SPECIAL_LOCATIONS[0][1]);
        s0.setCursor(Cursor.HAND);
        s0.setOnMousePressed(clickTile);
        s0.setOnMouseDragged(dragTile);
        s0.setOnMouseReleased(dropTileS0);
        root.getChildren().add(s0);

        Image image1 = new Image(Game.class.getResourceAsStream("assets/S1.png"));
        s1 = new ImageView(image1);
        s1.setFitHeight(DIMENSIONS);
        s1.setFitWidth(DIMENSIONS);
        s1.setX(SPECIAL_LOCATIONS[1][0]);
        s1.setY(SPECIAL_LOCATIONS[1][1]);
        s1.setCursor(Cursor.HAND);
        s1.setOnMousePressed(clickTile);
        s1.setOnMouseDragged(dragTile);
        s1.setOnMouseReleased(dropTileS1);
        root.getChildren().add(s1);

        Image image2 = new Image(Game.class.getResourceAsStream("assets/S2.png"));
        s2 = new ImageView(image2);
        s2.setFitHeight(DIMENSIONS);
        s2.setFitWidth(DIMENSIONS);
        s2.setX(SPECIAL_LOCATIONS[2][0]);
        s2.setY(SPECIAL_LOCATIONS[2][1]);
        s2.setCursor(Cursor.HAND);
        s2.setOnMousePressed(clickTile);
        s2.setOnMouseDragged(dragTile);
        s2.setOnMouseReleased(dropTileS2);
        root.getChildren().add(s2);

        Image image3 = new Image(Game.class.getResourceAsStream("assets/S3.png"));
        s3 = new ImageView(image3);
        s3.setFitHeight(DIMENSIONS);
        s3.setFitWidth(DIMENSIONS);
        s3.setX(SPECIAL_LOCATIONS[3][0]);
        s3.setY(SPECIAL_LOCATIONS[3][1]);
        s3.setCursor(Cursor.HAND);
        s3.setOnMousePressed(clickTile);
        s3.setOnMouseDragged(dragTile);
        s3.setOnMouseReleased(dropTileS3);
        root.getChildren().add(s3);

        Image image4 = new Image(Game.class.getResourceAsStream("assets/S4.png"));
        s4 = new ImageView(image4);
        s4.setFitHeight(DIMENSIONS);
        s4.setFitWidth(DIMENSIONS);
        s4.setX(SPECIAL_LOCATIONS[4][0]);
        s4.setY(SPECIAL_LOCATIONS[4][1]);
        s4.setCursor(Cursor.HAND);
        s4.setOnMousePressed(clickTile);
        s4.setOnMouseDragged(dragTile);
        s4.setOnMouseReleased(dropTileS4);
        root.getChildren().add(s4);

        Image image5 = new Image(Game.class.getResourceAsStream("assets/S5.png"));
        s5 = new ImageView(image5);
        s5.setFitHeight(DIMENSIONS);
        s5.setFitWidth(DIMENSIONS);
        s5.setX(SPECIAL_LOCATIONS[5][0]);
        s5.setY(SPECIAL_LOCATIONS[5][1]);
        s5.setCursor(Cursor.HAND);
        s5.setOnMousePressed(clickTile);
        s5.setOnMouseDragged(dragTile);
        s5.setOnMouseReleased(dropTileS5);
        root.getChildren().add(s5);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Railroad Ink");
        Scene play = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        for(int i = 0; i < 6; i++) {
            SPECIAL_LOCATIONS[i][0] = (i * 2 * (DIMENSIONS + 10)) + 10;
            SPECIAL_LOCATIONS[i][1] = 8 * DIMENSIONS + 2 * DIMENSIONS / 3;
        }

        root.getChildren().add(controls);

        makeControls();
        drawBoard();
        drawSpecial();

        primaryStage.setScene(play);
        primaryStage.show();
    }
}