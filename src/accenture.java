public class accenture {
    public  static git int minjumps(int input1,int[] input2) {
        if(input2.length==1)
        {
          return 0;
        }
        int arr[] = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < input1; i++) {
            for (int j = i + 1; j <= i + input2[i]; j++) {

                if (j < input2.length) {
                    arr[j] = Math.min(1 + arr[i], arr[j]);
                }
            }
        }

        return arr[input2.length - 1] - 1;
    }

    public static void main(String[] args) {
        int arr[]={2,1,1};
        int input1=3;
        System.out.println(minjumps(input1,arr));
    }
}
