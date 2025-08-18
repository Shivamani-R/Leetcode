class Solution {
    public boolean judgePoint24(int[] cards) {
        double card[]=new double[4];
        for(int i=0; i<4; i++) {
            card[i]=cards[i];
        }
        return solve(card);
    }

    boolean solve(double cards[]) {
        if(cards.length==1) return Math.abs(cards[0]-24) < 0.001;

        int n=cards.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {

                double rem[]=new double[n-1];
                int idx=0;
                for(int k=0; k<n; k++) {
                    if(k!=i && k!=j) {
                        rem[idx++]=cards[k];
                    }
                }

                double a=cards[i];
                double b=cards[j];

                double comp[]={a+b,a-b,b-a,a*b,a/b,b/a};

                for(double res:comp) {
                    rem[rem.length-1]=res;
                    if(solve(rem)==true) return true;
                }

            }
        }

        return false;
    }
}