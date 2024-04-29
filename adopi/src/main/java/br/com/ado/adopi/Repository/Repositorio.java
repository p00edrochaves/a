package br.com.ado.adopi.Repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ado.adopi.model.Aluno;

@Repository
public interface Repositorio extends CrudRepository<Aluno,Long>{
    List<Aluno> findAll();

    Aluno findByRA(long rA);


}
