public class MatrixTest {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        double[][] d0 = new double[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                d0[i][j] = 0;
            }
        }
        double[][] d1 = new double[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                d1[i][j] = 0;
            }
        }
        Matrix a = new Matrix(n, m, d0);
        Matrix b = new Matrix(n, m, d1);
        for(int i = 0; i < Math.min(n, m); ++i){
            a.setValue(i, i, 1);
        }
        for(int i = 0; i < Math.min(n, m); ++i){
            b.setValue(i, Math.min(n, m)-i-1, 1);
        }

        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println();
        double[][] d2 = new double[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                d2[i][j] = 0;
            }
        }
        Matrix c = new Matrix(n, m, d2);
        c.add(a);
        c.add(b);
        System.out.println(c);
        System.out.println();
        c.mult(5);
        System.out.println(c);
        System.out.println();
        c.mult(c);
        System.out.println(c);
        double[][] d3 = new double[n+1][m+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                d3[i][j] = 0;
            }
        }
        Matrix d = new Matrix(n, m, d3);
        d = new Matrix(n+1, m+1, d3);
        a.add(d);
        b.mult(d);
    }
}
