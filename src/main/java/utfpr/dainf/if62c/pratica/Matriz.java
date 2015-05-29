package utfpr.dainf.if62c.pratica;

public class Matriz {
    
    private final double[][] mat;

    public Matriz(int m, int n) throws MatrizInvalidaException{
        if (m<= 0 || n<=0){
            throw new MatrizInvalidaException(m, n);
        }
        mat = new double[m][n];
        
    }

    public double[][] getMatriz() {
        return mat;
    }
    

    public Matriz getTransposta() throws MatrizInvalidaException {
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }
    

    public Matriz soma(Matriz m) throws SomaMatrizesIncompativeisException, MatrizInvalidaException{
        
        if (m.mat.length != mat.length || m.mat[0].length != mat[0].length){
            throw (new SomaMatrizesIncompativeisException(this,m));
        }
        
        Matriz ms = new Matriz(mat.length, mat[0].length);
        for (int i = 0; i < this.mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                ms.mat[i][j] = mat[i][j] + m.mat[i][j];
            }
        }
        return ms;
    }


    public Matriz prod(Matriz m) throws MatrizInvalidaException, ProdMatrizesIncompativeisException {           
        if (m.mat.length != mat[0].length || m.mat[0].length != mat.length){
            throw (new ProdMatrizesIncompativeisException(this,m));
        }
        
        Matriz mp = new Matriz(mat.length, m.mat[0].length); 
        for (int i = 0; i < this.mat.length; i++) {
            for (int j = 0; j < m.mat[0].length; j++) {
                for (int k = 0; k < m.mat.length; k++) {
                    mp.mat[i][j] += mat[i][k] * m.mat[k][j];
                }
            }
        }
        return mp;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: mat) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" ");
            }
            s.append("]");
        }
        return s.toString();
    }
    
}
