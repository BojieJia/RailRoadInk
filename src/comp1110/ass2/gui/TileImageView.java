package comp1110.ass2.gui;

import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

//Authored by Harriet
public class TileImageView extends ImageView{
    public Image image;
    public int dimensions;
    public double x;
    public double y;
    public int flip;
    public int rotate;

    TileImageView(Image image, int dimensions, double x, double y, int flip, int rotate) {
        this.image = image;
        this.dimensions = dimensions;
        this.x = x;
        this.y = y;
        this.flip = flip;
        this.rotate = rotate;

        this.setImage(image);
        this.setX(x);
        this.setY(y);
        this.setFitHeight(dimensions);
        this.setFitWidth(dimensions);
        this.setScaleX(flip);
        this.setRotate((360/4) * rotate);
        this.setCursor(Cursor.HAND);
    }


    /*public ImageView setProperties(TileImageView tile) {
        ImageView iv = new ImageView(tile.image);
        iv.setFitHeight(this.dimensions);
        iv.setFitHeight(this.dimensions);
        iv.setX(this.x);
        iv.setY(this.y);
        iv.setScaleX(this.flip);
        iv.setRotate(this.rotate);
        iv.setCursor(Cursor.HAND);

        return iv;
    }*/

}
