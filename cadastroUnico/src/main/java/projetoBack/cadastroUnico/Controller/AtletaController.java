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

import projetoBack.cadastroUnico.Entity.Atleta;
import projetoBack.cadastroUnico.Entity.Clube;
import projetoBack.cadastroUnico.Service.AtletaService;

@RestController
@RequestMapping("/atleta")
public class AtletaController {

	@Autowired
	private AtletaService service;

	@PostMapping
	public void salvar(@RequestBody Atleta atleta) {
		service.salvar(atleta);
	}

	@GetMapping
	public List<Atleta> BuscarTodos() {
		return service.buscar();
	}

	@GetMapping("/{id}")
	public Atleta BuscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}

	@PutMapping("/{id}")
	public Atleta atualizar(@PathVariable Long id, @RequestBody Atleta atleta, List<Clube> clube) {
		return service.atualizar(id, atleta, clube);

	}

	@DeleteMapping("/{id}")
	public void Deletar(@PathVariable Long id) {
		service.Deletar(id);
	}

}
