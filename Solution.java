public class Solution {
    private int numerator;
    private int denominator;

    public void setNumerator( int numerator) {
        this.numerator= numerator;
    }
    public void setDenominator(int denominator){
        this.denominator= denominator;
    }

    public int getNum(){
        return numerator;
    }
    public int getDeno(){
        return denominator;
    }

    public Solution(int num, int deno){
        this.numerator = num;
        this.denominator= deno;
    }
    
    public static int GCD(int a, int b) {
        while (a * b != 0) {
            if (a > b) {
                // a chia b
                a %= b;
            } else {
                // b chia a
                b %= a;
            }
        }
        return a+b;
    }

    public void reduce(){
        int min = GCD(this.numerator, this.denominator);
        this.numerator = this.numerator / min;
        this.denominator = this.denominator / min;
    }

    public void add(Solution b) {
        this.numerator= this.numerator * b.denominator + this.denominator* b.numerator;
        this.denominator = this.denominator * b.denominator;
    }
    public void subtract(Solution b) {
        this.numerator= this.numerator * b.denominator - this.denominator* b.numerator;
        this.denominator = this.denominator * b.denominator;
    }
    public void multiply(Solution b) {
        this.numerator= this.numerator * b.numerator;
        this.denominator = this.denominator * b.denominator;
    }
    public void devide(Solution b) {
        this.numerator= this.numerator * b.denominator ;
        this.denominator = this.denominator * b.numerator;
    }

    public boolean equals(Object obj){
        if( obj instanceof Solution) {
            Solution other = (Solution) obj;
            this.subtract(other);
            if(this.numerator == 0) return true;
        } 
        return false;

    }

    public static void main( String[] args){
        Solution a = new Solution(5, 10);
        Solution b = new Solution(1, 2);
        if(a.equals(b)) System.out.print("Yes");
    }
}
