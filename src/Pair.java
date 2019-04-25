/**
 * Simple, immutable, key/value pairs
 */
public class Pair<K, V> {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The key. May not be null.
   */
  private K key;

  /**
   * The associated value.
   */
  private V value;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new key/value pair.
   */
  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  } // Pair(K,V)

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get the key.
   */
  public K key() {
    return this.key;
  } // key()

  /**
   * Get the value.
   */
  public V value() {
    return this.value;
  } // value()
} // Pair<K,V>
