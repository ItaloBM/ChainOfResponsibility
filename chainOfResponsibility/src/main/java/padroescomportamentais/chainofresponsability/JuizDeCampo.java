package padroescomportamentais.chainofresponsability;

public class JuizDeCampo extends Julgador {
    @Override
    public String julgarInfracao(int gravidade) {
        if (gravidade <= 2) {
            return "Juiz de campo aplicou cartão (Amarelo/Advertência).";
        } else if (proximoJulgador != null) {
            return proximoJulgador.julgarInfracao(gravidade);
        }
        return "Infração sem julgamento.";
    }
}