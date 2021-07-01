class banco {
    String nome;
    int numero;
    String agencia;
    double saldo;
    String data_inicio;

    public banco(String nome, int numero, String agencia, double saldo, String data_inicio) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data_inicio = data_inicio;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getConta() {
        return numero;
    }

    public void deposito(double deposito){
        saldo = saldo + deposito;
        return;
    }

    public void redimentoMensal(){
        if(saldo > 0){
            double calculo_rend = (1.002  * saldo);
            saldo = calculo_rend;
            return;
        }
    }

    public void sacar(double saques){
        if(saques > saldo){
            return;
        }
        if(saques > 0) {
            saldo = saldo - saques;

            return;
        }

    }


}

//Não estou muito envolvida com Java por conta do demoday e estou muito atarefada, porem meu dou uma nota de 6 
//em relação ao Java