import java.util.*;

public class Aviao extends MeiosDeTransporte {

    private String Prefixo;
    private String DataRevisao;

    Aviao(int a, int b, float c, String Prefixo, String DataRevisao){
        super(a, b, c);
        setPrefixo(Prefixo);
        setDataRevisao(DataRevisao);


    }

    Aviao(){
        super();
    }

    public void setDataRevisao(String DataRevisao) {
        this.DataRevisao = DataRevisao;
    }
    public String getDataRevisao() {
        return DataRevisao;
    }

    public void setPrefixo(String Prefixo) {
        this.Prefixo = Prefixo;
    }
    public String getPrefixo() {
        return Prefixo;
    }



    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Prefixo: " + getPrefixo());
        System.out.println("Data de lançamento: " + getDataRevisao());
        System.out.println("Total tripulaçao: " + getNumeroPassageiros());
    }

    public void reajustarPreco (float reajuste){
        setPreco(getPreco() + (getPreco() * reajuste / 100));
    }

}