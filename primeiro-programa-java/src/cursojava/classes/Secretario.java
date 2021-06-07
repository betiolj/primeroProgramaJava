package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{

	private String registro;
	private String nivelCargo;
	private String experiecnia;
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiecnia() {
		return experiecnia;
	}
	public void setExperiecnia(String experiecnia) {
		this.experiecnia = experiecnia;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiecnia=" + experiecnia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	@Override
	public double salario() {
		return 1800.00 * 0.9;
	}
	
	/*Esse é o metodo do contrato de autenticação*/
	@Override
	public boolean autenticar(String login, String senha) {
		return login.equals("admin") && senha.equals("admin");
	}	
	
}
