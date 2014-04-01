public class Mobil {
	
	private String KdMobil, MrkMobil, JnsMobil, PltMobil;
	
	public Mobil(String KdMobil, String MrkMobil, String JnsMobil, String PltMobil) {
		this.KdMobil = KdMobil;
		this.MrkMobil = MrkMobil;
		this.JnsMobil = JnsMobil;
		this.PltMobil = PltMobil;
	}
	
	public void setKdMobil(String KdMobil)   {this.KdMobil = KdMobil;}
	public void setMrkMobil(String MrkMobil)   {this.MrkMobil = MrkMobil;}
	public void setJnsMobil(String JnsMobil) {this.JnsMobil = JnsMobil;}
	public void setPltMobil(String PltMobil) 	 {this.PltMobil = PltMobil;}
	
	public String getKdMobil()  {return this.KdMobil;}
	public String getMrkMobil()  {return this.MrkMobil;}
	public String getJnsMobil() {return this.JnsMobil;}
	public String getPltMobil()  {return this.PltMobil;}
}