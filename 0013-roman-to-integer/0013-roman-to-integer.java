class Solution {
    public int romanToInt(String s) {
        int i=s.length()-1,sum=0;
        while(i>=0){
            char ch=s.charAt(i);
            switch(ch){
                case 'I':
                    sum+=1;
                    i--;
                    break;
                case 'V':
                    if(i!=0&&s.charAt(i-1)=='I'){
                        sum+=4;
                        i=i-2;
                        break;
                    }
                    else{
                        sum+=5;
                        i--;
                        break;
                    }
                case 'X':
                    if(i!=0&&s.charAt(i-1)=='I'){
                        sum+=9;
                        i=i-2;
                        break;
                    }
                    else{
                        sum+=10;
                        i--;
                        break;
                    }
                case 'L':
                    if(i!=0&&s.charAt(i-1)=='X'){
                        sum+=40;
                        i=i-2;
                        break;
                    }
                    else{
                        sum+=50;
                        i--;
                        break;
                    }
                case 'C':
                    if(i!=0&&s.charAt(i-1)=='X'){
                        sum+=90;
                        i-=2;
                        break;
                    }
                    else{
                        sum+=100;
                        i--;
                        break;
                    }
                case 'D':
                    if(i!=0&&s.charAt(i-1)=='C'){
                        sum+=400;
                        i-=2;
                        break;
                    }
                    else{
                        sum+=500;
                        i--;
                        break;
                    }
                case 'M':
                    if(i!=0&&s.charAt(i-1)=='C'){
                        sum+=900;
                        i-=2;
                        break;
                    }
                    else{
                        sum+=1000;
                        i--;
                        break;
                    }
            }   
        }
        return sum;
    }
}