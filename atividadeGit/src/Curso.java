import java.time.LocalDate;
import java.util.Objects;

public class Curso {

	private int codigoCurso;
	private String nomeCurso;
	private LocalDate dataInicio;
			
	public Curso(int codigoCurso, String nomeCurso, LocalDate dataInicio) {
		this.codigoCurso = codigoCurso;
		this.nomeCurso = nomeCurso;
		this.dataInicio = dataInicio;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}
	
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoCurso, dataInicio, nomeCurso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return codigoCurso == other.codigoCurso && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(nomeCurso, other.nomeCurso);
	}

	@Override
	public String toString() {
		return "Curso [codigoCurso=" + codigoCurso + ", nomeCurso=" + nomeCurso + ", dataInicio=" + dataInicio + "]";
	}
	
	
}
