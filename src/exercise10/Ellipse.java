package exercise10;

public class Ellipse extends Figure {
    public Ellipse() {
        super(new Point(0, 0), 1, 1);
    }

    public Ellipse(Point startPoint, double side2, double side1) {
        super(startPoint, side2, side1);
    }

    public Ellipse(Ellipse otherEllipse) {
        super(otherEllipse.startPoint, otherEllipse.side2, otherEllipse.side1);
    } 

    @Override
    public double calculatePerimeter() {
        return Math.PI * (3.0 * (side2 + side1) - Math.sqrt((3.0 * side2 + side1) * (side2 + 3.0 * side1)));
    }

    @Override
    public double calculateArea() {
        return Math.PI * side2 * side1;
    }
    
    @Override
    public String getType() {
         return (side2 == side1) ? "Circle" : "Ellipse";
    }

    @Override
    public boolean equal(Figure otherFigure) {
        if (otherFigure instanceof Ellipse) {
            return super.equal(otherFigure);
        } else {
            return false;
        }
    }

    public boolean containsClick(Point click) {
        // Check if click point is inside the rectangle
        return false;
    }
}
