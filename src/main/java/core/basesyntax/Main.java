package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int N = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[N];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
