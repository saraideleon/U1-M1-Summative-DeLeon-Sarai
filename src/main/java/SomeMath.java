public class SomeMath {

    public static void main(String[] args) {
        int num1 = total5(1, 2, 3, 4, 5);
        double num2 = average5(1, 3, 5, 7, 9);
        double num3 = largest5(42.0, 35.1, 2.3, 40.2, 15.6);
    }

    //method total5
    public static int total5(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;
        System.out.println(sum);
        return sum;
    }
    //method average5
    public static double average5(double f, double g, double h, double i, double j) {
        double average = ((f + g + h + i + j) / 5);
        System.out.println(average);
        return average;
    }
    //method largest5
    public static double largest5(double k, double l, double m, double n, double o){
        double largest5 = k;
            if(l > largest5)
                largest5 = l;
            if(m > largest5)
                largest5 = m;
            if(n > largest5)
                largest5 = n;
            if (o > largest5)
                largest5 = o;
            System.out.println(largest5);
            return largest5;
            }
        }