package cadastro.dao.generic;

import java.util.Collection;

import cadastro.domain.Persistente;

public interface IGenericDAO<T extends Persistente> {
	
	 
    public Boolean cadastrar(T entity);
    public void excluir(Long valor);
    public void alterar(T entity);
    public T consultar(Long valor);
    public Collection<T> buscarTodos();

}
