import java.util.Arrays;
import java.util.stream.IntStream;

class Main {

  public static void main(String[] args) {
    // ランダムに並べられた重複のない整数の配列
    var array = new int[] { 5, 4, 6, 2, 1, 9, 8, 3, 7, 10 };
    // ソート実行
    var sortedArray = new Main().sort(array);
    // 結果出力
    Arrays.stream(sortedArray).forEach(System.out::println);
  }

  private int[] sort(int[] array) {
    // 要素が一つの場合はソートの必要がないので、そのまま返却
    if (array.length == 1) {
      return array;
    }

    // 配列の先頭を基準値とする
    var pivot = array[0];

    // ここから記述

    // 先頭から検索するindex
    int left = 0;
    // 末尾から検索するindex
    int right = array.length - 1;
    // 値を交換する際の作業変数
    int buf;

    // 検索indexの位置関係が保たれている間、繰返し
    while(left < right) {
      // 基準値以上の値が見つかるまで先頭から検索
      while(array[left] < pivot) {
        // indexを末尾側に1つ進める
        left++;
        // indexが配列の範囲外になった場合
        if(left >= array.length) {
          break;
        }
      }
      // 基準値未満の値が見つかるまで末尾から検索
      while(array[right] >= pivot) {
        // indexを先頭側に1つ進める
        right--;
        // indexが配列の範囲外になった場合
        if(right < 0) {
          break;
        }
      }
      // 検索範囲が交差していない場合
      if(left < right) {
        // leftが示す値とrightが示す値を交換
        buf = array[left];
        array[left] = array[right];
        array[right] = buf;
      }
    }

    if(right >= 0){
      // 基準値未満のグループ
      int[] small = Arrays.copyOfRange(array, 0, right + 1);
      // 基準値以上のグループ
      int[] big = Arrays.copyOfRange(array, left, array.length);

      if(small.length > 0) {
        // 基準値未満のグループでソート
        small = sort(small);
      }
      if(big.length > 0) {
        // 基準値以上のグループでソート
        big = sort(big);
      }

      // 基準値未満のグループのソート結果を反映
      System.arraycopy(small, 0, array, 0, small.length);
      // 基準値以上のグループのソート結果を反映
      System.arraycopy(big, 0, array, small.length, big.length);
    }

    // ソート結果を返却
    return array;

    // ここまで記述

  }
}