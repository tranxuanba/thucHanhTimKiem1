public class BinarySearch {
    static int[] list = {2,3,4,5,6,7,8,12,34,56,78};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length - 1;

        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (key < list[mid]){
                hight = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 33));
        System.out.println(binarySearch(list, 45));
    }
}
