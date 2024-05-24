public class Matrix {
    double[][] elems;
    int n;
    int m;
    public Matrix(int n, int m, double[][] elems){
        if(n <= 0 || n != elems.length || m <= 0 || m != elems[0].length){
            System.out.println("Неправильнные параметры матрицы");
        }else {
            this.elems = elems;
            this.n = n;
            this.m = m;
        }
    }
    public void setValue(int i, int j, double val){
        if(i >= this.n || j >= this.m){
            System.out.println("Выход за границы матрицы");
        }else{
            this.elems[i][j] = val;
        }
    }
    public void add(Matrix mx){
        if(this.n != mx.n || this.m != mx.m){
            System.out.println("Матрицы нельзя сложить");
        }else {
            for(int i = 0; i < this.n; i++){
                for (int j = 0; j < this.m; j++){
                    this.elems[i][j] += mx.elems[i][j];
                }
            }
        }
    }
    public void mult(double k){
        for(int i = 0; i < this.n; i++){
            for (int j = 0; j < this.m; j++){
                this.elems[i][j] *= k;
            }
        }
    }
    public String toString(){
        String s = "Матрица размером " + this.n + "х" + this.m + "\n";
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                s += this.elems[i][j] + " ";
            }
            if(i+1 < this.n){
                s += "\n";
            }
        }
        return s;
    }
    public void mult(Matrix mx){
        if(this.m != mx.n){
            System.out.println("Матрицы нельзя перемножить");
        }else {
            Matrix res = new Matrix(this.n, mx.m, new double[this.n][mx.m]);
            for (int i = 0; i < this.n; i++) {
                for (int j = 0; j < mx.m; j++) {
                    res.elems[i][j] = 0;
                    for (int k = 0; k < this.m; k++) {
                        res.elems[i][j] += this.elems[i][k] * mx.elems[k][j];
                    }
                }
            }
            this.n = res.n;
            this.m = res.m;
            this.elems = res.elems;
        }
    }
}