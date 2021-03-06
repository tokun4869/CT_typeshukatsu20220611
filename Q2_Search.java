class Main {

  public static void main(String args[]) {
    // 昇順にソートされた配列
    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
    // 探索対象の番号
    int targetNumber = 7890;
    // 探索実行
    int targetIndex = new Main().serchIndex(sortedArray, targetNumber);
    // 結果出力
    System.out.println(targetIndex);
  }

  private int serchIndex(int[] sortedArray, int targetNumber) {

    // ここから記述

    // 未探索範囲の最小値
    int min = 0;
    // 未探索範囲の最大値
    int max = sortedArray.length - 1;

    while(min <= max){
      // 次に確認するindex
      int index = (max + min) / 2;

      // 探索対象と中間の値が一致した場合
      if(sortedArray[index] == targetNumber) {
        // 探索対象が見つかったのでindexを返却
        return index;
      }
      // 探索対象が中間の値より大きい場合
      else if(sortedArray[index] < targetNumber) {
        // 探索範囲を現在のindex以降にする
        min = index + 1;
      }
      // 探索対象が中間の値より小さい場合
      else{
        // 探索範囲を現在のindex以前にする
        max = index - 1;
      }
    }

    // ここまで記述

    // 探索対象が存在しない場合、-1を返却
    return -1;
  }
}