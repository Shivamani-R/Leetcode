class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> x = new HashSet<>();

        for(int num : candyType){
            x.add(num);
        }

        if(x.size() == candyType.length/2){
            return x.size();
        }

        return (x.size() > candyType.length/2) ? candyType.length/2 : x.size();
    }
}