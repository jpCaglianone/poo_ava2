import java.util.*;

public class Navio extends MeiosDeTransporte {

    private String nome;
    private int NumeroTripulantes;
    private String DataLancamento;

    Navio(int a, int b, float c, String nome, int NumeroTripulantes, String DataLancamento){
        super(a, b, c);
        setNome(nome);
        setDataLancamento(DataLancamento);
        setNumeroTripulantes(NumeroTripulantes);

    }

    Navio(){
        super();
    }

    public void setDataLancamento(String dataLancamento) {
        DataLancamento = dataLancamento;
    }
    public String getDataLancamento() {
        return DataLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        NumeroTripulantes = numeroTripulantes;
    }
    public int getNumeroTripulantes() {
        return NumeroTripulantes;
    }


    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Nome: " + getNome());
        System.out.println("Data de lançamento: " + getDataLancamento());
        System.out.println("Total tripulaçao: " + getNumeroTripulantes());
    }

    public float passageirosPorTripulantes(){
        return getNumeroPassageiros()/getNumeroTripulantes();
    }

}