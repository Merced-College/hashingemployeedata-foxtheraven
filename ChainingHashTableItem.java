//Xandra Quevedo
//11/6/25
//ChainingHashTableItem.java - code from zyBook

public class ChainingHashTableItem<K, V> {
   public K key;
   public V value;
   public ChainingHashTableItem<K, V> next;

   public ChainingHashTableItem(K itemKey, V itemValue) {
      key = itemKey;
      value = itemValue;
      next = null;
   }
}