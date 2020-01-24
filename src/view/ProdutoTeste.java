package view;

import model.bean.Produto;
import model.dao.ProdutoDAO;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		Produto p = new Produto();
		ProdutoDAO dao = new ProdutoDAO();
		p.setNumSequencial(2L);
		p.setDescricao("Lapis");
		p.setQuantidade(10);
		p.setPreco(2.00);
		dao.create(p);
	}

}
