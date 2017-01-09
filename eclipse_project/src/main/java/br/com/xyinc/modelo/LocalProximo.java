package br.com.xyinc.modelo;

public class LocalProximo extends Local {

	private static final long serialVersionUID = -1418905466321112769L;

    private Double distancia;
    
    public LocalProximo(Local local, Double distancia) {
		setId(local.getId());
		setDescricao(local.getDescricao());
		setLatitude(local.getLatitude());
		setLongitude(local.getLongitude());
		this.distancia = distancia;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}	

}
