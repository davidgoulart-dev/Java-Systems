package Iphone;

public class Iphone   {
public static void main(String[] args) {
	System.out.println("(Itunes)");
	
	ReprodutorMusical itunes = new ReprodutorMusical();
	itunes.tocar();
	itunes.pausar();
	itunes.selecionarMusica();
	System.out.println("(Iphone)");
	
	AparelhoTelefonico iphone = new AparelhoTelefonico();
	iphone.ligar();
	iphone.atender();
	iphone.correioEletronico();
	System.out.println("(Navegador Safari)");
	
	NavegadorInternet safari = new NavegadorInternet();
	safari.exibirPagina();
	safari.atualizarPagina();
	safari.adicionarNovaAba();
	
	
}
}
