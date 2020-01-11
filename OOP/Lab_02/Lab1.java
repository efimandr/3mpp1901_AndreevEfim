import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] Point1_Coordinates, Point2_Coordinates, Point3_Coordinates;
        double x, y, z, area;

        System.out.println("Введите координаты точек через запятую, в виде X,Y,Z");
        System.out.println("Введите координаты первой точки");
        Point1_Coordinates = in.nextLine().split(",");
        x = Double.parseDouble(Point1_Coordinates[0]);
        y = Double.parseDouble(Point1_Coordinates[1]);
        z = Double.parseDouble(Point1_Coordinates[2]);
        Point3d point_1 = new Point3d(x, y, z);             //Создаем объект с первой точкой

        System.out.println("Введите координаты второй точки");
        Point2_Coordinates = in.nextLine().split(",");
        x = Double.parseDouble(Point2_Coordinates[0]);
        y = Double.parseDouble(Point2_Coordinates[1]);
        z = Double.parseDouble(Point2_Coordinates[2]);
        Point3d point_2 = new Point3d(x, y, z);             //Создаем объект со второй точкой

        System.out.println("Введите координаты третьей точки");
        Point3_Coordinates = in.nextLine().split(",");
        x = Double.parseDouble(Point3_Coordinates[0]);
        y = Double.parseDouble(Point3_Coordinates[1]);
        z = Double.parseDouble(Point3_Coordinates[2]);
        Point3d point_3 = new Point3d(x, y, z);             //Создаем объект с третьей точкой

        in.close();

        if(point_1.compareTo(point_2) || point_1.compareTo(point_3) || point_2.compareTo(point_3)) {
            System.out.println("Точки совпадают, вычисление площади невозможно");
        } else {
            area = computeArea(point_1, point_2, point_3);  //Вычисляем площадь треугольника
            System.out.println("Площадь треугольника составляет " + area);
        }
    }

    public static double computeArea(Point3d point_1, Point3d point_2, Point3d point_3) {   //метод рассчета площади
        double a, b, c, p, area;

        a = point_1.distanceTo(point_2);
        b = point_1.distanceTo(point_3);
        c = point_2.distanceTo(point_3);

        p = (a + b + c) / 2;

        area = Math.sqrt(p*(p - a)*(p - b)*(p - c));

        return Math.round(area * 100) / 100.0;
    }
}