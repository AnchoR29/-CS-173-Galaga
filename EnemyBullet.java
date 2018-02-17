import java.util.Vector;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.net.*;

public class EnemyBullet extends Sprites
{
    //********************************************************************
    //  Constructor - Assigns Variables as needed and starts the massive
    //    for-loops that initialize the image
    //********************************************************************
    public EnemyBullet(int x, int y, BufferedImage image)
    {
        // Assigns position of upper-left corner
        this.x = x;
        this.y = y;
        this.image = image;

        // Creates dimension
        this.d = new Dimension(9, 24);
    }

    public void drawEnemyBullets(Graphics g){
        g.drawImage(this.image, x, y, null);
        setBounds(this.x,this.y,9,24);
    }

    public int getScore()
    {
        return 0;
    }
}
