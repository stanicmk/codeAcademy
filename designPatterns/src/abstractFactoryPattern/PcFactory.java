package abstractFactoryPattern;

public class PcFactory implements AbstractComputerFactory {
	
	private String CPU;
	private String RAM;
	private String HDD;
	
	public PcFactory(String cPU, String rAM, String hDD) {
		super();
		CPU = cPU;
		RAM = rAM;
		HDD = hDD;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(CPU, RAM, HDD);
	}
	
	
	

}
