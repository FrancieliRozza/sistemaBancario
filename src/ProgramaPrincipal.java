import java.util.Scanner;
import java.util.Vector;


public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String novoCadastro ="";
		Vector<ContaCorrente> cadastros = new Vector<ContaCorrente>();
		System.out.println("Inicio do Programa");
		
		do{
			System.out.println("Digite seu nome:");
			String nome = entrada.nextLine();
			System.out.println("Digite o n�mero da conta:");
			String conta = entrada.nextLine();
			System.out.println("Digite o n�mero da agencia:");
			String agencia = entrada.nextLine();
			System.out.println("Valor inicial do saldo em n�mero:");
			String saldo = entrada.nextLine();
			
			ContaCorrente contaCliente = new ContaCorrente(); //criei uma vari�vel e instanciei (Instanciar � criar um objeto)
			contaCliente.nome = new String(nome);
			contaCliente.numeroDaConta = new String(conta);
			contaCliente.numeroDaAgencia = new String(agencia);
			contaCliente.saldo = new Double (Double.parseDouble(saldo)); // double esta certo?
			
			cadastros.add(contaCliente);

			System.out.println("Deseja efetuar um novo cadastro? Digite (1)Sim (2)N�o:");
			novoCadastro = entrada.nextLine();
			
		} while("1".equals(novoCadastro));
		
		System.out.println("Deseja visualizar os cadastros? Digite (1)Sim (2)N�o:");
		String respVisualizarCadastro = entrada.nextLine();
		
		if("1".equals(respVisualizarCadastro)){
			
			for(int i = 0; i < cadastros.size(); i++){ // size � um m�todo que significa tamanho (faz a mesma coisa que o length)

				System.out.println("Nome: " + cadastros.get(i).nome); // get � um m�todo que significa pegar (nesse caso foi utilizado para buscar os valores do vector )
				System.out.println("N�mero da conta: " + cadastros.get(i).numeroDaConta);
				System.out.println("N�mero da ag�ncia: " + cadastros.get(i).numeroDaAgencia);
				System.out.println("Saldo: " + cadastros.get(i).saldo + "\n");
				
			}
			
		} else {
			System.out.println("Fim do programa");
		}
	}
}
		
		