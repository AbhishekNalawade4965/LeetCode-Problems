class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int turn=0;turn<heights.length-1;turn++){
            for(int j=0;j<heights.length-1-turn;j++){
                if(heights[j]<heights[j+1]){
                    int temp1=heights[j];
                    String temp2=names[j];

                    heights[j]=heights[j+1];
                    heights[j+1]=temp1;

                    names[j]=names[j+1];
                    names[j+1]=temp2;
                }
            }
        }
        return names;
    }
}