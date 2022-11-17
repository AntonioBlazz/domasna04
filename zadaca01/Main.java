package zadaca01;

public class Main {
	public static void main(String[] args) {
		Covek objekt = new Covek();
		objekt.setIme("Antonio");
		objekt.setPrezime("Blazheski");
		objekt.setMaticenBroj("0606006660034");

		System.out.println("Ime: "+ objekt.getIme());
		System.out.println("Prezime: "+ objekt.getPrezime());
		System.out.println("Maticen broj: "+ objekt.getMaticenBroj());
		}
}
