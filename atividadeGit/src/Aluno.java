import java.time.LocalDate;
import java.util.Objects;

public class Aluno {

	private String numeroMatricula; 
	private String nome;
	private LocalDate dataNascimento;
	
	public Aluno(String numeroMatricula, String nome, LocalDate dataNascimento) {
		super();
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, nome, numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(nome, other.nome)
				&& Objects.equals(numeroMatricula, other.numeroMatricula);
	}

	@Override
	public String toString() {
		return "Aluno [numeroMatricula=" + numeroMatricula + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ "]";
	}
	
	
}
