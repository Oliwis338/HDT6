import java.util.*;
class HashMapFactory implements MapFactory {
    public Map<String, Pokemon> createMap() {
        return new HashMap<>();
    }
}