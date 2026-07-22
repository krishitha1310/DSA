class Solution {
    public String addBinary(String a, String b) {
        int car = 0;
        int lena = a.length() - 1, lenb = b.length() - 1;
        StringBuilder str=new StringBuilder();
        while (lena >= 0 || lenb >= 0 || car != 0) {
            int sum=car;
            if (lena >= 0) {
                sum += a.charAt(lena) - '0';
                lena--;
            }
            if (lenb >= 0) {
                sum += b.charAt(lenb) - '0';
                lenb--;
            }
            str.append(sum%2);
            car=sum/2;
            
        }
       
        return str.reverse().toString();

    }
}