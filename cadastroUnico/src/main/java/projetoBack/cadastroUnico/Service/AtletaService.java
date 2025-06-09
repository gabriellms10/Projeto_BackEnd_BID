package projetoBack.cadastroUnico.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoBack.cadastroUnico.Entity.Atleta;
import projetoBack.cadastroUnico.Entity.Clube;
import projetoBack.cadastroUnico.Repository.AtletaRepository;

@Service
public class AtletaService {

	@Autowired
	private AtletaRepository repository;

	public void salvar(Atleta atleta) {
		repository.save(atleta);

	}

	public Atleta buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Atleta> buscar() {
		return repository.findAll();
	}

	public Atleta atualizar(long id, Atleta nomeNovo, List<Clube> clubeNovo) {

		Atleta atletaExistente = buscarPorId(id);
		if (atletaExistente != null) {
			atletaExistente.setNome(nomeNovo.getNome());
			atletaExistente.setClubes(clubeNovo);
			;
			return repository.save(atletaExistente);
		} else {
			return null;
		}
	}

	public void Deletar(long id) {

		repository.deleteById(id);
	}

}
