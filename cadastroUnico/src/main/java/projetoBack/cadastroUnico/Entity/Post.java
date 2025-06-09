package projetoBack.cadastroUnico.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "clube_id", nullable = false)
	private Clube clube;

	@ManyToOne
	@JoinColumn(name = "atleta_id", nullable = false)
	private Atleta atleta;

	@Temporal(TemporalType.DATE)
	private Date data;

	public Post() {

	}

	public Post(long id, Clube clube, Atleta atleta, Date data) {
		this.id = id;
		this.clube = clube;
		this.atleta = atleta;
		this.data = data;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}

	public Atleta getAtleta() {
		return atleta;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public long getId() {
		return id;
	}

}
