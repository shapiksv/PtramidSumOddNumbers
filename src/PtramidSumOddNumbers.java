import java.util.ArrayList;



public class PtramidSumOddNumbers {

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(5));
    }

    public static int rowSumOddNumbers (int n) {
    int oddNumber = 0;
    ArrayList<Integer> sumOddNumber = new ArrayList<>();
    if(n == 1){
        oddNumber = n;

    }else {
        int col = 1;
        int crl = 1;
        for (int i = 0; i < n-1 ; i++) {
            col = col + 1;
            crl +=col;

        }
        oddNumber = -1;
        for (int i = 0; i < crl; i++) {
            oddNumber += 2;
            sumOddNumber.add(oddNumber);
        }
        int length =sumOddNumber.size();
        int num = 0;
        for (int i = 0; i < n; i++) {
            length -=1;
            num += sumOddNumber.get(length);

        }
        oddNumber = num;

    }
    return oddNumber;
}
}
