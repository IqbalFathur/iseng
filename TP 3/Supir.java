public class Supir{
	
	private String NmSupir, KdSupir;
	protected String[] KodeMobil = new String[20];
	protected String[] MerkMobil = new String[20];
	protected String[] JenisMobil = new String[20];
	protected String[] PlatMobil = new String[20];
	private int jmlMobil = 0;
	
	public Supir(String kode, String NamaSupir) {
		this.KdSupir = kode;
		this.NmSupir = NamaSupir;
	}
	
	public void setNmSupir(String NmSupir) {this.NmSupir = NmSupir;}
	public void setKdSupir(String KdSupir) {this.KdSupir = KdSupir;}
	public void setKodeMobil(String KdMobil) {
		KodeMobil[jmlMobil] = KdMobil;
		jmlMobil++;
	}
	public void setMerkMobil(String MrkMobil) {
		KodeMobil[jmlMobil] = MrkMobil;
		jmlMobil++;
	}
	public void setJenisMobil(String JnsMobil) {
		KodeMobil[jmlMobil] = JnsMobil;
		jmlMobil++;
	}
	public void setPlatMobil(String PltMobil) {
		KodeMobil[jmlMobil] = PltMobil;
		jmlMobil++;
	}
	
	public int getjmlMobil() {return this.jmlMobil;}
	public String getKdSupir() {return this.KdSupir;}
	public String getNmSupir() {return this.NmSupir;}
	
	public void daftarMobil() {
		System.out.println("");
		System.out.println("Kode Supir: " + KdSupir);
		System.out.println("Nama Supir: " + NmSupir);
		System.out.println("mobil yg digunakan: ");
			for (int i = 0; i < jmlMobil; i++) {
				System.out.println(KodeMobil[i]);
			}
		System.out.println("");
	}
}