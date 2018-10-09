import verkiezingen.Stemmachine;

public class Verkiezingsprogramma {
  public static void main(String[] args) {
	  // Initialiseert nieuw object door stemmachines constructor op te roepen en slaat het object op in machine
	  var machine = new Stemmachine();
	  
	  machine.zetAan();
	  machine.stem("Wouter Bos");
	  machine.stem("Gerda Verburg");
	  machine.stem("Nebahat Albayrak");
	  machine.stem("Wouter Bos");
	  machine.stem("Henk Kamp");
	  
	  var uitslag = machine.geefUitslagPerPartij();
	  System.out.println(uitslag);
  }
}

