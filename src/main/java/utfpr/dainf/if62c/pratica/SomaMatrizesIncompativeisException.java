package utfpr.dainf.if62c.pratica;

public class SomaMatrizesIncompativeisException extends MatrizesIncompativeisException{

    private final Matriz matrizA;
    private final Matriz matrizB;
    
    public SomaMatrizesIncompativeisException(Matriz matrizA, Matriz matrizB) {
        super(matrizA, matrizB, String.format("Matrizes de %dx%d e %dx%d não podem ser somadas",
                matrizA.getMatriz().length,matrizA.getMatriz()[0].length,matrizB.getMatriz().length,matrizB.getMatriz()[0].length));
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }
    
}
