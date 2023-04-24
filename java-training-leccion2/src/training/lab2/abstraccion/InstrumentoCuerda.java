package training.lab2.abstraccion;

	public abstract class InstrumentoCuerda implements InstrumentoMusical {
	    int numeroCuerdas;

	    public InstrumentoCuerda(int numeroCuerdas) {
	        this.numeroCuerdas = numeroCuerdas;
	    }

	    public abstract void afinarCuerdas();
	}


