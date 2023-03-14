package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Produto;

public class TesteCliente {

	public static void main(String[] args) {
		
		//Instanciar objetos
		
		Cliente objetoCliente = new Cliente ();
		Endereco objetoEndereco = new Endereco ();
		Produto objetoProduto = new Produto ();
		
		//Entradas Cliente
		objetoCliente.setNome("Gabriel");
		objetoCliente.setIdade(18);
		objetoCliente.setPeso(65);
		objetoCliente.setEndereco(objetoEndereco);
		
		//Entradas Endereco
		objetoEndereco.setLogradouro("Rua apito do vapor");
		objetoEndereco.setBairro("cid. tiradentes");
		objetoEndereco.setMunicipio("São Paulo");
		objetoEndereco.setNumero(11);
		
		//Entradas Produto
		objetoProduto.setTipo("Tenis");
		objetoProduto.setMarca("Adidas");
		
		//Saidas Cliente / Endereco
		System.out.println("Nome: " + objetoCliente.getNome() + 
				"\nIdade: " + objetoCliente.getIdade() +
				"\nPeso: " + objetoCliente.getPeso() +
				"\nLogradouro: " + objetoCliente.getEndereco().getLogradouro() +
				"\nNumero: " + objetoCliente.getEndereco().getNumero() +
				"\nBairro: " + objetoCliente.getEndereco().getBairro() +
				"\nMunicipio: " + objetoCliente.getEndereco().getMunicipio());
		
		//Saidas Produto
		System.out.println("Tipo: " + objetoProduto.getTipo() +
				"\nMarca: " + objetoProduto.getMarca());
		
	
		
		
		
		
	}

}
