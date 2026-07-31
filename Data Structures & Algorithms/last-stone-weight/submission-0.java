class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> bag = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            bag.offer(s);
        }

        while (bag.size() > 1) {
            int first = bag.poll();
            int second = bag.poll();
            if (second != first) {
                bag.offer(first - second);
            }
        }

        bag.offer(0);

        return bag.poll();
    }
}