package zadaca02;

public class Main {
	public static void main(String[] args) {
		Restoran objekt = new Restoran();

		objekt.setIme("");
		objekt.setLokacija("ul. Mukos br.2");
		objekt.setBrojSedista(30);
		objekt.setTelefon("070210448");

		System.out.println("Ime: " + objekt.getIme());
		System.out.println("Lokacija: " + objekt.getLokacija());
		System.out.println("Broj na sedista: " + objekt.getBrojSedista());
		System.out.println("Telefon: " + objekt.getTelefon());
		}
}
