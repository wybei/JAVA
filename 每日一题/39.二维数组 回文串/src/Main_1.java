public class Main_1 {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] array=new int[n*n];
        int startX=0;
        int startY=n-1;
        int index=0;
        while (startX<n){
            int x=startX;
            int y=startY;
            while (x<n&&y<n) {
                array[index++] = arr[x++][y++];
            }
                if (startY>0){
                    startY--;
                }else {
                    startX++;
                }
        }
        return array;
    }
}
