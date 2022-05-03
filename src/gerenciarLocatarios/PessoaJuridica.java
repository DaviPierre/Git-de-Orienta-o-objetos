package gerenciarLocatarios;

import java.util.Scanner;
import java.util.ArrayList;

import app.CNPJ; //Importando a classe CNPJ de outro pacote, para poder apontar corretamente e utilizar de seu método.
 
public class PessoaJuridica extends Locatario {
	Scanner sc = new Scanner(System.in); 
	
	int numeroFuncionarios, telefone; //O número total de funcionários que a empresa vai ter.
	String nomeSocial, email, cnpj;

	public ArrayList<PessoaFisica> listaFuncionarios;

	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nomeSocial, String email, String cnpj, String telefone, int numeroFuncionarios){
		setNomeSocial(nomeSocial);
		setEmail(email);
		setCnpj(cnpj);
		setTelefone(telefone);
		setNumeroFuncionarios(numeroFuncionarios);
		this.listaFuncionarios = new ArrayList<>(numeroFuncionarios);
	}

	public void insereFuncionario(PessoaFisica novoFuncionario) {
		this.listaFuncionarios.add(novoFuncionario);
	}

	public String getNomeSocial() {
		// System.out.println(nomeSocial);
		return nomeSocial;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getCnpj() {
		// System.out.println(cnpj);
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getNumeroFuncionarios() {
		// System.out.println(numeroFuncionarios);
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public void listarPessoaJuridica() {
		System.out.println("Nome Social: " + getNomeSocial());
		System.out.println("Email: " + getEmail());
		System.out.println("CNPJ: " + getCnpj());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Número de Funcionários: " + getNumeroFuncionarios());
	}

	public void listaFuncionarios(){
		System.out.println("Lista de Funcionários: ");
		for(PessoaFisica funcionarios:listaFuncionarios){
			funcionarios.listarPessoaFisica();
		}
	}

	public String getListaFuncionarios(int i){
		return listaFuncionarios.get(i).getNomeCompleto();
	}

}   

