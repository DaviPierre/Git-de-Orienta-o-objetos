package app;

import java.util.Scanner;

public class CampoEmBrancoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	Scanner sc = new Scanner(System.in);

	public CampoEmBrancoException(String message) {
        super(message);
    }
 
    public CampoEmBrancoException(Throwable t) {
        super(t);
    } 
    
  public int verificandoCampoEmBranco(String nomeTeste) throws CampoEmBrancoException {
	  int exception;
	  
	  this.nome = nomeTeste;
	  
	  if (this.nome.length() < 2) {
	      exception = 1;
		  throw new CampoEmBrancoException("O nome deve ser maior do um carácter.\n");        
        }else{
         exception = 0;
        }
	  	  
	  return exception;
    }

}
