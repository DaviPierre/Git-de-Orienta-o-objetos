package gerenciarFrotas;

import java.util.Scanner;

public class ValoresAluguel {
	
	float diariaN, diariaR, diariaE, valorMensal;
	
    Scanner sc = new Scanner(System.in);

    public void setDiariaN(float valoresDiarias){
        this.diariaN = valoresDiarias;
    }

    public void setDiariaR(float valoresDiarias){
        this.diariaR = valoresDiarias;
    }

    public void setDiariaE(float valoresDiarias){
        this.diariaE = valoresDiarias;
    }

    public void setValorMensal(float valoresMensais){
        this.valorMensal = valoresMensais;
    }

    public float getDiariaN(){
        return diariaN;
    }



    // public float setDiariaR(float valoresDiarias){
    //     System.out.println("-------------------------------------");
    //     System.out.println(" Por favor, digite o valor da diária reduzida.\n");
    //     float diariaR = sc.nextFloat();
    //     return diariaR;
    // }

    // public float setDiariaE(){
    //     System.out.println("-------------------------------------");
    //     System.out.println(" Por favor, digite o valor da diária empresarial.\n");
    //     float diariaE = sc.nextFloat();
    //     return diariaE;
    // }
    // public float setValorMensal(){
    //     System.out.println("-------------------------------------");
    //     System.out.println(" Por favor, digite o valor mensal.\n");
    //     float valorMensal = sc.nextFloat();
    //     return valorMensal;
    // }

}