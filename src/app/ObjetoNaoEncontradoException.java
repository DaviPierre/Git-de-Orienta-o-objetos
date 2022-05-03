package app;

import java.util.Scanner;

public class ObjetoNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private boolean find;

	Scanner sc = new Scanner(System.in);

	public ObjetoNaoEncontradoException(boolean teste) {
     this.find = teste;
    }

	public ObjetoNaoEncontradoException(String message) {
        super(message);
    }
 
    public ObjetoNaoEncontradoException(Throwable t) {
        super(t);
    } 
    
	 public int verificandoObjetoNaoEncontrado(boolean achou) throws ObjetoNaoEncontradoException {
		  int exception;
		  
		  this.find = achou;
		  
		  if (this.find == false) {
		      exception = 1;
			  throw new ObjetoNaoEncontradoException("O campo pesquisado não foi encontrado.\n");        
	        }else{
	         exception = 0;
	        }
		  	// System.out.println(" find = " + this.find);  
		  return exception;
	    }

}
