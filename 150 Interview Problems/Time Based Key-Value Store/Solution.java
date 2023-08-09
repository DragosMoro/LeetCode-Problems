class Node{
    int timestamp;
    String value;
    Node(int timestamp, String value)
    {
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    Map<String, List<Node>> map;
    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key))
        {
            map.get(key).add(new Node(timestamp, value));
        }
        else{
            List<Node> lista = new ArrayList<>();
            lista.add(new Node(timestamp, value));
            map.put(key,lista);
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key))
        {
            List<Node> list = map.get(key);
            int left = 0;
            int right = list.size()-1;
            int mid = 0;
            String res= "";
            while(left<=right)
            {
                mid = (left+right)/2;
                if(list.get(mid).timestamp<=timestamp)
                {
                    res = list.get(mid).value;
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
            return res;
    }
    else return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */