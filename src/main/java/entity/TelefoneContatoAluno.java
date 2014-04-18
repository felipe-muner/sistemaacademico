package entity;

public class TelefoneContatoAluno {
	private Integer idTelefoneContatoAluno;
	private String telContatoUm;
	private String telContatoDois;
	private String telContatoTres;
	private Aluno al;
	
	public TelefoneContatoAluno() {
	}

	public TelefoneContatoAluno(Integer idTelefoneContatoAluno,
			String telContatoUm, String telContatoDois, String telContatoTres,
			Aluno al) {
		super();
		this.idTelefoneContatoAluno = idTelefoneContatoAluno;
		this.telContatoUm = telContatoUm;
		this.telContatoDois = telContatoDois;
		this.telContatoTres = telContatoTres;
		this.al = al;
	}

	@Override
	public String toString() {
		return "TelefoneContatoAluno [idTelefoneContatoAluno="
				+ idTelefoneContatoAluno + ", telContatoUm=" + telContatoUm
				+ ", telContatoDois=" + telContatoDois + ", telContatoTres="
				+ telContatoTres + ", al=" + al + "]";
	}

	public Integer getIdTelefoneContatoAluno() {
		return idTelefoneContatoAluno;
	}

	public void setIdTelefoneContatoAluno(Integer idTelefoneContatoAluno) {
		this.idTelefoneContatoAluno = idTelefoneContatoAluno;
	}

	public String getTelContatoUm() {
		return telContatoUm;
	}

	public void setTelContatoUm(String telContatoUm) {
		this.telContatoUm = telContatoUm;
	}

	public String getTelContatoDois() {
		return telContatoDois;
	}

	public void setTelContatoDois(String telContatoDois) {
		this.telContatoDois = telContatoDois;
	}

	public String getTelContatoTres() {
		return telContatoTres;
	}

	public void setTelContatoTres(String telContatoTres) {
		this.telContatoTres = telContatoTres;
	}

	public Aluno getAl() {
		return al;
	}

	public void setAl(Aluno al) {
		this.al = al;
	}
	
	
}
