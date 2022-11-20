public class DivisionArrays {
    double[] a;
    double[] b;

    public DivisionArrays(int a1, double[] j, int b1, double[] k) {
        a = new double[a1];
        for (int i = 0; i < a1; i++) {
            a[i] = j[i];
        }

        b = new double[b1];
        for (int i = 0; i < b1; i++) {
            b[i] = k[i];
        }
    }
        double[] division (){
            double[] c;
            int c1;

            if (a.length > b.length)
                c1 = a.length;
            else c1 = b.length;


            c = new double[c1];

            for (int i = 0; i < c1; i++) {
                try {
                    if (b[i] == 0.0)
                        throw new ArithmeticException();
                    c[i] = a[i] / b[i];
                } catch (ArithmeticException e) {
                    c[i] = 0;
                } catch (ArrayIndexOutOfBoundsException e) {
                    c[i] = 1;
                }
            }
            return c;
        }
    }
