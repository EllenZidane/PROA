public class Onibus {

    int onibus;
    String sao_paulo;
    String turismo;
    int paradas;
    int cpc_onibus;
    int pessoas_onibus;

    public Onibus(int onibus, String sao_paulo, String turismo, int paradas, int cpc_onibus, int pessoas_onibus) {
        this.onibus = onibus;
        this.sao_paulo = sao_paulo;
        this.cpc_onibus = cpc_onibus;
        this.pessoas_onibus = pessoas_onibus;
        this.paradas = paradas;
        this.turismo = turismo;

    }

    public int getParadas() {
        return paradas;
    }


  public void setPessoas_onibus(int pessoas_onibus) {
        if (this.pessoas_onibus <= cpc_onibus) {
            this.pessoas_onibus = pessoas_onibus;

        }
    }

    public void saida(int pessoas_onibus) {
        if (pessoas_onibus <= this.pessoas_onibus) {
            this.pessoas_onibus = pessoas_onibus - this.pessoas_onibus;
        }
    }

  public String parar(){

       return 0;
    }

}

//Não tive muito tempo para fazer minha própria lógica nessa atividade
//então utiliei a lógica de meus colegas que me ajudaram na lição.

