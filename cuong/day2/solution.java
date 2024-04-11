class Solution {
    public String removeKdigits(String num, int k) {
        if (k == 0)
            return num;
        for (int i = 0; i < num.length(); i++) {
            if(k >= num.length()){
                return "0";
            }
            if (i == num.length() - 1) {
                num = num.substring(0, i);
                i = i > 1 ? i - 2 : i - 1;
                k--;
                if (k == 0) {
                    break;
                }
            } else if (Integer.parseInt(num.substring(i, i + 1)) > Integer.parseInt(num.substring(i + 1, i + 2))) {
                num =  remove0AtFirst(num.substring(0, i) + num.substring(i + 1));
                i = i >= 1 ? i - 2 : i - 1;
                k--;
                if (k == 0) {
                    break;
                }
            }
        }
        return num.isEmpty() ? "0" : num;
    }

    public String remove0AtFirst(String num) {
        while (num.length() > 1 && num.charAt(0) == '0') {
            num = num.substring(1);
        }
        return num;
    }
}