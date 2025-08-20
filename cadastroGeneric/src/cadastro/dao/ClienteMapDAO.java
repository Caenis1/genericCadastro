package cadastro.dao;

import java.util.HashMap;
import java.util.Map;

import cadastro.SingletonMap;
import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{
	
	public ClienteMapDAO() {
        super();
        Map<Long, Cliente> mapaInterno =
                (Map<Long, Cliente>) SingletonMap.getInstance().getMap().get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente cliente, Cliente entityCadastrado) {
        entityCadastrado.setNome(cliente.getNome());
        entityCadastrado.setTel(cliente.getTel());
    }

}
