package models;

public class Funcionario extends Pessoa {

	private int id;
	private String matricula;
	private String departamento;

	public Funcionario() {

	}

	public Funcionario(String matricula, String departamento) {
		super();
		this.matricula = matricula;
		this.departamento = departamento;
	}

	public Funcionario(int id, String matricula, String departamento) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + super.getId() + ", nome=" + super.getNome() + ", email=" + super.getEmail()
				+ "] Funcionario [id=" + id + ", matricula=" + matricula + ", departamento=" + departamento + "]";
	}

}
