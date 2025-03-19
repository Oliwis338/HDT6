import java.util.*;
public class PokemonManager {
    private Map<String, Pokemon> pokemonMap;
    private List<Pokemon> userCollection = new ArrayList<>();

    public PokemonManager(MapFactory factory) {
        this.pokemonMap = factory.createMap();
    }

    public void addPokemon(String name, String type1, String ability) {
        pokemonMap.put(name, new Pokemon(name, type1, ability));
    }

    public void addToUserCollection(String name) {
        if (!pokemonMap.containsKey(name)) {
            System.out.println("Error: Pokémon no encontrado en el dataset.");
            return;
        }
        for (Pokemon p : userCollection) {
            if (p.name.equals(name)) {
                System.out.println("Error: Pokémon ya en la colección.");
                return;
            }
        }
        userCollection.add(pokemonMap.get(name));
    }

    public void showPokemon(String name) {
        System.out.println(pokemonMap.getOrDefault(name, new Pokemon("Desconocido", "N/A", "N/A")));
    }

    public void showUserCollectionByType() {
        userCollection.stream().sorted(Comparator.comparing(p -> p.type1)).forEach(System.out::println);
    }

    public void showAllPokemonByType() {
        pokemonMap.values().stream().sorted(Comparator.comparing(p -> p.type1)).forEach(System.out::println);
    }

    public void showByAbility(String ability) {
        pokemonMap.values().stream().filter(p -> p.ability.equalsIgnoreCase(ability)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        PokemonManager manager = new PokemonManager(new HashMapFactory());
        
        // Ejemplo de datos
        manager.addPokemon("Pikachu", "Electric", "Static");
        manager.addPokemon("Charizard", "Fire", "Blaze");
        
        manager.addToUserCollection("Pikachu");
        manager.showPokemon("Pikachu");
        manager.showUserCollectionByType();
    }
}