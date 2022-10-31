public class ShapeMaker {
    private Shape greencircle;
    private Shape redcircle;

    public ShapeMaker() {
        greencircle = new GreenCircle();
        redcircle = new RedCircle();

    }

    public void drawGreenCircle() {
        greencircle.draw();
    }
    public void drawRedCircle() {
        redcircle.draw();
    }
}