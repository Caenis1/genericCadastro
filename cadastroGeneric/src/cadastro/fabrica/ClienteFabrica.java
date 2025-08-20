package cadastro.fabrica;

import cadastro.domain.Cliente;
import cadastro.domain.Persistente;

public class ClienteFabrica implements FabricaPersistente{
	
	public Persistente criarObjeto(String dadosSeparados[]) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1], dadosSeparados[2];
    }

}
