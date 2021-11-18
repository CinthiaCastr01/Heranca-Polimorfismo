package Encapsulamento;

public class TestePolimorfismo {
	public static void main (String args[])
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Mariana");
		fisica.setCpf(23445456435L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Juliano");
		juridica.setCnpj(12345678968L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa1 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
		}
	}

