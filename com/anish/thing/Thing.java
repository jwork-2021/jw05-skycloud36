package com.anish.thing;

import com.anish.maze.World;

import java.awt.Color;

public class Thing {
    protected World world;

    public Tile<? extends Thing> tile;

    public int getX() {
        return this.tile.getxPos();
    }

    public int getY() {
        return this.tile.getyPos();
    }

    public void setxPos(int xPos){
        this.tile.setxPos(xPos);
    }

    
    public void setyPos(int yPos){
        this.tile.setyPos(yPos);
    }

    public void setTile(Tile<? extends Thing> tile) {
        this.tile = tile;
    }

    Thing(Color color, char glyph, World world) {
        this.color = color;
        this.glyph = glyph;
        this.world = world;
    }

    private final Color color;

    public Color getColor() {
        return this.color;
    }

    private char glyph;

    public char getGlyph() {
        return this.glyph;
    }

    // private Thing oldThing;

    // public Thing getOldThing(){
    //     return oldThing;
    // }

    // public void setOldThing(Thing thing){
    //     oldThing = thing;
    // }
}
