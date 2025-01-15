 class akhil{
    int nfact = 1;
    int rfact = 1;
    int nrfact = 1;

    int ncr(int n, int r){
        for(int i = 2; i <= n; i++){
            nfact *= i;
        }
        for(int j = 2; j <= r; j++){
            rfact *= j;
        }
        for(int k = 2; k <= n-r; k++){
            nrfact *= k;
        }
        return nfact/(rfact * nrfact);
    }
}


public class methods_ncr {
    public static void main(String[] args) {

        akhil ak = new akhil();
        int ncr = ak.ncr(7,3);
        System.out.println(ncr);





    
    }
}
