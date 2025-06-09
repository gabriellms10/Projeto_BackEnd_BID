package projetoBack.cadastroUnico.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoBack.cadastroUnico.Entity.Atleta;
import projetoBack.cadastroUnico.Entity.Clube;
import projetoBack.cadastroUnico.Entity.Post;
import projetoBack.cadastroUnico.Repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public void salvar(Post post) {
		repository.save(post);

	}

	public Post buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Post> buscar() {
		return repository.findAll();
	}

	public Post atualizar(long id, Atleta atletaNovo, Clube clubeNovo, Date dataNova ) {

		Post postExistente = buscarPorId(id);
		if (postExistente != null) {
			postExistente.setAtleta(atletaNovo);
			postExistente.setClube(clubeNovo);
			postExistente.setData(dataNova);
			
			return repository.save(postExistente);
		} else {
			return null;
		}
	}

	public void Deletar(long id) {

		repository.deleteById(id);
	}

}
