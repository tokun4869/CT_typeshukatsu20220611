class Main {

    public static void main(String args[]) {
      for (int i = 1; i <= 100; i++) {
        String str = "";
  
        // ここから記述
  
        // ３の倍数の場合
        if (i % 3 == 0) {
            str += "Fizz";    
        }
        // ５の倍数の場合
        if (i % 5 == 0) {
            str += "Buzz";
        }
        // ３と５の倍数ではない場合
        if (str.equals("")) {
            str = String.valueOf(i);
        }
  
        // ここまで記述
  
        System.out.println(str);
      }
    }
  }