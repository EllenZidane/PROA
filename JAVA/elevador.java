class elevador {
    int cpc_elevador;
    int escolhido;
    int andar=0;
    int tot_andar;
    int pessoas;

    
    
    public void setInicializa(int cpc_elevador, int tot_andar) {

        this.cpc_elevador = cpc_elevador;
        this.tot_andar = tot_andar;

    }
    public void sai_pessoas(int pessoas) {
        if (cpc_elevador <= this.pessoas) {
            this.pessoas = pessoas - this.pessoas;
        }
    }

    public void entraPessoa(int pessoas) {
        if (cpc_elevador + pessoas <= this.pessoas) {
            this.pessoas = pessoas + this.pessoas;
        }
    }
    public void sobeAndar(int andar) {
        if (andar >= 0 && this.andar <= tot_andar) {

            this.andar = andar;
        }
    }
        public void desceAndar(int escolhido){
            if (andar > 0 && this.escolhido < tot_andar) {

                this.andar = andar;
            }

        }
    public int getCapacidade_elevador() {
        return cpc_elevador;
    }
    public void setCapacidade_elevador(int cpc_elevador) {
        this.cpc_elevador = cpc_elevador;
    }

    public int getandar() {
        return andar;
    }

    public void setandar(int andar) {
        this.andar = andar;
    }

    public int gettot_andar() {
        return tot_andar;
    }

    public void settot_andar(int tot_andar) {
        this.tot_andar = tot_andar;
    }

    public int getpessoas() {
        return pessoas;
    }

    public void setpessoas(int pessoas) {
        this.pessoas = pessoas;
    }
    }

//Não tive muito tempo para fazer minha própria lógica nessa atividade então utiliei a lógica de meus colegas de classe.
