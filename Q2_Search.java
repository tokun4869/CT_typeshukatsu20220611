class Main {

  public static void main(String args[]) {
    // ¸‡‚Éƒ\[ƒg‚³‚ê‚½”z—ñ
    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
    // ’Tõ‘ÎÛ‚Ì”Ô†
    int targetNumber = 7890;
    // ’TõÀs
    int targetIndex = new Main().serchIndex(sortedArray, targetNumber);
    // Œ‹‰Êo—Í
    System.out.println(targetIndex);
  }

  private int serchIndex(int[] sortedArray, int targetNumber) {

    // ‚±‚±‚©‚ç‹Lq

    // –¢’Tõ”ÍˆÍ‚ÌÅ¬’l
    int min = 0;
    // –¢’Tõ”ÍˆÍ‚ÌÅ‘å’l
    int max = sortedArray.length - 1;

    while(min <= max){
      // Ÿ‚ÉŠm”F‚·‚éindex
      int index = (max + min) / 2;

      // ’Tõ‘ÎÛ‚Æ’†ŠÔ‚Ì’l‚ªˆê’v‚µ‚½ê‡
      if(sortedArray[index] == targetNumber) {
        // ’Tõ‘ÎÛ‚ªŒ©‚Â‚©‚Á‚½‚Ì‚Åindex‚ğ•Ô‹p
        return index;
      }
      // ’Tõ‘ÎÛ‚ª’†ŠÔ‚Ì’l‚æ‚è‘å‚«‚¢ê‡
      else if(sortedArray[index] < targetNumber) {
        // ’Tõ”ÍˆÍ‚ğŒ»İ‚ÌindexˆÈ~‚É‚·‚é
        min = index + 1;
      }
      // ’Tõ‘ÎÛ‚ª’†ŠÔ‚Ì’l‚æ‚è¬‚³‚¢ê‡
      else{
        // ’Tõ”ÍˆÍ‚ğŒ»İ‚ÌindexˆÈ‘O‚É‚·‚é
        max = index - 1;
      }
    }

    // ‚±‚±‚Ü‚Å‹Lq

    // ’Tõ‘ÎÛ‚ª‘¶İ‚µ‚È‚¢ê‡A-1‚ğ•Ô‹p
    return -1;
  }
}