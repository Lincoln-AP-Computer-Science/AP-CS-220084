public class Shape3DRunner {

    public static void main(String[] args) {
        Shape3D[] shapes = new Shape3D[3];
        shapes[0] = new RectangularPrism(2, 2, 2);
        shapes[1] = new Sphere(2);
        shapes[2] = new Cylinder(2, 2);
        
        for (Shape3D s3d : shapes) {
            System.out.print("Surface Area: " + s3d.getSurfaceArea() + "; ");
            System.out.println("Volume: " + s3d.getVolume());
        }
    }
}