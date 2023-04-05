package sistemaSmartTv.java;

public class Usuario {

	public static void main(String[] args)throws Exception {
		
		SmartTv smartTv = new SmartTv();
		
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Canal Atual : " +smartTv.canal );
		smartTv.mudarCanal(13);		
		System.out.println("Canal após mudança de canal: "+ smartTv.canal);
		
		
		System.out.println("Volume inicial "+ smartTv.volume);
		
	
		
		
		
		System.out.println("A tv ligada ?"+ smartTv.ligada);
		System.out.println("Canal atual " + smartTv.canal);
		System.out.println("Volume atual " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status - TV ligada ? "+ smartTv.ligada);
		
		
		

	}

}

