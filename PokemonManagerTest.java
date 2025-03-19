import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PokemonManagerTest {
    private PokemonManager manager;

    @BeforeEach
    void setUp() {
        manager = new PokemonManager(new HashMapFactory());
        manager.addPokemon("Pikachu", "Electric", "Static");
        manager.addPokemon("Charizard", "Fire", "Blaze");
    }

    @Test
    void testAddToUserCollection() {
        manager.addToUserCollection("Pikachu");
        assertEquals(1, manager.userCollection.size());
    }

    @Test
    void testShowPokemon() {
        Pokemon pikachu = manager.pokemonMap.get("Pikachu");
        assertNotNull(pikachu);
        assertEquals("Electric", pikachu.type1);
    }
}
