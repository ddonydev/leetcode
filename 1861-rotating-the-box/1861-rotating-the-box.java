class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] answer = new char[box[0].length][box.length];
        int k = box.length - 1;
        for(int i = 0; i < box.length; i++){
            for(int j = box[i].length - 1; j >= 0; j--){
                boolean flag = false;
                if (box[i][j] == '.') {
                    int find = j - 1;
                    while (find >= 0) {
                        if (box[i][find] == '#') {
                            answer[j][k] = '#';
                            box[i][find] = '.';
                            flag = true;
                            break;
                        } else if (box[i][find] == '*') {
                            break;
                        }
                        find--;
                    }
                    if (!flag) {
                        answer[j][k] = box[i][j];
                    }
                }else {
                    answer[j][k] = box[i][j];
                }
            }
            k--;
        }
        return answer;
    }
}