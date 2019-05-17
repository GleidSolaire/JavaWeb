package Web;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import br.edu.lista01.Exercicios;

@Named
@RequestScoped
public class ProgressaoBean {
    @NotNull
	private Double a1;
	@NotNull
	private Integer n;
	
	private Double an;
	@NotNull
	private Double r;
	
	public void Calcular () {
		
		
		this.an = Exercicios.calcularNEsimoTermo(a1, n, r);
		
	}
	
	public void CalcularComMessage () {
		
	this.Calcular();	
		//mensagem padrao JSF
	
	FacesMessage msg = new FacesMessage();
	msg.setSummary("O an �: "+ this.an);
   FacesContext.getCurrentInstance().addMessage(null, msg);
		
	}
	
	
	
	
	
	
	
	
	public Double getA1() {
		return a1;
	}
	public void setA1(Double a1) {
		this.a1 = a1;
	}
	public Integer getN() {
		return n;
	}
	public void setN(Integer n) {
		this.n = n;
	}
	public Double getAn() {
		return an;
	}
	public void setAn(Double an) {
		this.an = an;
	}
	public Double getR() {
		return r;
	}
	public void setR(Double r) {
		this.r = r;
	}
	

}


