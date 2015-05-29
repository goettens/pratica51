package utfpr.dainf.if62c.pratica;

public class ProdMatrizesIncompativeisException extends MatrizesIncompativeisException {

    Matriz matrizA;
    Matriz matrizB;
    
    public ProdMatrizesIncompativeisException(Matriz matrizA, Matriz matrizB) {
        super(matrizA, matrizB, String.format("Matrizes de %dx%d e %dx%d não podem ser multiplicadas",
                matrizA.getMatriz().length,matrizA.getMatriz()[0].length,matrizB.getMatriz().length,matrizB.getMatriz()[0].length));
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }
}
