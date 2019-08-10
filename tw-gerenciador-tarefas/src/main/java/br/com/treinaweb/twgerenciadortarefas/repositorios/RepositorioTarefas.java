package br.com.treinaweb.twgerenciadortarefas.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.treinaweb.twgerenciadortarefas.modelos.Tarefa;

public interface RepositorioTarefas extends JpaRepository<Tarefa, Long>{

	@Query("SELECT t from Tarefa t WHERE t.usuario.email = :emailUsuario")
	List<Tarefa> carregarTarefaPorUsuario(@Param("emailUsuario") String email);
}
