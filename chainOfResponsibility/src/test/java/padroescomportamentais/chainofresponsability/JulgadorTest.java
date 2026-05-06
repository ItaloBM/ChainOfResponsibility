package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JulgadorTest {

    private Julgador juiz;
    private Julgador var;
    private Julgador tribunal;

    @BeforeEach
    void setUp() {
        // 1. Instanciamos os elos
        juiz = new JuizDeCampo();
        var = new ArbitroDeVideo();
        tribunal = new TribunalDesportivo();

        // 2. Montamos a corrente de comando! (Juiz -> VAR -> Tribunal)
        juiz.setProximoJulgador(var);
        var.setProximoJulgador(tribunal);
    }

    @Test
    void juizDeveResolverFaltaLeve() {
        // Entregamos o problema para o primeiro da corrente (Juiz)
        String resultado = juiz.julgarInfracao(2);
        assertEquals("Juiz de campo aplicou cartão (Amarelo/Advertência).", resultado);
    }

    @Test
    void varDeveResolverFaltaGrave() {
        // O Juiz vai ver gravidade 3, não vai aguentar e vai passar pro VAR resolver.
        String resultado = juiz.julgarInfracao(3);
        assertEquals("VAR recomendou expulsão (Cartão Vermelho).", resultado);
    }

    @Test
    void tribunalDeveResolverAgressao() {
        // A infração de nível 5 passa pelo Juiz, passa pelo VAR e cai no Tribunal.
        String resultado = juiz.julgarInfracao(5);
        assertEquals("Tribunal Desportivo suspendeu o jogador por vários jogos.", resultado);
    }
}