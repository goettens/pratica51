
package utfpr.dainf.if62c.pratica;

public class MatrizesIncompativeisException extends Exception{
    private final Matriz matrizA;
    private final Matriz matrizB;        

    public MatrizesIncompativeisException(Matriz matrizA, Matriz matrizB) {
        super(String.format("Matrizes de %dx%d e %dx%d incompatíveis para a operação",
            matrizA.getMatriz().length, matrizA.getMatriz()[0].length,
            matrizB.getMatriz().length, matrizB.getMatriz()[0].length));
        this.matrizA = matrizA;
        this.matrizB = matrizB;    
    }

    public MatrizesIncompativeisException(Matriz matrizA, Matriz matrizB, String mensagem) {
        super(mensagem);
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }
    

    public Matriz getMatrizA() {
        return matrizA;
    }

    public Matriz getMatrizB() {
        return matrizB;
    }
    
}
