package heranca;

public class LivroDigital extends Livro {
    private String formato;

    public LivroDigital(String autor) {
        super(autor);
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.15){
            return false;
        }
        //double desconto = this.getValor() * porcentagem;
            //this.setValor(this.getValor() - desconto);

            return super.aplicaDescontoDe(porcentagem);
        }
    public String getFormato() {return formato;}
    public void setFormato(String formato) {this.formato = formato;}
}
