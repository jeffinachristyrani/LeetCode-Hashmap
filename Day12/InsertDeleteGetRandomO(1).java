import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    private Map<Integer, Integer> valToIndex;
    private List<Integer> nums;
    private Random rand;

    public RandomizedSet() {
        valToIndex=new HashMap<>();
        nums=new ArrayList<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }
        valToIndex.put(val, nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        
        int indexToRemove=valToIndex.get(val);
        int lastElement=nums.get(nums.size()-1);
        
        nums.set(indexToRemove, lastElement);
        valToIndex.put(lastElement, indexToRemove);
        
        nums.remove(nums.size()-1);
        valToIndex.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        int randomIndex=rand.nextInt(nums.size());
        return nums.get(randomIndex);
    }
}
