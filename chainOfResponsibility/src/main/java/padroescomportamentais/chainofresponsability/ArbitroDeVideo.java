package padroescomportamentais.chainofresponsability;

public class ArbitroDeVideo extends Julgador {
    @Override
    public String julgarInfracao(int gravidade) {
        if (gravidade == 3) {
            return "VAR recomendou expulsão (Cartão Vermelho).";
        } else if (proximoJulgador != null) {
            return proximoJulgador.julgarInfracao(gravidade);
        }
        return "Infração sem julgamento.";
    }
}