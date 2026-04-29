public class ItemCompra {

    private Produto itemProduto;
    private int qtd;

    public ItemCompra(Produto itemProduto, int qtd) {
        if (itemProduto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        if (qtd <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.itemProduto = itemProduto;
        this.qtd = qtd;
    }

    public double getTotalItem() {
        return itemProduto.getPreco() * qtd;
    }

    public Produto getItemProduto() {
        return itemProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public String resumo() {
        return qtd + "x " + itemProduto.getNome() +
               " - Total: R$ " + String.format("%.2f", getTotalItem());
    }
}
