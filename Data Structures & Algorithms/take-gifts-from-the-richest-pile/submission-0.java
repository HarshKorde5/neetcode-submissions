class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int g: gifts){
            heap.offer(g);
        }

        while(k != 0){
            int pile = heap.poll();
            heap.offer((int)Math.floor(Math.sqrt(pile)));
            k--;
        }

        
        long sum = 0;
        while(!heap.isEmpty()){
            sum += heap.poll();
        }

        return sum;

    }
}