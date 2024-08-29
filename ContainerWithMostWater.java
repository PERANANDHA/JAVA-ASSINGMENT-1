public class ContainerWithMostWater{
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water container area: " + container.maxArea(height1));
        int[] height2 = {1, 1};
        System.out.println("Maximum water container area: " + container.maxArea(height2));
    }
}
