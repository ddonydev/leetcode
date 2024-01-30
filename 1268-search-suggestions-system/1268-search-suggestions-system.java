class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> answer = new ArrayList<>();

        Arrays.sort(products);

        
        for (int i = 0; i < searchWord.length(); i++) {
            List<String> list = new ArrayList<>();
            String prefix = searchWord.substring(0, i + 1);
            for (int j = 0; j < products.length; j++) {
                if (products[j].startsWith(prefix)) {
                    list.add(products[j]);
                }
                if (list.size() == 3) {
                    break;
                }
            }
            answer.add(new ArrayList<>(list));
        }
        return answer;
    }
}