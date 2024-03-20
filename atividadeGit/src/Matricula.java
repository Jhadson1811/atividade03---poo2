import java.time.LocalDate;

public class Matricula {
	
	private Aluno aluno;
	private Curso curso;
	private LocalDate dataMatricula = LocalDate.now();
	
	public Matricula(Aluno aluno, Curso curso) throws IdadeMatriculaException {
		
		long idadeAluno = idadeAlunoMatricula(aluno, dataMatricula);
		if(idadeAluno < 18) {
			throw new IdadeMatriculaException("Matricula não foi feita! Aluno menor de Idade: " 
		+ idadeAluno);
		}
		
		this.curso = curso;
		this.aluno = aluno;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}
	
	@Override
	public String toString() {
		return "Matricula{"+
	             "aluno='" + aluno + '\''+
	             ", curso=" + curso + 
	             ", dataMatricula=" + dataMatricula + 
	             '}';
	}
	
	public long idadeAlunoMatricula(Aluno a, LocalDate dataMatricula ) {
		LocalDate dt = a.getDataNascimento();
		long idade = dt.until(dataMatricula).getYears();
		return idade;
	}
	
	public boolean addAluno(Aluno a) {
		boolean resultado = false;
		long maiorDeIdade = idadeAlunoMatricula(a, dataMatricula);
		
		if(maiorDeIdade >= 18) {
			return resultado = true;
		} else {
			System.out.println("Aluno menor de idade! Idade: " + maiorDeIdade);
		}
		
		return resultado;
	}
	
}
