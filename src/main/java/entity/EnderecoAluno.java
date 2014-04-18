package entity;

public class EnderecoAluno {

	private Integer idEnderecoAluno;
	private String logradouro;
	private String loteamento;
	private String bairro;
	private String municipio;
	private String estado;
	private String cep;
	private Aluno al;

	public EnderecoAluno() {
		// TODO Auto-generated constructor stub
	}

	public EnderecoAluno(Integer idEnderecoAluno, String logradouro,
			String loteamento, String bairro, String municipio, String estado,
			String cep, Aluno al) {
		super();
		this.idEnderecoAluno = idEnderecoAluno;
		this.logradouro = logradouro;
		this.loteamento = loteamento;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.cep = cep;
		this.al = al;
	}

	@Override
	public String toString() {
		return "EnderecoAluno [idEnderecoAluno=" + idEnderecoAluno
				+ ", logradouro=" + logradouro + ", loteamento=" + loteamento
				+ ", bairro=" + bairro + ", municipio=" + municipio
				+ ", estado=" + estado + ", cep=" + cep + ", al=" + al + "]";
	}

	public Integer getIdEnderecoAluno() {
		return idEnderecoAluno;
	}

	public void setIdEnderecoAluno(Integer idEnderecoAluno) {
		this.idEnderecoAluno = idEnderecoAluno;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getLoteamento() {
		return loteamento;
	}

	public void setLoteamento(String loteamento) {
		this.loteamento = loteamento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Aluno getAl() {
		return al;
	}

	public void setAl(Aluno al) {
		this.al = al;
	}

}
