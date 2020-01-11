public class Point3d{
    private double xCoord;                          //координата Х приват
    private double yCoord;                          //координата Y приват
    private double zCoord;                          //координата Z приват

    // initialization
    public Point3d(double x, double y, double z) {  //Конструктор инициализации
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d() {                              //Конструктор по умолчанию
        this(0, 0, 0);
    }
    public double getX() {                          //Возвращение координаты X
        return xCoord;
    }
    public double getY() {                          //Возвращение координаты Y
        return yCoord;
    }
    public double getZ() {                          //Возвращение координаты Z
        return zCoord;
    }
    public void setX(double val) {                  //Установка значения координаты X
        xCoord = val;
    }
    public void setY(double val) {                  //Установка значения координаты Y
        yCoord = val;
    }
    public void setZ(double val) {                  //Установка значения координаты Z
        zCoord = val;
    }
    public boolean compareTo(Point3d p) {               //Метод для сравнения
        if((p.getX() == this.getX()) & (p.getY() == this.getY()) & (p.getZ() == this.getZ()))
            return true;
        else
            return false;
    }
    public double distanceTo(Point3d p) {               //Метод вычисления расстояния
        double distance = Math.sqrt(
                Math.pow(p.getX() - this.getX(),2) +
                        Math.pow(p.getY() - this.getY(),2) +
                        Math.pow(p.getZ() - this.getZ(),2));
        return Math.round(distance * 100) / 100.0;
    }
}