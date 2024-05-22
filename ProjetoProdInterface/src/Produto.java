public class Produto {
    public String descricao;
    public String marca;
    private int qtdestoque;
    private double valor;
    
    public int getQTDEstoque(){
        return this.qtdestoque;
    } 
    
    public double getValor(){
        return this.valor;
    }
    
    public void setQTDEstoque(int qtd){
        this.qtdestoque = qtd;
    }
    
    public void setValor(double vlr){
        this.valor = vlr;
    }
    
    public double CalcDesc(){
        if (this.qtdestoque < 50) {
            return this.valor*0.1;
        }
        else {
            return this.valor;
        }
    }
}
