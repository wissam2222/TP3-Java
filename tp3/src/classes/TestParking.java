package classes;

public class TestParking {

	public static void main(String[] args) {
		Vehicule[]v= new Vehicule[4];
		v[0] = new Voiture("V1","Mercedes",4);
		v[1] = new Voiture("V2","Toyota",2);
		v[2] = new Moto (true,"11C33","Kawazaki");
		v[3] = new Camion (5000,"11S22","Suzuki");
		
		 for (int i = 0; i < v.length; i++) {
	            v[i].stationner();
	            v[i].afficher();
	        }
		 
		 System.out.println("=== Seulement les voitures ===");
		 for (int i = 0; i < v.length; i++) {
	            if (v[i] instanceof Voiture) {
	                v[i].afficher();
	            }
	        }
		  //version fausse
		  //Vehicule x = new Moto(true,"11C22","Yamaha");
		 //Voiture v1 =(Voiture) x;
		// System.out.println("Downcasting réussi!");
		 

	}

}
