import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/**
 * Some utilities for working with iterators.
 */
public class MiscUtils {
  /**
   * Make a new iterator that works just like the given iterator, except that
   * the given function is applied to the result of next.
   */
  public static <T, U> Iterator<U> transform(Iterator<T> iterator,
      Function<? super T, ? extends U> fun) {
    return new Iterator<U>() {
      public boolean hasNext() {
        return iterator.hasNext();
      } // hasNext()

      public U next() {
        return fun.apply(iterator.next());
      } // next()

      public void remove() {
        iterator.remove();
      } // remove()
    }; // new Iterator
  } // transform(Iterator, Function)
} // class MiscUtils
