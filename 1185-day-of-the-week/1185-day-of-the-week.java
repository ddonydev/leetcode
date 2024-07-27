class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        if(month == 1 || month == 2){
            month += 12;
            year -= 1;
        }

        int result = (day + (13 * (month + 1) / 5) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) - ((year / 100) * 2)) % 7;

        if(result < 0){
            result += 7;
        }
        
        String[] dayOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        return dayOfWeek[result];
        
    }
}

