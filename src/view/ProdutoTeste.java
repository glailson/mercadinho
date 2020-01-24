package view;

import model.bean.Produto;
import model.dao.ProdutoDAO;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		Produto p = new Produto();
		ProdutoDAO dao = new ProdutoDAO();
		p.setNumSequencial(3L);
		p.setDescricao("Caneta");
		p.setQuantidade(15);
		p.setPreco(3.00);
		dao.create(p);
	}

}
