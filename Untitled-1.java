import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++)
        a[i]=sc.nextInt();
        boolean c=false;
        for(int i=1;i<=n;i++){
           if(a[a[a[i]]]==i){
               c=true;
               break;
           }
        }
        if(c)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}