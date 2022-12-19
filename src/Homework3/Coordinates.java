package Homework3;

class Coordinates {
    private int x;
    private int y;
    private int z;

    Coordinates(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    Coordinates(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Coordinates(Coordinates coordinates){
        this.x = coordinates.x;
        this.y = coordinates.y;
        this.z = coordinates.z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
