class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            map.putIfAbsent(seat[0], new HashSet<>());
            map.get(seat[0]).add(seat[1]);
        }

     
        int count = (n - map.size()) * 2;

        for (int row : map.keySet()) {

            HashSet<Integer> seats = map.get(row);

            boolean left = true;  
            boolean middle = true; 
            boolean right = true;  

            for (int j = 2; j <= 5; j++) {
                if (seats.contains(j)) {
                    left = false;
                    break;
                }
            }

            for (int j = 4; j <= 7; j++) {
                if (seats.contains(j)) {
                    middle = false;
                    break;
                }
            }

            for (int j = 6; j <= 9; j++) {
                if (seats.contains(j)) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                count += 2;
            } else if (left || middle || right) {
                count++;
            }
        }

        return count;
    }
}