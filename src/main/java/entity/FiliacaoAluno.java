package entity;

public class FiliacaoAluno {
	
	private Integer idFiliacaoAluno;
	private String nomePai;
	private String profissaoPai;
	private String telPai;
	private String nomeMae;
	private String profissaoMae;
	private String telMae;
	private String outro;
	private String profissaoOutro;
	private String telOutro;
	private Aluno alu;
	
	public FiliacaoAluno() {
		// TODO Auto-generated constructor stub
	}

	public FiliacaoAluno(Integer idFiliacaoAluno, String nomePai,
			String profissaoPai, String telPai, String nomeMae,
			String profissaoMae, String telMae, String outro,
			String profissaoOutro, String telOutro, Aluno alu) {
		super();
		this.idFiliacaoAluno = idFiliacaoAluno;
		this.nomePai = nomePai;
		this.profissaoPai = profissaoPai;
		this.telPai = telPai;
		this.nomeMae = nomeMae;
		this.profissaoMae = profissaoMae;
		this.telMae = telMae;
		this.outro = outro;
		this.profissaoOutro = profissaoOutro;
		this.telOutro = telOutro;
		this.alu = alu;
	}

	@Override
	public String toString() {
		return "FiliacaoAluno [idFiliacaoAluno=" + idFiliacaoAluno
				+ ", nomePai=" + nomePai + ", profissaoPai=" + profissaoPai
				+ ", telPai=" + telPai + ", nomeMae=" + nomeMae
				+ ", profissaoMae=" + profissaoMae + ", telMae=" + telMae
				+ ", outro=" + outro + ", profissaoOutro=" + profissaoOutro
				+ ", telOutro=" + telOutro + ", alu=" + alu + "]";
	}

	public Integer getIdFiliacaoAluno() {
		return idFiliacaoAluno;
	}

	public void setIdFiliacaoAluno(Integer idFiliacaoAluno) {
		this.idFiliacaoAluno = idFiliacaoAluno;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getProfissaoPai() {
		return profissaoPai;
	}

	public void setProfissaoPai(String profissaoPai) {
		this.profissaoPai = profissaoPai;
	}

	public String getTelPai() {
		return telPai;
	}

	public void setTelPai(String telPai) {
		this.telPai = telPai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getProfissaoMae() {
		return profissaoMae;
	}

	public void setProfissaoMae(String profissaoMae) {
		this.profissaoMae = profissaoMae;
	}

	public String getTelMae() {
		return telMae;
	}

	public void setTelMae(String telMae) {
		this.telMae = telMae;
	}

	public String getOutro() {
		return outro;
	}

	public void setOutro(String outro) {
		this.outro = outro;
	}

	public String getProfissaoOutro() {
		return profissaoOutro;
	}

	public void setProfissaoOutro(String profissaoOutro) {
		this.profissaoOutro = profissaoOutro;
	}

	public String getTelOutro() {
		return telOutro;
	}

	public void setTelOutro(String telOutro) {
		this.telOutro = telOutro;
	}

	public Aluno getAlu() {
		return alu;
	}

	public void setAlu(Aluno alu) {
		this.alu = alu;
	}
	
	
}
