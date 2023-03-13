package abstractFactoryPattern;

public class Server extends Computer {
	
	private String CPU;
	private String RAM;
	private String HDD;
	
	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.RAM;
	}
	public Server(String cPU, String rAM, String hDD) {
		super();
		CPU = cPU;
		RAM = rAM;
		HDD = hDD;
	}
	
	
	

}
