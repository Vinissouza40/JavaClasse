package classe;


public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		
        Produto p2 = new Produto("Caneta Preta");
        p2.nome = "Caneta Preta2";
        p2.preco = 12.56;
       
        Produto.desconto = 0.29;
        System.out.println(p1.nome);
        System.out.println(p2.nome);
        
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
        System.out.printf("Media do carrinho= R$%.2f.", mediaCarrinho);
	}
}
