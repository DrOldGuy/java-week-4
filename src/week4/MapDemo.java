package week4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapDemo {
  public static void main(String[] args) {
    // playingWithMaps();
    Map<String, String> dict = dictionaryStuff();
    dict.entrySet().forEach(entry -> System.out.println(entry));
  }

  private static Map<String, String> dictionaryStuff() {
    Map<String, String> dictionary = new TreeMap<>();

    dictionary.put("syzygy",
        "Astronomy. An alignment of three celestial objects, as the sun, "
        + "the earth, and either the moon or a planet");
    
    dictionary.put("defenestration", "the act of throwing a thing or "
        + "especially a person out of a window");
    
    dictionary.put("kerfuffle", "a fuss; commotion");
    
    dictionary.put("hippopotomonstrosesquippedaliophobia ", "the fear of "
        + "long words");

    return dictionary;
  }

  private static void playingWithMaps() {
    Map<Integer, String> ageNames = createMap();
    System.out.println(ageNames);

    StringBuilder ageBuilder = new StringBuilder();

    for (Integer age : ageNames.keySet()) {
      ageBuilder.append(age).append("-");
    }

    ageBuilder.deleteCharAt(ageBuilder.length() - 1);
    System.out.println(ageBuilder);

    System.out
        .println(ageNames.values().stream().collect(Collectors.joining(", ")));
  }

  private static Map<Integer, String> createMap() {
    List<String> names =
        List.of("Frodo", "Bilbo", "Samwise", "Aragorn", "Gandalf");
    Set<Integer> ages = Set.of(50, 111, 31, 432, 938);
    Map<Integer, String> ageName = new HashMap<>();
    int index = 0;

    for (Integer age : ages) {
      String name = names.get(index);
      ageName.put(age, name);
      index += 1;
    }

    return ageName;
  }
}
