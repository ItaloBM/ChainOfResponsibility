package sempadrao.chainofresponsability;

public class SistemaDeJulgamento {

    // O PROBLEMA: A classe precisa conhecer todas as regras e instâncias.
    // Se a FIFA criar uma nova instância acima do Tribunal, teremos que alterar este código.
    public String julgarInfracao(int gravidade) {
        if (gravidade <= 2) {
            return "Juiz de campo aplicou cartão (Amarelo/Advertência).";
        } else if (gravidade == 3) {
            return "VAR recomendou expulsão (Cartão Vermelho).";
        } else if (gravidade >= 4) {
            return "Tribunal Desportivo suspendeu o jogador por vários jogos.";
        }
        return "Infração ignorada.";
    }
}