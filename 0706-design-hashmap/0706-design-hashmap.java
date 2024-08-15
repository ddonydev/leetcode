class MyHashMap {
    ArrayList<ArrayList<Integer>> list;
    public MyHashMap() {
        list = new ArrayList<>();
    }

    public void put(int key, int value) {
        for (ArrayList<Integer> l : list) {
            if (l.get(0) == key) {
                l.set(1, value);
                return;
            }
        }
        list.add(new ArrayList<>(){{add(key); add(value);}});
    }

    public int get(int key) {
        for (ArrayList<Integer> l : list) {
            if (l.get(0) == key) {
                return l.get(1);
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (ArrayList<Integer> l : list) {
            if (l.get(0) == key) {
                list.remove(l);
                return;
            }
        }
    }
    
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */