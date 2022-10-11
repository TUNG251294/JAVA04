public class QuadraticEquation {
    //  private phương thức hoặc biến chỉ truy cập được trong lớp nó được khai báo
    public double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }
    double delta; double r1; double r2;
    public double getDelta() {
        return delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    public double getRoot1() {
        return r1 = (-this.b - Math.pow(delta, 0.5)) / (2 * this.a);
    }
    public double getRoot2() {
        return r2 = (-this.b + Math.pow(delta, 0.5)) / (2 * this.a);
    }
}
