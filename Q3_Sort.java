import java.util.Arrays;
import java.util.stream.IntStream;

class Main {

  public static void main(String[] args) {
    // �����_���ɕ��ׂ�ꂽ�d���̂Ȃ������̔z��
    var array = new int[] { 5, 4, 6, 2, 1, 9, 8, 3, 7, 10 };
    // �\�[�g���s
    var sortedArray = new Main().sort(array);
    // ���ʏo��
    Arrays.stream(sortedArray).forEach(System.out::println);
  }

  private int[] sort(int[] array) {
    // �v�f����̏ꍇ�̓\�[�g�̕K�v���Ȃ��̂ŁA���̂܂ܕԋp
    if (array.length == 1) {
      return array;
    }

    // �z��̐擪����l�Ƃ���
    var pivot = array[0];

    // ��������L�q


    // �����܂ŋL�q

  }
}