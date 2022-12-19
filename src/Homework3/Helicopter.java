package Homework3;

public class Helicopter {
    private HelicopterModel model;
    private int creationYear;
    private HelicopterStatus status;
    private int crew;
    private Coordinates coordinates;

    Helicopter() {

    }

    Helicopter(HelicopterModel model, int creationYear, HelicopterStatus status, int crew) {
        this.model = model;
        this.creationYear = creationYear;
        this.status = status;
        this.crew = crew;
        this.coordinates = new Coordinates();
    }

    Helicopter(HelicopterModel model, int creationYear, HelicopterStatus status, int crew, Coordinates coordinates) {
        this.model = model;
        this.creationYear = creationYear;
        this.status = status;
        this.crew = crew;
        this.coordinates = new Coordinates(coordinates);
    }

    Helicopter(Helicopter helicopter) {
        this.model = helicopter.model;
        this.creationYear = helicopter.creationYear;
        this.status = helicopter.status;
        this.crew = helicopter.crew;
        this.coordinates = new Coordinates(helicopter.coordinates);
    }

    public void setModel(HelicopterModel model) {
        this.model = model;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setStatus(HelicopterStatus status) {
        this.status = status;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public void setCoordinates(int x, int y, int z) {
        this.coordinates.setX(x);
        this.coordinates.setY(y);
        this.coordinates.setZ(z);
    }

    public void setCoordinates(Coordinates coordinates) {
        this.setCoordinates(coordinates.getX(), coordinates.getY(), coordinates.getZ());
    }

    public HelicopterModel getModel() {
        return model;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public HelicopterStatus getStatus() {
        return status;
    }

    public int getCrew() {
        return crew;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void moveUp() {
        this.coordinates.setZ(this.coordinates.getZ() + 1);
    }

    public void moveUp(int n) {
        if(n < 0){
            throw new RuntimeException("Can't move up with negative n: " + n );
        }
        this.coordinates.setZ(this.coordinates.getZ() + n);
    }

    public void moveDown() {
        this.coordinates.setZ(this.coordinates.getZ() - 1);
    }

    public void moveDown(int n) {
        if(n < 0){
            throw new RuntimeException("Can't move down with negative n: " + n );
        }
        this.coordinates.setZ(this.coordinates.getZ() - n);
    }

    public void moveRight() {
        this.coordinates.setY(this.coordinates.getY() + 1);
    }

    public void moveRight(int n) {
        if(n < 0){
            throw new RuntimeException("Can't move right with negative n: " + n );
        }
        this.coordinates.setZ(this.coordinates.getY() + n);
    }

    public void moveLeft() {
        this.coordinates.setY(this.coordinates.getY() - 1);
    }

    public void moveLeft(int n) {
        if(n < 0){
            throw new RuntimeException("Can't move left with negative n: " + n );
        }
        this.coordinates.setZ(this.coordinates.getY() - n);
    }

    public void moveAhead() {
        this.coordinates.setX(this.coordinates.getX() + 1);
    }

    public void moveAhead(int n) {
        if(n < 0){
            throw new RuntimeException("Can't move ahead with negative n: " + n );
        }
        this.coordinates.setX(this.coordinates.getX() + n);
    }

    public void moveBack() {
        this.coordinates.setX(this.coordinates.getX() - 1);
    }

    public void moveBack(int n) {
        if(n < 0){
            throw new RuntimeException("Can't move back with negative n: " + n );
        }
        this.coordinates.setX(this.coordinates.getX() - n);
    }
}
