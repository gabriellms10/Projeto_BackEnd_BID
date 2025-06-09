package projetoBack.cadastroUnico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoBack.cadastroUnico.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
