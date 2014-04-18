package entity;

public class ObservacoesAluno {
	
	private Integer idObservacoesAluno;	
	private Boolean portadorDeficiencia;
	private String nomeDeficiencia;	
	private Boolean alergico;
	private String nomeAlergia;	
	private String outrasObs;
	private Aluno al;
	
	public ObservacoesAluno() {
	}

	public ObservacoesAluno(Integer idObservacoesAluno,
			Boolean portadorDeficiencia, String nomeDeficiencia,
			Boolean alergico, String nomeAlergia, String outrasObs, Aluno al) {
		super();
		this.idObservacoesAluno = idObservacoesAluno;
		this.portadorDeficiencia = portadorDeficiencia;
		this.nomeDeficiencia = nomeDeficiencia;
		this.alergico = alergico;
		this.nomeAlergia = nomeAlergia;
		this.outrasObs = outrasObs;
		this.al = al;
	}

	@Override
	public String toString() {
		return "ObservacoesAluno [idObservacoesAluno=" + idObservacoesAluno
				+ ", portadorDeficiencia=" + portadorDeficiencia
				+ ", nomeDeficiencia=" + nomeDeficiencia + ", alergico="
				+ alergico + ", nomeAlergia=" + nomeAlergia + ", outrasObs="
				+ outrasObs + ", al=" + al + "]";
	}

	public Integer getIdObservacoesAluno() {
		return idObservacoesAluno;
	}

	public void setIdObservacoesAluno(Integer idObservacoesAluno) {
		this.idObservacoesAluno = idObservacoesAluno;
	}

	public Boolean getPortadorDeficiencia() {
		return portadorDeficiencia;
	}

	public void setPortadorDeficiencia(Boolean portadorDeficiencia) {
		this.portadorDeficiencia = portadorDeficiencia;
	}

	public String getNomeDeficiencia() {
		return nomeDeficiencia;
	}

	public void setNomeDeficiencia(String nomeDeficiencia) {
		this.nomeDeficiencia = nomeDeficiencia;
	}

	public Boolean getAlergico() {
		return alergico;
	}

	public void setAlergico(Boolean alergico) {
		this.alergico = alergico;
	}

	public String getNomeAlergia() {
		return nomeAlergia;
	}

	public void setNomeAlergia(String nomeAlergia) {
		this.nomeAlergia = nomeAlergia;
	}

	public String getOutrasObs() {
		return outrasObs;
	}

	public void setOutrasObs(String outrasObs) {
		this.outrasObs = outrasObs;
	}

	public Aluno getAl() {
		return al;
	}

	public void setAl(Aluno al) {
		this.al = al;
	}
	
	
	
	
}
