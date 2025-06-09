package projetoBack.cadastroUnico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoBack.cadastroUnico.Entity.Clube;

public interface ClubeRepository extends JpaRepository<Clube, Long> {

}
