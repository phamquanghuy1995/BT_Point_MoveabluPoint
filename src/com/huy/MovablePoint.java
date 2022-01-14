package com.huy;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public  MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }
    public float[]getSpeed(){
        float[]speed={getxSpeed(),getySpeed()};
        return speed;
    }

    @Override
    public String toString() {
        return super.toString()+",speed=("+this.getSpeed()[0]+","+getSpeed()[1]+")";
    }

    public String move() {
        float x = super.getX() + xSpeed;
        float y = super.getY() + ySpeed;
        super.setXY(x,y);
        return toString();
    }
}
