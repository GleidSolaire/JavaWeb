package Web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import br.edu.lista01.Exercicios;

@Named
@RequestScoped
public class DoisPontosBeans {
    @NotNull
	private Integer x1;
    @NotNull
	private Integer y1;
	private Integer y2;
	private Integer x2;
	private Double r;
	
	public void CalculaDistancia () {
		
		this.r= Exercicios.calcularDistanciaEntrePontos(x1, y1, x2, y2);
		
		
	}
	
	



	public Double getR() {
		return r;
	}





	public void setR(Double r) {
		this.r = r;
	}





	public Integer getX() {
		
		return x1;
	}
	public void setX(Integer x) {
		this.x1 = x1;
	}
	public Integer getY() {
		return y1;
	}
	public void setY(Integer y) {
		this.y1= y1;
	}
	public Integer getY2() {
		return y2;
	}
	public void setY2(Integer y2) {
		this.y2 = y2;
	}
	public Integer getX2() {
		return x2;
	}
	public void setX2(Integer x2) {
		this.x2 = x2;
	}
	
	
	
	
}
