package CCT.Summa;

public class Subsequences {
    public static void findSubsequences(String str, String ans, int index) {
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }

        // Include the current character
        findSubsequences(str, ans + str.charAt(index), index + 1);

        // Exclude the current character
        findSubsequences(str, ans, index + 1);
    }

//    public static void findsequences(String str){
//        int n=(int)Math.pow(2,str.length());
//        String[] arr=new String[n];
//        for(int i=0;i<n;i++){
//            for(int j)
//        }
//    }

    public static void main(String[] args) {
        String str = "vel";
        System.out.println("All Subsequences:");
        findSubsequences(str, "", 0);
    }
}

