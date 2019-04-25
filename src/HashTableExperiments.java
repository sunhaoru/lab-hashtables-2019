import java.io.PrintWriter;

/**
 * A simple set of experimetns using our new hash tables.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class HashTableExperiments {
  // +-------------+-----------------------------------------------------
  // | Experiments |
  // +-------------+

  /**
   * Explore what happens when we use set with a repeated key.
   */
  public static void repeatedSetExpt(PrintWriter pen,
      HashTable<String, String> htab) {
    // STUB
  } // repeatedSetExpt(PrintWriter, HashTable)

  /**
   * Explore what happens when we use two keys that map to the same location.
   */
  public static void matchingKeysExpt(PrintWriter pen,
      HashTable<String, String> htab) {
    pen.println("Setting anteater");
    htab.set("anteater", "anteater");
    pen.print("Getting buffalo ... ");
    pen.flush();
    try {
      pen.println(htab.get("buffalo"));
    } catch (Exception e) {
      pen.println("Failed because " + e);
    } // try/catch
    htab.dump(pen);
  } // matchingKeysExpt(PrintWriter, HashTable)

  /**
   * Explore what happens when we use set with a wide variety of key/value
   * pairs.
   */
  public static void setExpt(PrintWriter pen, HashTable<String, String> htab) {
    // Word list stolen from some unit test that SamR` wrote earlier.
    String[] words = {"aardvark", "anteater", "antelope", "bear", "bison",
        "buffalo", "chinchilla", "cat", "dingo", "elpehant", "eel",
        "flying squirrel", "fox", "goat", "gnu", "goose", "hippo", "horse",
        "iguana", "jackalope", "kestrel", "llama", "moose", "mongoose",
        "nilgai", "orangutan", "opossum", "red fox", "snake", "tarantula",
        "tiger", "vicuna", "vulture", "wombat", "yak", "zebra", "zorilla"};
    int numwords = words.length;
    for (int i = 0; i < numwords; i++) {
      // htab.dump(pen);
      htab.set(words[i], words[i]);
      for (int j = 0; j <= i; j++) {
        try {
          String str = htab.get(words[j]);
          if (!str.equals(words[j])) {
            pen.println("After setting " + words[i] + ", " + words[j]
                + " no longer yields itself.");
            htab.dump(pen);
            return;
          } // if we didn't get the expected value.
        } catch (Exception e) {
          pen.println("After setting " + words[i] + ", " + words[j]
              + " is no longer in the htabionary.");
          return;
        } // try/catch
      } // for j
    } // for i
  } // setExpt(PrintWriter, HashTable)

  /**
   * Explore what happens when we remove elements.
   */
  public static void removeExpt(PrintWriter pen,
      HashTable<String, String> htab) {
    // STUB
  } // removeExpt(PrintWriter, HashTable)

} // class HashTableExpt
