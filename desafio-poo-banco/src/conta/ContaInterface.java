package conta;

public interface ContaInterface {
	
	// A classe abstrata solicita a impementação de algo que ela não pode fazer; delega a responsabilidade, mas passa as instruções. 
	// Não precisa do public pois todos os métodos já são publicos 
	void sacar(double valor);
	void depositar(double valor);
	
	// Pode receber tanto conta corrente quanto conta poupança. É um tipo de polimorfismo. 
	void transferir(double valor, Conta contaDestino);
	void imprimirExtrato();
}
