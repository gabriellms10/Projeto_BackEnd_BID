package projetoBack.cadastroUnico.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Atleta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@ManyToMany
	@JoinTable(name = "atleta_clube", joinColumns = @JoinColumn(name = "atleta_id"), inverseJoinColumns = @JoinColumn(name = "clube_id"))
	private List<Clube> clubes = new ArrayList<>();

	public Atleta() {

	}

	public Atleta(long id, String nome, List<Clube> clubes) {
		this.id = id;
		this.nome = nome;
		this.clubes = clubes;
	}

	public List<Clube> getClubes() {
		return clubes;
	}

	public void setClubes(List<Clube> clubeNovo) {
		this.clubes = clubeNovo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

}
