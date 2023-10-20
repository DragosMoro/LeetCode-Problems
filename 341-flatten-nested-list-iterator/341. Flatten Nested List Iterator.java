/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    List<NestedInteger> nestedList;
    int length;
    int current;
    List<Integer> mergedList;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        this.mergedList = new ArrayList<>();
        flattenList(nestedList);
        length=mergedList.size();
        current = -1;
    }


    @Override
    public Integer next() {
        return mergedList.get(current);
    }

    @Override
    public boolean hasNext() {
        if(current+1 <length)
        {
            current++;
            return true;
        }
        return false;
        
    }

    public void flattenList(List<NestedInteger> list) {
        for (NestedInteger ni : list) {
            if (ni.isInteger()) {
                mergedList.add(ni.getInteger());
            } else {
                flattenList(ni.getList());
            }
        }
    }
    
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */