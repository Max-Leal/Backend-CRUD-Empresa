package application;

import java.util.List;
import java.util.Scanner;

import daos.PessoaDAO;
import models.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		// Declarando os daos
		PessoaDAO pDao = new PessoaDAO();
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		// Buscar a lista de pessoas no banco banco
		List<Pessoa> listPessoa = pDao.listarTodas();
		
		System.out.println("Lista de pessoas no banco: " + listPessoa.size());
		for (Pessoa pessoa : listPessoa) {
			System.out.println(pessoa);
		}

		/*
		// Comando de inserir pessoa
		pDao.inserir(new Pessoa("Jonelson","Jonel@gmail.com"));
		
		// Comando de deletar por id
		pDao.deletar(2);
		
		// Comando de buscar por id
		Pessoa pessoaBuscada = pDao.buscarPorId(1);
		
		// Comando de update
		Pessoa pessoaAlterada = new Pessoa("Leonardo","Leo@gmail.com");
		pDao.atualizar(1, pessoaAlterada);
		*/
	}

}
