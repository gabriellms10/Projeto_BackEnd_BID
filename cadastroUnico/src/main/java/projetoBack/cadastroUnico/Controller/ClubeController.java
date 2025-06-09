package projetoBack.cadastroUnico.Controller;

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

import projetoBack.cadastroUnico.Entity.Clube;
import projetoBack.cadastroUnico.Service.ClubeService;

@RestController
@RequestMapping("/clube")
public class ClubeController {

	@Autowired
	private ClubeService service;

	@PostMapping
	public void salvar(@RequestBody Clube clube) {
		service.salvar(clube);
	}

	@GetMapping
	public List<Clube> BuscarTodos() {
		return service.buscar();
	}

	@GetMapping("/{id}")
	public Clube BuscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}

	@PutMapping("/{id}")
	public Clube atualizar(@PathVariable Long id, @RequestBody Clube clube) {
		return service.atualizar(id, clube);

	}

	@DeleteMapping("/{id}")
	public void Deletar(@PathVariable Long id) {
		service.Deletar(id);
	}

}
