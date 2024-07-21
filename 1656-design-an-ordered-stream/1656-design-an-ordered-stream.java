class OrderedStream {
    HashMap<Integer, String> map;
    int ptr;
    public OrderedStream(int n) {
        ptr = 1;
        map = new HashMap<>();
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        if(ptr == idKey){
            list.add(value);
            while(map.containsKey(++ptr)){
                list.add(map.get(ptr));
                map.remove(ptr);
            }
        }else{
            map.put(idKey, value);
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */