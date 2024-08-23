class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]) {
                    list.add(arr2[i]);
                }
            }
        }

        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if(!list.contains(arr1[i])) {
                tmp.add(arr1[i]);
            }
        }

        int[] answer = new int[list.size() + tmp.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        for (int i = 0; i < tmp.size(); i++) {
            answer[list.size() + i] = tmp.get(i);
        }
        
        return answer;
    }
}