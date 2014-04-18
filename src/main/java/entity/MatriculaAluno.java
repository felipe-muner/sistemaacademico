package entity;

public class MatriculaAluno {
	private Integer idMatriculaAluno;
	private String tipoMatricula;
	private String seriePeriodo;
	private String turno;
	private String ensino;
	private Aluno al;

	public MatriculaAluno() {
	}

	public MatriculaAluno(Integer idMatriculaAluno, String tipoMatricula,
			String seriePeriodo, String ensino, String turno, Aluno al) {
		super();
		this.idMatriculaAluno = idMatriculaAluno;
		this.tipoMatricula = tipoMatricula;
		this.seriePeriodo = seriePeriodo;
		this.ensino = ensino;
		this.turno = turno;
		this.al = al;
	}

	@Override
	public String toString() {
		return "MatriculaAluno [idMatriculaAluno=" + idMatriculaAluno
				+ ", tipoMatricula=" + tipoMatricula + ", seriePeriodo="
				+ seriePeriodo + ", ensino=" + ensino + ", turno=" + turno
				+ ", al=" + al + "]";
	}

	public Integer getIdMatriculaAluno() {
		return idMatriculaAluno;
	}

	public void setIdMatriculaAluno(Integer idMatriculaAluno) {
		this.idMatriculaAluno = idMatriculaAluno;
	}

	public String getTipoMatricula() {
		return tipoMatricula;
	}

	public void setTipoMatricula(String tipoMatricula) {
		this.tipoMatricula = tipoMatricula;
	}

	public String getSeriePeriodo() {
		return seriePeriodo;
	}

	public void setSeriePeriodo(String seriePeriodo) {
		this.seriePeriodo = seriePeriodo;
	}

	public String getEnsino() {
		return ensino;
	}

	public void setEnsino(String ensino) {
		this.ensino = ensino;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Aluno getAl() {
		return al;
	}

	public void setAl(Aluno al) {
		this.al = al;
	}

	

}
