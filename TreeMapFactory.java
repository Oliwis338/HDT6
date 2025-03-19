import java.util.*;
class TreeMapFactory implements MapFactory {
    public Map<String, Pokemon> createMap() {
        return new TreeMap<>();
    }
}