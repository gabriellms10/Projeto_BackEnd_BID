package projetoBack.cadastroUnico.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetoBack.cadastroUnico.Entity.Atleta;
import projetoBack.cadastroUnico.Entity.Clube;
import projetoBack.cadastroUnico.Entity.Post;
import projetoBack.cadastroUnico.Service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {


	@Autowired
	private PostService service;

	@PostMapping
	public void salvar(@RequestBody Post post) {
		service.salvar(post);
	}

	@GetMapping
	public List<Post> BuscarTodos() {
		return service.buscar();
	}

	@GetMapping("/{id}")
	public Post BuscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}

	@PutMapping("/{id}")
	public Post atualizar(@PathVariable Long id, @RequestBody Atleta atleta , Clube clube, Date date) {
		return service.atualizar(id, atleta, clube, date);

	}

	@DeleteMapping("/{id}")
	public void Deletar(@PathVariable Long id) {
		service.Deletar(id);
	}


}
