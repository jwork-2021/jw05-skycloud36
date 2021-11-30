package com.anish.thing;

import com.anish.maze.World;

import java.awt.Color;

public class Player extends Creature{
    public Player(Color color, char glyph, World world, int xPos, int yPos) {
        super(color, glyph, world, xPos, yPos);
        auto = false;
        answerloc = 0;
    }

    public Boolean moveBy(int xPos, int yPos) {
        int x = this.getX()+xPos;
        int y = this.getY()+yPos;
        if(!(this.getWorld().get(x, y) instanceof Wall)){
            this.moveTo(x, y);
        }
        return false;
    }

    public Boolean moveUp(){
        // this.world.put(new Up(this.world), this.getX(), this.getY());
        return this.moveBy(0, -1);
    }

    public Boolean moveDown(){
        // this.world.put(new Down(this.world), this.getX(), this.getY());
        return this.moveBy(0, 1);
    }

    public Boolean moveRight(){
        // this.world.put(new Right(this.world), this.getX(), this.getY());
        return this.moveBy(1, 0);
    }

    public Boolean moveLeft(){
        // this.world.put(new Left(this.world), this.getX(), this.getY());
        return this.moveBy(-1, 0);
    }

    String answer;
    int answerloc;
    public Boolean auto;


    public Boolean moveAuto(){
        if(auto == true && answerloc < answer.length()){
            switch(answer.charAt(answerloc++)){
                case 'A':return this.moveLeft();
                case 'D':return this.moveRight();
                case 'W':return this.moveUp();
                case 'S':return this.moveDown();
            }
        }
        else{
            auto = true;
            answerloc = 0;
            return this.moveAuto();
        }
        return false;
    }
}
