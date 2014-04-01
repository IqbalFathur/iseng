public class DriverS {

	public static void main(String[] args) {
		Mobil Mobil1 = new Mobil("7", "Toyota", "roda empat", "D 666 AI");
		Mobil Mobil2 = new Mobil("15", "Daihatsu", "roda lima", "B 6969 CE");
		
		Supir Supir1 = new Supir("5678", "Awan");
		Supir Supir2 = new Supir("4949", "Langit");
		
		Supir1.setKodeMobil  (Mobil1.getKdMobil());
		Supir1.setMerkMobil  (Mobil1.getMrkMobil());
		Supir1.setJenisMobil (Mobil1.getJnsMobil());
		Supir1.setPlatMobil  (Mobil1.getPltMobil());
		
		Supir2.setKodeMobil  (Mobil2.getKdMobil());
		Supir2.setMerkMobil  (Mobil2.getMrkMobil());
		Supir2.setJenisMobil (Mobil2.getJnsMobil());
		Supir2.setPlatMobil  (Mobil2.getPltMobil());
		
		Supir1.daftarMobil();
		Supir2.daftarMobil();
	}
}