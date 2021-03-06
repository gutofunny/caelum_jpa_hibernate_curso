package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaAlteracaoDeLista {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		
		ContaDao dao = new ContaDao(manager);
		
		manager.getTransaction().begin();
		List<Conta> listaContas = dao.lista();
		for (Conta conta : listaContas) {
			conta.setTitular("Fulano");
		}
		manager.getTransaction().commit();
		manager.close();
	}

}
