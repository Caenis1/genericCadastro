package cadastro.fabrica;

import cadastro.domain.Persistente;

public interface FabricaPersistente {
	
	 Persistente criarObjeto(String dados[]);

}
