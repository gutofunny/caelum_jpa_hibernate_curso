package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteAlteraConta {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		
		ContaDao dao = new ContaDao(manager);
		
		manager.getTransaction().begin();
		Conta conta = dao.busca(2);
		conta.setTitular("Pedro Guedes");
		manager.getTransaction().commit();
		manager.close();

	}

}
