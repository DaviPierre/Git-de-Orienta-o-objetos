/**
 * 
 */
package gerenciarFrotas;

import java.util.Scanner;

public class ValoresAluguel {
	
	float diariaN, diariaR, diariaE, valorMensal;
	
    Scanner sc = new Scanner(System.in);

    public float setDiariaN(){
        float diariaN = sc.nextFloat();
        return diariaN;
    }

    public float setDiariaR(){
        float diariaR = sc.nextFloat();
        return diariaR;
    }

    public float setDiariaE(){
        float diariaE = sc.nextFloat();
        return diariaE;
    }
    public float setValorMensal(){
        float valorMensal = sc.nextFloat();
        return valorMensal;
    }

}