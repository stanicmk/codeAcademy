package abstractFactoryPattern;

public class ServerFactory implements AbstractComputerFactory {
	
	private String CPU;
	private String RAM;
	private String HDD;
	public ServerFactory(String cPU, String rAM, String hDD) {
		super();
		CPU = cPU;
		RAM = rAM;
		HDD = hDD;
	}
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Server(CPU, RAM, HDD);
	}
	
	

}
