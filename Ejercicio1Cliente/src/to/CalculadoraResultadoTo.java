package to;

import javax.xml.bind.annotation.XmlRootElement;

import enumaration.Operacion;

@XmlRootElement
public class CalculadoraResultadoTo {
	private float op1;
	private float op2;
	private Operacion operacion;
	private float resultado;
	
	public CalculadoraResultadoTo() {
	
	}
	
	public CalculadoraResultadoTo(float op1, float op2, Operacion operacion, float resultado) {
		this.op1 = op1;
		this.op2 = op2;
		this.operacion = operacion;
		this.resultado = resultado;
		
	}

	public float getOp1() {
		return op1;
	}
	public void setOp1(float op1) {
		this.op1 = op1;
	}
	public float getOp2() {
		return op2;
	}
	public void setOp2(float op2) {
		this.op2 = op2;
	}
	public Operacion getOperacion() {
		return operacion;
	}
	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "CalculadoraResultadoTo [op1=" + op1 + ", op2=" + op2
				+ ", operacion=" + operacion + ", resultado=" + resultado + "]";
	}

	
}
