class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();

        for (List<String> row : knowledge) {
            map.put(row.get(0), row.get(1));
        }
        int i=0;
        StringBuilder res=new StringBuilder();
        while(i<s.length()){
            char ch=s.charAt(i);
            String temp="";
            int f=0;
            if(ch=='('){
                i++;
                StringBuilder str=new StringBuilder();
                while(s.charAt(i)!=')'){
                    str.append(s.charAt(i));
                    i++;
                }
                if (map.containsKey(str.toString())) {
                    res.append(map.get(str.toString()));
                } else {
                    res.append("?");
                }
                i++;

            }
            else{
                res.append(ch);
                i++;
            }

        }
        return res.toString();
    }
}