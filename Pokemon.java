public class Pokemon {
    String name;
    String type1;
    String ability;

    public Pokemon(String name, String type1, String ability) {
        this.name = name;
        this.type1 = type1;
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "Pokemon{name='" + name + "', type1='" + type1 + "', ability='" + ability + "'}";
    }
}