import java.util.*;
class LinkedHashMapFactory implements MapFactory {
    public Map<String, Pokemon> createMap() {
        return new LinkedHashMap<>();
    }
}