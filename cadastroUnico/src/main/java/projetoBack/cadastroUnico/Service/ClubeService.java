package projetoBack.cadastroUnico.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoBack.cadastroUnico.Entity.Clube;
import projetoBack.cadastroUnico.Repository.ClubeRepository;

@Service
public class ClubeService {

	@Autowired
	private ClubeRepository repository;

	public void salvar(Clube clube) {
		repository.save(clube);

	}

	public Clube buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Clube> buscar() {
		return repository.findAll();
	}

	public Clube atualizar(long id, Clube DadosAtualizados) {

		Clube clubeExistente = buscarPorId(id);
		if (clubeExistente != null) {
			clubeExistente.setNome(DadosAtualizados.getNome());
			return repository.save(clubeExistente);
		} else {
			return null;
		}
	}

	public void Deletar(long id) {

		repository.deleteById(id);
	}

}
