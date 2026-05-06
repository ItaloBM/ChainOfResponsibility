package padroescomportamentais.chainofresponsability;

public class TribunalDesportivo extends Julgador {
    @Override
    public String julgarInfracao(int gravidade) {
        if (gravidade >= 4) {
            return "Tribunal Desportivo suspendeu o jogador por vários jogos.";
        } else if (proximoJulgador != null) {
            return proximoJulgador.julgarInfracao(gravidade);
        }
        return "Infração sem julgamento.";
    }
}