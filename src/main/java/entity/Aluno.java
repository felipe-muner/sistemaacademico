package entity;

public class Aluno {
	
	private Integer idAluno;
	private String nomeAluno;
	private String dataNasc;
	private String cidadeNatal;
	private String estadoNatal;
	private String sexo;
	private String tipoSanguineo;
	private String fatorRH;
	private MatriculaAluno ma;
	private EnderecoAluno ea;
	private TelefoneContatoAluno tca;
	private FiliacaoAluno fa;
	private ObservacoesAluno oa;
	private DocumentoAluno da;
	
	public Aluno() {
	}

	public Aluno(Integer idAluno, String nomeAluno, String dataNasc,
			String cidadeNatal, String estadoNatal, String sexo,
			String tipoSanguineo, String fatorRH, MatriculaAluno ma,
			EnderecoAluno ea, TelefoneContatoAluno tca, FiliacaoAluno fa,
			ObservacoesAluno oa, DocumentoAluno da) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.dataNasc = dataNasc;
		this.cidadeNatal = cidadeNatal;
		this.estadoNatal = estadoNatal;
		this.sexo = sexo;
		this.tipoSanguineo = tipoSanguineo;
		this.fatorRH = fatorRH;
		this.ma = ma;
		this.ea = ea;
		this.tca = tca;
		this.fa = fa;
		this.oa = oa;
		this.da = da;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nomeAluno=" + nomeAluno
				+ ", dataNasc=" + dataNasc + ", cidadeNatal=" + cidadeNatal
				+ ", estadoNatal=" + estadoNatal + ", sexo=" + sexo
				+ ", tipoSanguineo=" + tipoSanguineo + ", fatorRH=" + fatorRH
				+ ", ma=" + ma + ", ea=" + ea + ", tca=" + tca + ", fa=" + fa
				+ ", oa=" + oa + ", da=" + da + "]";
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

	public String getEstadoNatal() {
		return estadoNatal;
	}

	public void setEstadoNatal(String estadoNatal) {
		this.estadoNatal = estadoNatal;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getFatorRH() {
		return fatorRH;
	}

	public void setFatorRH(String fatorRH) {
		this.fatorRH = fatorRH;
	}

	public MatriculaAluno getMa() {
		return ma;
	}

	public void setMa(MatriculaAluno ma) {
		this.ma = ma;
	}

	public EnderecoAluno getEa() {
		return ea;
	}

	public void setEa(EnderecoAluno ea) {
		this.ea = ea;
	}

	public TelefoneContatoAluno getTca() {
		return tca;
	}

	public void setTca(TelefoneContatoAluno tca) {
		this.tca = tca;
	}

	public FiliacaoAluno getFa() {
		return fa;
	}

	public void setFa(FiliacaoAluno fa) {
		this.fa = fa;
	}

	public ObservacoesAluno getOa() {
		return oa;
	}

	public void setOa(ObservacoesAluno oa) {
		this.oa = oa;
	}

	public DocumentoAluno getDa() {
		return da;
	}

	public void setDa(DocumentoAluno da) {
		this.da = da;
	}

}
