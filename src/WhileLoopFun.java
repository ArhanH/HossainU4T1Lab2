public class WhileLoopFun {
    public WhileLoopFun() { }

    public void printDigits(int number) {
        while(number != 0){
            int num1 = number;
            num1 = number % 10;
            number = number / 10;
            System.out.println(num1);
        }
    }

    public int countLetter(String word, String letter) {
        int index1 = 0;
        int start = 0;
        while(index1 != word.length()){
            if(word.substring(index1, index1+1).equals(letter)){
                start++;
            }
            index1++;
        }
        return start;
    }

    public int maxDoubles(int number, int threshold) {
        int start = 0;
        while(number <= threshold){
            number *= 2;
            if(number <= threshold){
                start++;
            }
        }
        return start;
    }

    public boolean isPrime(int number) {
        if(number == 1){
            if(number == 1){
                return false;
            }
        }
        else{
            int divide = 2;
            while(divide < number){
                if(number % divide==0){
                    return false;
                }
                divide++;
            }
        }
        return true;
    }
}
