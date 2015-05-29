import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args) {
        
        double carrega[][];
        Matriz matriz1;
        Matriz matriz2 = null;
        Matriz matriz3 = null;
        Matriz matriz4 = null;
        Matriz matriz5 = null;
        
        
        //testa criar uma matriz com valor menor que zero
        try{
            matriz1 = new Matriz(-1, 10);
        }catch(MatrizInvalidaException e){
            System.out.println(e.getLocalizedMessage());
        }
        
        try{
            matriz2 = new Matriz(1,2);
            carrega = matriz2.getMatriz();
            carrega[0][0] = 1;
            carrega[0][1] = 3;
            
            matriz3 = new Matriz(2,1);
            carrega = matriz3.getMatriz();
            carrega[0][0] = 3;
            carrega[1][0] = 4;
            
            matriz4 = new Matriz(2,2);
            carrega = matriz4.getMatriz();
            carrega[0][0] = 1;
            carrega[0][1] = 3;
            carrega[1][0] = 5;
            carrega[1][1] = 20;            
        }catch(MatrizInvalidaException e){
            System.out.println(e.getLocalizedMessage());
        }
        
        try{
            matriz5 = matriz2.prod(matriz4);    //MULTIPLICAÇÃO ERRADO
        }catch(ProdMatrizesIncompativeisException e){
            System.out.println(e.getLocalizedMessage());
        }catch (MatrizInvalidaException ex) {
            Logger.getLogger(Pratica51.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
            matriz5 = matriz2.prod(matriz3); // MULTIPLICAÇÃO CERTA
        }catch(ProdMatrizesIncompativeisException e){
            System.out.println(e.getLocalizedMessage());
        }catch (MatrizInvalidaException ex) {
            Logger.getLogger(Pratica51.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            matriz5 = matriz2.soma(matriz3); // SOMA ERRADA
        }catch(SomaMatrizesIncompativeisException e){
            System.out.println(e.getLocalizedMessage());
        }catch (MatrizInvalidaException ex) {
            Logger.getLogger(Pratica51.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            matriz5 = matriz4.soma(matriz4); // SOMA CERTA
        }catch(SomaMatrizesIncompativeisException e){
            System.out.println(e.getLocalizedMessage());
        }catch (MatrizInvalidaException ex) {
            Logger.getLogger(Pratica51.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
}
