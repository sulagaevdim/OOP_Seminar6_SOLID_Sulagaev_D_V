package srp1.figure;

public class SquarePainter implements Paintable<Square>{

    public void draw(Square shape) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < shape.getSide(); i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < shape.getSide(); i++) {
            if (i < shape.getSide() - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < shape.getSide() - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
