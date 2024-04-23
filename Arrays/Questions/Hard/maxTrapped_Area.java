class maxTrapped_Area {

    public static int maxArea(int height[]) {
        int maxarea = 0, left = 0, right = height.length-1;

        while (left < right) {

            int rleft = height[left];
            int rRight = height[right];
            int width = right - left;
            int minH = Math.min(rleft, rRight);

            int area = width * minH;
            maxarea = Math.max(maxarea, area);

            // Move the pointers to potentially find a larger container
            if (rleft < rRight) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        System.out.println("Maximum area: " + maxArea(height));

    }
}