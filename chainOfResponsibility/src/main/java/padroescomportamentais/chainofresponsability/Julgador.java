package padroescomportamentais.chainofresponsability;

public abstract class Julgador {
    protected Julgador proximoJulgador;

    public void setProximoJulgador(Julgador proximo) {
        this.proximoJulgador = proximo;
    }

    public abstract String julgarInfracao(int gravidade);
}