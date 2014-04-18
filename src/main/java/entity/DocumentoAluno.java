package entity;

public class DocumentoAluno {
	
	private Integer idDocumentoAluno;
	private Boolean declaracaoEscolar;
	private Boolean certidaoNascimento;
	private Boolean carteiraVacinacao;
	private Boolean declaracaoQuitacao;
	private Boolean historicoEscolar;
	private Boolean duasFotos;
	private Boolean atestadoMedico;
	private Boolean rgResponsavel;
	private Boolean cpfResponsavel;
	private Boolean comprovanteResidencia;
	private Aluno al;
	
	public DocumentoAluno() {
		// TODO Auto-generated constructor stub
	}
	public DocumentoAluno(Integer idDocumentoAluno, Boolean declaracaoEscolar,
			Boolean certidaoNascimento, Boolean carteiraVacinacao,
			Boolean declaracaoQuitacao, Boolean historicoEscolar,
			Boolean duasFotos, Boolean atestadoMedico, Boolean rgResponsavel,
			Boolean cpfResponsavel, Boolean comprovanteResidencia, Aluno al) {
		super();
		this.idDocumentoAluno = idDocumentoAluno;
		this.declaracaoEscolar = declaracaoEscolar;
		this.certidaoNascimento = certidaoNascimento;
		this.carteiraVacinacao = carteiraVacinacao;
		this.declaracaoQuitacao = declaracaoQuitacao;
		this.historicoEscolar = historicoEscolar;
		this.duasFotos = duasFotos;
		this.atestadoMedico = atestadoMedico;
		this.rgResponsavel = rgResponsavel;
		this.cpfResponsavel = cpfResponsavel;
		this.comprovanteResidencia = comprovanteResidencia;
		this.al = al;
	}
	public Integer getIdDocumentoAluno() {
		return idDocumentoAluno;
	}
	public void setIdDocumentoAluno(Integer idDocumentoAluno) {
		this.idDocumentoAluno = idDocumentoAluno;
	}
	public Boolean getDeclaracaoEscolar() {
		return declaracaoEscolar;
	}
	public void setDeclaracaoEscolar(Boolean declaracaoEscolar) {
		this.declaracaoEscolar = declaracaoEscolar;
	}
	public Boolean getCertidaoNascimento() {
		return certidaoNascimento;
	}
	public void setCertidaoNascimento(Boolean certidaoNascimento) {
		this.certidaoNascimento = certidaoNascimento;
	}
	public Boolean getCarteiraVacinacao() {
		return carteiraVacinacao;
	}
	public void setCarteiraVacinacao(Boolean carteiraVacinacao) {
		this.carteiraVacinacao = carteiraVacinacao;
	}
	public Boolean getDeclaracaoQuitacao() {
		return declaracaoQuitacao;
	}
	public void setDeclaracaoQuitacao(Boolean declaracaoQuitacao) {
		this.declaracaoQuitacao = declaracaoQuitacao;
	}
	public Boolean getHistoricoEscolar() {
		return historicoEscolar;
	}
	public void setHistoricoEscolar(Boolean historicoEscolar) {
		this.historicoEscolar = historicoEscolar;
	}
	public Boolean getDuasFotos() {
		return duasFotos;
	}
	public void setDuasFotos(Boolean duasFotos) {
		this.duasFotos = duasFotos;
	}
	public Boolean getAtestadoMedico() {
		return atestadoMedico;
	}
	public void setAtestadoMedico(Boolean atestadoMedico) {
		this.atestadoMedico = atestadoMedico;
	}
	public Boolean getRgResponsavel() {
		return rgResponsavel;
	}
	public void setRgResponsavel(Boolean rgResponsavel) {
		this.rgResponsavel = rgResponsavel;
	}
	public Boolean getCpfResponsavel() {
		return cpfResponsavel;
	}
	public void setCpfResponsavel(Boolean cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}
	public Boolean getComprovanteResidencia() {
		return comprovanteResidencia;
	}
	public void setComprovanteResidencia(Boolean comprovanteResidencia) {
		this.comprovanteResidencia = comprovanteResidencia;
	}
	public Aluno getAl() {
		return al;
	}
	public void setAl(Aluno al) {
		this.al = al;
	}
	
}
