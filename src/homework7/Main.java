package homework7;

/* Определить класс Треугольник на плоскости. Вычислить площадь и периметр
треугольника. Создать массив объектов и подсчитать количество треугольников
разного типа (равносторонний, равнобедренный, прямоугольный, произвольный).
Определить для каждой группы наибольший и наименьший по площади и периметру объект.
Треугольник задается точками, которые тоже должны быть классами.
Точка задается двумя координатами(x,y) */

public class Main {
    public static void main(String[] args) {

        Triangle rightTriangle = new Triangle(new Point(0, 0), new Point(3, 3), new Point(3, 0));
        Triangle isoscelesTriangle = new Triangle(new Point(0, 2), new Point(2, 1), new Point(1, 4));
        Triangle equilateralTriangle = new Triangle(new Point(0, 0), new Point(7, 5), new Point(3, 10));
        Triangle simpleTriangle = new Triangle(new Point(1, 0), new Point(5, 5), new Point(7, 5));

        Triangle[] triangles = new Triangle[]{rightTriangle, isoscelesTriangle, equilateralTriangle, simpleTriangle};

        TriangleProcessor.allocation(triangles);
        TriangleProcessor.printGroups();
    }

}



