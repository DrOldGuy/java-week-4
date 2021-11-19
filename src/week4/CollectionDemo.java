package week4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo {
  public static void main(String[] args) {
    System.out.println(createList());
  }

  private static Set<String> createList() {
    String[] nameArr = {"Frodo", "Bilbo", "Samwise", "Aragorn", "Gandalf"};
//    Set<String> names = new HashSet<>();
    
//    for(String name : nameArr) {
//      names.add(name);
//    }
    
    Set<String> names = Stream.of(nameArr).collect(Collectors.toSet());

    System.out.println(names.getClass().getName());

    return names;
  }
}
