
public class Polinomio {
	
	private int grado; // valore del più grande esponente del polinomio n
	private double [] coefficienti; // array dei coefficienti a

	public int getGrado() {
		return grado;
	}

	public double[] getCoefficienti() {
		return coefficienti;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public void setCoefficienti(double[] coefficienti) {
		this.coefficienti = coefficienti;
	}
	
	/*
 	============================================================================================================
	 */
	
	public Polinomio(int massimo) {
		
		grado = massimo;
		coefficienti = new double[massimo + 1];
	}
	
	public void setCostante(int i, double valore) {
		
		coefficienti[i] = valore;
	}
	
    public double valuta(double x) {
    	
        double risultato = 0;
        
        for (int i = 0; i <= grado; i++) {
            risultato += coefficienti[i] * Math.pow(x, i);
        }
        
        return risultato;
    }

}
