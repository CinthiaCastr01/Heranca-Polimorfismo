package Encapsulamento;

public class testandoFuncionario {
	public static void main (String args[])
	{
		Funcionario func = new Funcionario();
		func.setNome("Leticia");
		func.setSalario(2500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}

}
