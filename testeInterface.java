package Encapsulamento;

public class testeInterface {
	public static void main (String args[])
	{
		participanteForum participante = new participanteForum();
		Leitor leitor = participante;
		System.out.println("O participante está lendo: "+leitor.lendo());
		Programador programador = participante;
		String java= "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println("E programando:" + programador.digitando());
	}

}
