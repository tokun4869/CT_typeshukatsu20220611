class Main {

    public static void main(String args[]) {
      for (int i = 1; i <= 100; i++) {
        String str = "";
  
        // ‚±‚±‚©‚ç‹Lq
  
        // ‚R‚Ì”{”‚Ìê‡
        if (i % 3 == 0) {
            str += "Fizz";    
        }
        // ‚T‚Ì”{”‚Ìê‡
        if (i % 5 == 0) {
            str += "Buzz";
        }
        // ‚R‚Æ‚T‚Ì”{”‚Å‚Í‚È‚¢ê‡
        if (str.equals("")) {
            str = String.valueOf(i);
        }
  
        // ‚±‚±‚Ü‚Å‹Lq
  
        System.out.println(str);
      }
    }
  }