
package utfpr.dainf.if62c.pratica;

public class MatrizInvalidaException extends Exception {
    
    private final int num_linhas;
    private final int num_colunas;

    public MatrizInvalidaException(int l,int c){
        super(String.format("Matrizes de %dx%d não pode ser criada",l,c));
        this.num_colunas = c;
        this.num_linhas = l;
    }
        
    public int getNumLinhas() {
        return num_linhas;
    }

    public int getNumColunas() {
        return num_colunas;
    }
    
    
    
}
