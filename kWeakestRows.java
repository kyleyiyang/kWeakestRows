public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        int[][] arr = {{1,0,0,0},
                     {1,1,1,1},
                     {1,0,0,0},
                     {1,0,0,0}};
        int[] val = new int[arr.length];
        int[] ind = new int[arr.length];
        for (int i=0; i<arr.length;i++) {
            int sum=0;
            for (int j=0;j<arr[i].length;j++) {
                sum+=arr[i][j];
            }
            ind[i] = i;
            val[i]=sum;
            System.out.println("ind="+ind[i]+"; val="+sum);
        }
        System.out.println("\n");
        int m=0;
        for (int n=1;n<val.length;n++) {
            int key = val[n];
            int ind_key = ind[n];
            m=n-1;
            while (m>0 && val[m]>key) {
                val[m+1] = val[m];
                ind[m+1] = ind[m];
                m=m-1;
            }
            val[m+1]=key;
            ind[m+1]=ind_key;
        }
        for (int k=0;k<val.length;k++) {
            System.out.println("ind="+ind[k]+"; val="+val[k]);
        }
     }
}
