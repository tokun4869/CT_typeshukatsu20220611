class Main {

    public static void main(String args[]) {
      for (int i = 1; i <= 100; i++) {
        String str = "";
  
        // ��������L�q
  
        // �R�̔{���̏ꍇ
        if (i % 3 == 0) {
            str += "Fizz";    
        }
        // �T�̔{���̏ꍇ
        if (i % 5 == 0) {
            str += "Buzz";
        }
        // �R�ƂT�̔{���ł͂Ȃ��ꍇ
        if (str.equals("")) {
            str = String.valueOf(i);
        }
  
        // �����܂ŋL�q
  
        System.out.println(str);
      }
    }
  }