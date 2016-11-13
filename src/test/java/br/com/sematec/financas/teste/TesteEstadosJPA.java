package br.com.sematec.financas.teste;

import javax.persistence.EntityManager;

import br.com.sematec.financas.util.JPAUtil;

public class TesteEstadosJPA {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();

		// Testes do capitulo

		manager.getTransaction().commit();

		manager.close();

	}
}
