public class Point2d{
    private double xCoord;                  //координата Х приват
    private double yCoord;                  //координата У приват
    public Point2d(double x, double y) {    //Конструктор инициализации
        xCoord = x;
        yCoord = y;
    }
    public Point2d() {                      //Конструктор по умолчанию.
        this(0, 0);
    }
    public double getX() {                  //Возвращение координаты X
        return xCoord;
    }
    public double getY() {                   //Возвращение координаты У
        return yCoord;
    }
    public void setX(double val) {          //Установка значения координаты X
        xCoord = val;
    }
    public void setY(double val) {          //Установка значения координаты Y
        yCoord = val;
    }
    public boolean compareTo(Point2d p) {      //Метод для сравнения
        if((p.getX() == this.getX()) & (p.getY() == this.getY()))
            return true;
        else
            return false;
    }
}