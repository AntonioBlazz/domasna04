package zadaca04;

public class Main {
public static void main(String[] args) {
Avtomobil a = new Avtomobil("Toyota", "Corolla","crna",23000);
a.Metod(5);
System.out.println("Marka: " + a.getMarka());
System.out.println("Model: " + a.getModel());
System.out.println("Boja: " + a.getBoja());
System.out.println("Pominati km: " + a.getKm());
}
}