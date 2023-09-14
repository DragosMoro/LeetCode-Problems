import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    Map<Integer, Integer> map1;
    Map<Integer, Integer> map2;
    public RandomizedSet() {
        this.map1 = new HashMap<>();
        this.map2 = new HashMap<>();

    }
    
    public boolean insert(int val) {
         if (map1.containsKey(val)) {
            return false;
        } else {
            int index = map1.size();
            map1.put(val, index);
            map2.put(index, val);
            return true;
        }
    }
    
    public boolean remove(int val) {
       if (map1.containsKey(val)) {
            int indexToRemove = map1.get(val);
            map1.remove(val);
            map2.remove(indexToRemove);
            for (int i = indexToRemove; i < map1.size(); i++) {
                int shiftedValue = map2.get(i + 1);
                map1.put(shiftedValue, i);
                map2.put(i, shiftedValue);
            }
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {
        int size = map1.size();
        int random = new Random().nextInt(size);
        int res = map2.get(random);
        return res;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */