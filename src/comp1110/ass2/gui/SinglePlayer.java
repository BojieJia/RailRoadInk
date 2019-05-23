package comp1110.ass2.gui;

import comp1110.ass2.RailroadInk;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.HashMap;

//Authored by Harriet
public class SinglePlayer extends Application {
    //setup variables
    static Stage classStage = new Stage();

    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    private TextField textField;
    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group board = new Group();
    private static final int DIMENSIONS = 75;
    private static final int[][] TILE_LOCATIONS = {{3 * DIMENSIONS - 35, 10 * DIMENSIONS}, {4 * DIMENSIONS, 10 * DIMENSIONS},
            {5 * DIMENSIONS + 35, 10 * DIMENSIONS}, {6 * DIMENSIONS + 70, 10 * DIMENSIONS}};

    //updated values
    private static int[][] SPECIAL_LOCATIONS = new int[6][2];
    private HashMap<String, String> tiles = new HashMap<>();
    private HashMap<String, String> tilesInPlay = new HashMap<>();
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

    private TileImageView s0;
    private TileImageView s1;
    private TileImageView s2;
    private TileImageView s3;
    private TileImageView s4;
    private TileImageView s5;

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


    /**
     * Makes all of the controls for the game
     */
    //Authored by Harriet
    private void makeControls() {
        //Button for generating new tiles at the start of a round
        Button rollDice = new Button("Roll Dice");
        rollDice.setOnAction(e -> {
            //if all tiles have been played
            if(TILES_TO_PLAY == 0) {
                //set tiles to play to 4 and S tiles played to 0
                TILES_TO_PLAY = 4;
                S_PLAYED = 0;
                //increase the round counter
                ROUND++;

                //reset the rotation and flip of all the new tiles
                T1_ROTATION = 0;
                T2_ROTATION = 0;
                T3_ROTATION = 0;
                T4_ROTATION = 0;

                T1_FLIP = 1;
                T2_FLIP = 1;
                T3_FLIP = 1;
                T4_FLIP = 1;

                //call the draw new tiles method
                drawNewTiles();

                if(ROUND > 7) {
                    //if all rounds have been played clear the root children and run the end game method
                    root.getChildren().clear();
                    root.getChildren().add(board);
                    endGame();
                }
            }
        });
        //set the location of the button and add to controls
        rollDice.setLayoutX(10 * DIMENSIONS);
        rollDice.setLayoutY(2 * DIMENSIONS - 35);
        controls.getChildren().add(rollDice);


        //Buttons for rotating the tiles for each round (same for each rotation button except for the class
        //variables and locations
        Button setDimensions1 = new Button("Rotate");
        setDimensions1.setOnAction(e -> {
            //increase the rotation class variable
            T1_ROTATION++;
            if(T1_ROTATION >= 4) {
                //if the rotation is greater than or equal to 4, reset it to 0
                T1_ROTATION = 0;
            }
            //set the tile's rotation
            t1.setRotate(360.0 / 4 * T1_ROTATION);
        });
        //set the x and y of the button and add to root
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


        //Buttons for flipping the tiles for each round (same for each rotation button except for the class
        //variables and locations
        Button flip1 = new Button("Flip");
        flip1.setOnAction(e -> {
            //set the flip class variable to be -1 * its current state (1 goes to -1, -1 goes to 1)
            T1_FLIP = T1_FLIP * -1;
            //set the tiles scale to the new flip value
            t1.setScaleX(T1_FLIP);
        });
        //set the button's location and add to controls
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



        //Special tile buttons - same as the round tiles except for the variables and locations
        Button setDimensionsS0 = new Button("Rotate");
        setDimensionsS0.setOnAction(e -> {
            //set tile's rotation
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
            //set tile's rotation
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
            //set tile's rotation
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
            //set tile's rotation
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


        //Special tiles flip buttons
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

    /**
     * Creates the tiles for this round
     */
    private void drawNewTiles() {
        //Generate a new string (then char array) of tiles for this round
        String tileString = RailroadInk.generateDiceRoll();
        char[] tiles = tileString.toCharArray();

        //If there are no tiles that can be played end the game
        if(RailroadInk.generateMove(RailroadInk.boardListToBoardString(this.tiles), tileString).length() == 0) {
            endGame();
        }

        //For each of the four tiles, find the name of the tile, setting the image class variable for that tile to it,
        //then create a new tileimageview for the tile, setting the image dimensions, location, flip and orientation of it
        //execute the clickTile event if clicked and the dragTile event if dragged
        //finally add the tile to root
        char[] tiles1 = {tiles[0], tiles[1]};
        i1 = new String(tiles1);
        t1 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i1 + ".png")), DIMENSIONS, TILE_LOCATIONS[0][1], TILE_LOCATIONS[0][0], T1_FLIP, T1_ROTATION);
        t1.setOnMousePressed(clickTile);
        t1.setOnMouseDragged(dragTile);
        t1.setOnMouseReleased(dropTile1);
        root.getChildren().add(t1);

        char[] tiles2 = {tiles[2], tiles[3]};
        i2 = new String(tiles2);
        t2 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i2 + ".png")), DIMENSIONS, TILE_LOCATIONS[1][1], TILE_LOCATIONS[1][0], T2_FLIP, T2_ROTATION);
        t2.setOnMousePressed(clickTile);
        t2.setOnMouseDragged(dragTile);
        t2.setOnMouseReleased(dropTile2);
        root.getChildren().add(t2);

        char[] tiles3 = {tiles[4], tiles[5]};
        i3 = new String(tiles3);
        t3 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i3 + ".png")), DIMENSIONS, TILE_LOCATIONS[2][1], TILE_LOCATIONS[2][0], T3_FLIP, T3_ROTATION);
        t3.setOnMousePressed(clickTile);
        t3.setOnMouseDragged(dragTile);
        t3.setOnMouseReleased(dropTile3);
        root.getChildren().add(t3);

        char[] tiles4 = {tiles[6], tiles[7]};
        i4 = new String(tiles4);
        t4 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i4 + ".png")), DIMENSIONS, TILE_LOCATIONS[3][1], TILE_LOCATIONS[3][0], T4_FLIP, T4_ROTATION);
        t4.setOnMousePressed(clickTile);
        t4.setOnMouseDragged(dragTile);
        t4.setOnMouseReleased(dropTile4);
        root.getChildren().add(t4);

        //Add the tiles to tilesInPlay
        tilesInPlay.put(i1, i1);
        tilesInPlay.put(i2, i2);
        tilesInPlay.put(i3, i3);
        tilesInPlay.put(i4, i4);
    }

    /**
     * Handles click events for tiles
     */
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

    /**
     * Handles the drag events for the tiles
     */
    //code adapted from <http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html> by Harriet
    EventHandler<MouseEvent> dragTile = new EventHandler<>() {
        @Override
        public void handle(MouseEvent t) {
            double x = t.getSceneX() - orgSceneX;
            double y = t.getSceneY() - orgSceneY;

            //Move the imageview to the x and y the mouse event happened at (translating it the amount of pixels
            //difference between the mouse event and object origin)
            ((ImageView)(t.getSource())).setTranslateX(x);
            ((ImageView)(t.getSource())).setTranslateY(y);

        }
    };

    /**
     * Each drop tile event handles the drop event for the particular tile being dropped
     */
    //Authored by Harriet
    EventHandler<MouseEvent> dropTile1 = new EventHandler<>() {
        //mouse drop tile event -- the same for each tile except for the variables used
        @Override
        public void handle(MouseEvent t) {
            //set x and y to the x and y the event happened at
            double x = t.getSceneX();
            double y = t.getSceneY();

            //call the drawTile method with the tile information
            boolean drawT = drawTile(x, y, i1, T1_ROTATION, T1_FLIP);

            //if draw t returns true
            if(drawT) {
                //remove the imageview from root
                root.getChildren().remove((ImageView) (t.getSource()));
            } else {
                //remove the imageview from root and recreate the tile in its starting position
                //(reset the tile)
                root.getChildren().remove((ImageView) (t.getSource()));
                t1 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i1 + ".png")), DIMENSIONS, TILE_LOCATIONS[0][1], TILE_LOCATIONS[0][0], T1_FLIP, T1_ROTATION);
                t1.setOnMousePressed(clickTile);
                t1.setOnMouseDragged(dragTile);
                t1.setOnMouseReleased(dropTile1);
                root.getChildren().add(t1);
            }
        }
    };

    //Authored by Harriet
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
                t2 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i2 + ".png")), DIMENSIONS, TILE_LOCATIONS[1][1], TILE_LOCATIONS[1][0], T2_FLIP, T2_ROTATION);
                Image image2 = new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i2 + ".png"));
                t2.setOnMousePressed(clickTile);
                t2.setOnMouseDragged(dragTile);
                t2.setOnMouseReleased(dropTile2);
                root.getChildren().add(t2);
            }
        }
    };

    //Authored by Harriet
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
                t3 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i3 + ".png")), DIMENSIONS, TILE_LOCATIONS[2][1], TILE_LOCATIONS[2][0], T3_FLIP, T3_ROTATION);
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
                t4 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/"+ i4 + ".png")), DIMENSIONS, TILE_LOCATIONS[3][1], TILE_LOCATIONS[3][0], T4_FLIP, T4_ROTATION);
                t4.setOnMousePressed(clickTile);
                t4.setOnMouseDragged(dragTile);
                t4.setOnMouseReleased(dropTile4);
                root.getChildren().add(t4);
            }
        }
    };


    //Drop tile events for special tiles - same as for round tiles except no need for class tile name variables
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
                s0 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S0.png")), DIMENSIONS, SPECIAL_LOCATIONS[0][0], SPECIAL_LOCATIONS[0][1], S0_FLIP, S0_ROTATION);
                s0.setOnMousePressed(clickTile);
                s0.setOnMouseDragged(dragTile);
                s0.setOnMouseReleased(dropTileS0);
                //adds the tile to root
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
                s1 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S1.png")), DIMENSIONS, SPECIAL_LOCATIONS[1][0], SPECIAL_LOCATIONS[1][1], S1_FLIP, S1_ROTATION);
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
                s2 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S2.png")), DIMENSIONS, SPECIAL_LOCATIONS[2][0], SPECIAL_LOCATIONS[2][1], S2_FLIP, S2_ROTATION);
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
                s3 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S3.png")), DIMENSIONS, SPECIAL_LOCATIONS[3][0], SPECIAL_LOCATIONS[3][1], S3_FLIP, S3_ROTATION);
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
                s4 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S4.png")), DIMENSIONS, SPECIAL_LOCATIONS[4][0], SPECIAL_LOCATIONS[4][1], S4_FLIP, S4_ROTATION);
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
                s5 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S5.png")), DIMENSIONS, SPECIAL_LOCATIONS[5][0], SPECIAL_LOCATIONS[5][1], S5_FLIP, S5_ROTATION);
                s5.setOnMousePressed(clickTile);
                s5.setOnMouseDragged(dragTile);
                s5.setOnMouseReleased(dropTileS5);
                root.getChildren().add(s5);
            }
        }
    };

    /**
     * Given the tile's dropped location, name, rotation and orientation determines if the tile's placement
     * is valid or invalid.
     * @return if tile placement is valid or not
     */
    //Authored by Harriet
    private boolean drawTile(double x, double y, String tileName, int rotation, int orientation) {

        //Finds the character value of the X and Y locations
        char tileY = (char)('A' + (int)y/DIMENSIONS - 1);
        String tileX = Integer.toString((int)x/(DIMENSIONS) - 1);

        int orientationValue;
        if(orientation == -1) {
            //Adds 4 to the rotation if the tile is flipped
            orientationValue = rotation + 4;
        } else {
            orientationValue = rotation;
        }

        //Creates strings for the tile location and creates a tile string
        String tileLocation = tileY + tileX;
        String tileString = tileName + tileLocation + orientationValue;

        //Creates a board string by calling boardListToBoardString on the tiles HashMap
        //and adding the tile string to it
        String boardString = RailroadInk.boardListToBoardString(tiles) + tileString;

        //If the tile is a special tile
        if (tileName.toCharArray()[0] == 'S') {
            //If a special tile has already been played this round return false
            if(S_PLAYED == 1) {
                return false;
            }
        }

        //If the tile placement string is well formed
        if(RailroadInk.isTilePlacementWellFormed(tileString) && ROUND > 0) {
            //If the board string is a valid placement sequence
            if (RailroadInk.isValidPlacementSequence(boardString)) {
                //Add the tile to the tiles HashMap
                tiles.put(tileLocation, tileString);

                //Create a new imageview with the tiles image
                Image img = new Image(SinglePlayer.class.getResourceAsStream("assets/" + tileName + ".png"));
                ImageView tile = new ImageView(img);
                tile.setFitHeight(DIMENSIONS);
                tile.setFitWidth(DIMENSIONS);
                //call the snap to grid function to find the tile's x and y position in the grid and set theem
                int[] location = snapToGrid(x, y);
                tile.setX(location[0]);
                tile.setY(location[1]);
                //set the tiles rotation and orientation and add to the rott
                tile.setRotate(360.0 / 4 * rotation);
                tile.setScaleX(orientation);
                board.getChildren().add(tile);

                //if the tile is not a special tile
                if (tileName.toCharArray()[0] != 'S') {
                    //decrease tiles to play by 1
                    TILES_TO_PLAY--;
                } else {
                    //set S_PLAYED to 1
                    S_PLAYED = 1;
                }

                //Remove the tile from tilesInPlay
                if (tileName.toCharArray()[0] != 'S') {
                    tilesInPlay.remove(tileName);
                }
                //Check if there are any tiles than can be played
                for(String str : tilesInPlay.keySet()) {
                    if(!RailroadInk.findPlacementForTile(RailroadInk.boardListToBoardString(tiles), str)){
                        endGame();
                    }
                }

                //Return true
                return true;
            } else {
                //Otherwise return false
                return false;
            }
        } else {
            //Otherwise return false
            return false;
        }
    }

    /**
     * Given the tile's dropped location (x and y), determines where on the board the tile has been dropped and returns
     * the placement for the tile
     * @return an int array with array[0] being the x value and array[1] the y
     */
    //Authored by Harriet
    private int[] snapToGrid(double x, double y) {
        int[][] xValues = new int[7][2];
        int[][] yValues = new int[7][2];
        int[] finalLocation = {DIMENSIONS, DIMENSIONS};

        //Find all the x locations of the grid and add the to xValues
        for(int i = 0; i < 7; i++) {
            xValues[i][0] = i * DIMENSIONS + DIMENSIONS;
            xValues[i][1] = i * DIMENSIONS + 2 * DIMENSIONS;
        }

        //Find all the y locations of the grid and add the to yValues
        for(int i = 0; i < 7; i++) {
            yValues[i][0] = i * DIMENSIONS + DIMENSIONS;
            yValues[i][1] = i * DIMENSIONS + 2 * DIMENSIONS;
        }

        for(int i = 0; i < 7; i++) {
            //find which x location the tile is in and set it to finalLocation[0]
            if(x > xValues[i][0] && x < xValues[i][1]) {
                finalLocation[0] = i * DIMENSIONS + DIMENSIONS;
            }
            //find which y location the tile is in and set it to finalLocation[1]
            if(y > yValues[i][0] && y < yValues[i][1]) {
                finalLocation[1] = i * DIMENSIONS + DIMENSIONS;
            }
        }

        //Return final location
        return finalLocation;
    }

    /**
     * Draws the board - the board lines, lines that surround the tiles to be played and the exits.
     */
    //Authored by Harriet
    private void drawBoard() {
        //set up the locations for the special tiles
        for(int i = 0; i < 6; i++) {
            SPECIAL_LOCATIONS[i][0] = (i * 2 * (DIMENSIONS + 10)) + 10;
            SPECIAL_LOCATIONS[i][1] = 8 * DIMENSIONS + 2 * DIMENSIONS / 3;
        }

        //Draw grid
        for(int k = 1; k < 9; k++) {
            Line line1 = new Line();
            line1.setStartX(DIMENSIONS * k);
            line1.setStartY(DIMENSIONS);
            line1.setEndX(DIMENSIONS * k);
            line1.setEndY(DIMENSIONS * 8);

            board.getChildren().add(line1);

            Line line2 = new Line();
            line2.setStartX(DIMENSIONS);
            line2.setStartY(DIMENSIONS * k);
            line2.setEndX(DIMENSIONS * 8);
            line2.setEndY(DIMENSIONS * k);

            board.getChildren().add(line2);
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
            Image image = new Image(SinglePlayer.class.getResourceAsStream("assets/HighExit.png"));
            ImageView imageView = new ImageView(image);
            //Set the orientation of the highway tile
            imageView.setRotate(360.0 / 4 * (int)highwayExits[i][2]);
            //Set the height and width of the ImageView
            imageView.setFitHeight(DIMENSIONS);
            imageView.setFitWidth(DIMENSIONS);
            //Set the x and y of the ImageView
            imageView.setX(hx - DIMENSIONS);
            imageView.setY(hy);
            board.getChildren().add(imageView);

            //Do the same for the RailExit tiles
            int ry = ((railroadExits[i][0] - 'A')) * DIMENSIONS;
            int rx = (Character.getNumericValue(railroadExits[i][1])) * DIMENSIONS;

            Image image2 = new Image(SinglePlayer.class.getResourceAsStream("assets/RailExit.png"));
            ImageView imageView2 = new ImageView(image2);
            imageView2.setRotate(360.0 / 4 * (int)railroadExits[i][2]);
            imageView2.setFitHeight(DIMENSIONS);
            imageView2.setFitWidth(DIMENSIONS);
            imageView2.setX(rx - DIMENSIONS);
            imageView2.setY(ry);
            board.getChildren().add(imageView2);
        }

        int offset = -35;


        //Draws the boxes that surround the tiles to be played each round
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


        //Draws the boxes that surround the special tiles
        for(int k = 0; k < 6; k++) {
            Line line1 = new Line();
            line1.setStartX(SPECIAL_LOCATIONS[k][0]);
            line1.setStartY(SPECIAL_LOCATIONS[k][1]);
            line1.setEndX(SPECIAL_LOCATIONS[k][0] + DIMENSIONS);
            line1.setEndY(SPECIAL_LOCATIONS[k][1]);
            line1.setStroke(Color.RED);
            root.getChildren().add(line1);

            Line line2 = new Line();
            line2.setStartX(SPECIAL_LOCATIONS[k][0]);
            line2.setStartY(SPECIAL_LOCATIONS[k][1] + DIMENSIONS);
            line2.setEndX(SPECIAL_LOCATIONS[k][0] + DIMENSIONS);
            line2.setEndY(SPECIAL_LOCATIONS[k][1] + DIMENSIONS);
            line2.setStroke(Color.RED);
            root.getChildren().add(line2);

            Line line3 = new Line();
            line3.setStartX(SPECIAL_LOCATIONS[k][0]);
            line3.setStartY(SPECIAL_LOCATIONS[k][1]);
            line3.setEndX(SPECIAL_LOCATIONS[k][0]);
            line3.setEndY(SPECIAL_LOCATIONS[k][1] + DIMENSIONS);
            line3.setStroke(Color.RED);
            root.getChildren().add(line3);

            Line line4 = new Line();
            line4.setStartX(SPECIAL_LOCATIONS[k][0] + DIMENSIONS);
            line4.setStartY(SPECIAL_LOCATIONS[k][1]);
            line4.setEndX(SPECIAL_LOCATIONS[k][0] + DIMENSIONS);
            line4.setEndY(SPECIAL_LOCATIONS[k][1] + DIMENSIONS);
            line4.setStroke(Color.RED);
            root.getChildren().add(line4);
        }
    }

    /**
     * Creates the special tiles at the start of the game
     */
    //Authored by Harriet
    private void drawSpecial() {
        //Creating a new tile ImageView
        s0 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S0.png")), DIMENSIONS, SPECIAL_LOCATIONS[0][0], SPECIAL_LOCATIONS[0][1], S0_FLIP, S0_ROTATION);
        //Set mouse events
        s0.setOnMousePressed(clickTile);
        s0.setOnMouseDragged(dragTile);
        s0.setOnMouseReleased(dropTileS0);
        //adds the tile to root
        root.getChildren().add(s0);

        s1 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S1.png")), DIMENSIONS, SPECIAL_LOCATIONS[1][0], SPECIAL_LOCATIONS[1][1], S1_FLIP, S1_ROTATION);
        s1.setOnMousePressed(clickTile);
        s1.setOnMouseDragged(dragTile);
        s1.setOnMouseReleased(dropTileS1);
        root.getChildren().add(s1);

        s2 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S2.png")), DIMENSIONS, SPECIAL_LOCATIONS[2][0], SPECIAL_LOCATIONS[2][1], S2_FLIP, S2_ROTATION);
        s2.setOnMousePressed(clickTile);
        s2.setOnMouseDragged(dragTile);
        s2.setOnMouseReleased(dropTileS2);
        root.getChildren().add(s2);

        s3 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S3.png")), DIMENSIONS, SPECIAL_LOCATIONS[3][0], SPECIAL_LOCATIONS[3][1], S3_FLIP, S3_ROTATION);
        s3.setOnMousePressed(clickTile);
        s3.setOnMouseDragged(dragTile);
        s3.setOnMouseReleased(dropTileS3);
        root.getChildren().add(s3);

        s4 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S4.png")), DIMENSIONS, SPECIAL_LOCATIONS[4][0], SPECIAL_LOCATIONS[4][1], S4_FLIP, S4_ROTATION);
        s4.setOnMousePressed(clickTile);
        s4.setOnMouseDragged(dragTile);
        s4.setOnMouseReleased(dropTileS4);
        root.getChildren().add(s4);

        s5 = new TileImageView(new Image(SinglePlayer.class.getResourceAsStream("assets/S5.png")), DIMENSIONS, SPECIAL_LOCATIONS[5][0], SPECIAL_LOCATIONS[5][1], S5_FLIP, S5_ROTATION);
        s5.setOnMousePressed(clickTile);
        s5.setOnMouseDragged(dragTile);
        s5.setOnMouseReleased(dropTileS5);
        root.getChildren().add(s5);
    }

    /**
     * Will display the final score at the end of the game - text object from
     * https://www.tutorialspoint.com/javafx/javafx_text.htm
     */
    //Code from https://www.tutorialspoint.com/javafx/javafx_text.htm, edits by Harriet
    private void endGame() {
        String boardString = RailroadInk.boardListToBoardString(tiles);
        int score = RailroadInk.getAdvancedScore(boardString);

        //Creating a Text object
        Text text = new Text();
        //Setting font to the text
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
        //setting the position of the text
        text.setX(9*DIMENSIONS - 10);
        text.setY(130);
        //Setting the color
        text.setFill(Color.BROWN);
        //Setting the Stroke
        text.setStrokeWidth(2);
        // Setting the stroke color
        text.setStroke(Color.BLUE);
        //Setting the text to be added.
        text.setText("Game Over." + '\n' + '\n' +  "You scored: " + Integer.toString(score));
        root.getChildren().add(text);


        //create a new button for the main menu
        Button menu = new Button("Main Menu");
        menu.setOnAction(e -> {
            //start an instance of the main menu stage when clicked
            Game ctc = new Game();
            ctc.start(Game.classStage);
            //close this stage
            classStage.close();
        });
        //set the x and y of the button and add to root
        menu.setLayoutX(9*DIMENSIONS - 10);
        menu.setLayoutY(4*DIMENSIONS);
        root.getChildren().add(menu);

        //create a new button for exiting the game
        Button exit = new Button("Exit");
        exit.setOnAction(e -> {
            //close the stage when clicked
            classStage.close();
        });
        //set the x and y of the button and add to root
        exit.setLayoutX(9*DIMENSIONS - 10);
        exit.setLayoutY(4*DIMENSIONS + DIMENSIONS/2);
        root.getChildren().add(exit);

    }

    @Override
    public void start(Stage primaryStage) {
        classStage = primaryStage ;

        primaryStage.setTitle("Railroad Ink");
        Scene play = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        drawBoard();
        makeControls();
        drawSpecial();

        //add the controls to the root
        root.getChildren().add(controls);
        root.getChildren().add(board);

        primaryStage.setScene(play);
        primaryStage.show();
    }
}