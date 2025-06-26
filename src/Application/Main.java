package application;

import java.util.ArrayList;
import java.util.List;

import daos.PessoaDAO;
import models.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		PessoaDAO pDao = new PessoaDAO();
		
		List<Pessoa> listPessoa = new ArrayList<>();
		
		listPessoa.add(new Pessoa("João","Jao@gmail.com"));
		listPessoa.add(new Pessoa("Marcos","Marcos@gmail.com"));
		listPessoa.add(new Pessoa("Cleber","Cleber@gmail.com"));
		
		
		for (Pessoa p : listPessoa) {
			pDao.inserir(p);
		}
	}

}
