package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTests {
    //Le poke 1 a + d'attaque que poke 2 -> poke 1

    @Test
    void poke1_plus_attaque_que_poke2_poke1_gagne(){
        Pokemon poke1 = new Pokemon("pokemon1", null,new Stats(80, 100) );
        Pokemon poke2 = new Pokemon("pokemon2", null,new Stats(20, 100) );

        boolean resultat= poke1.estVainqueurContre(poke2);
        assertThat(resultat).isTrue();

    }
    //Le poke 2 a + d'attaque que poke 1 -> poke 2
    @Test
    void poke2_plus_attaque_que_poke1_poke2_gagne(){
        Pokemon poke2 = new Pokemon("pokemon1", null,new Stats(80, 100) );
        Pokemon poke1= new Pokemon("pokemon2", null,new Stats(20, 100) );

        boolean resultat= poke2.estVainqueurContre(poke1);
        assertThat(resultat).isTrue();

    }

    // Les deux on la meme attaque mais poke 1 a plus de defense -> poke 1
    @Test
    void poke1_plus_defense_que_poke2_poke1_gagne(){
        Pokemon poke1 = new Pokemon("pokemon1", null,new Stats(100, 80) );
        Pokemon poke2 = new Pokemon("pokemon2", null,new Stats(100, 20) );

        boolean resultat= poke1.estVainqueurContre(poke2);
        assertThat(resultat).isTrue();

    }

    // Les deux on la meme attaque mais poke 2 a plus de defense -> poke 2

    @Test
    void poke2_plus_defense_que_poke1_poke2_gagne(){
        Pokemon poke2 = new Pokemon("pokemon1", null,new Stats(100, 80) );
        Pokemon poke1 = new Pokemon("pokemon2", null,new Stats(100, 20) );

        boolean resultat= poke2.estVainqueurContre(poke1);
        assertThat(resultat).isTrue();

    }
    // Les deux on la meme attaque et la meme defense -> poke 1

    @Test
    void poke1_poke2_memeDef_memeAttaque_poke1_gagne(){
        Pokemon poke1 = new Pokemon("pokemon1", null,new Stats(100, 100) );
        Pokemon poke2 = new Pokemon("pokemon2", null,new Stats(100, 100) );

        boolean resultat= poke1.estVainqueurContre(poke2);
        assertThat(resultat).isTrue();

    }

}