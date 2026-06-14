class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        for(int i = 0; i < n; i++){
            int high = 0;
            for(int j = i + 1; j < n; j++){
                if(temperatures[j] > temperatures[i]){
                    high = j - i;
                    break;
                }
            }

            temperatures[i] = high;
        }

        return temperatures;
    }
}
