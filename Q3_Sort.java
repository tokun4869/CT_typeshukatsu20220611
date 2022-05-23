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

    // �擪���猟������index
    int left = 0;
    // �������猟������index
    int right = array.length - 1;
    // �l����������ۂ̍�ƕϐ�
    int buf;

    // ����index�̈ʒu�֌W���ۂ���Ă���ԁA�J�Ԃ�
    while(left < right) {
      // ��l�ȏ�̒l��������܂Ő擪���猟��
      while(array[left] < pivot) {
        // index�𖖔�����1�i�߂�
        left++;
        // index���z��͈̔͊O�ɂȂ����ꍇ
        if(left >= array.length) {
          break;
        }
      }
      // ��l�����̒l��������܂Ŗ������猟��
      while(array[right] >= pivot) {
        // index��擪����1�i�߂�
        right--;
        // index���z��͈̔͊O�ɂȂ����ꍇ
        if(right < 0) {
          break;
        }
      }
      // �����͈͂��������Ă��Ȃ��ꍇ
      if(left < right) {
        // left�������l��right�������l������
        buf = array[left];
        array[left] = array[right];
        array[right] = buf;
      }
    }

    if(right >= 0){
      // ��l�����̃O���[�v
      int[] small = Arrays.copyOfRange(array, 0, right + 1);
      // ��l�ȏ�̃O���[�v
      int[] big = Arrays.copyOfRange(array, left, array.length);

      if(small.length > 0) {
        // ��l�����̃O���[�v�Ń\�[�g
        small = sort(small);
      }
      if(big.length > 0) {
        // ��l�ȏ�̃O���[�v�Ń\�[�g
        big = sort(big);
      }

      // ��l�����̃O���[�v�̃\�[�g���ʂ𔽉f
      System.arraycopy(small, 0, array, 0, small.length);
      // ��l�ȏ�̃O���[�v�̃\�[�g���ʂ𔽉f
      System.arraycopy(big, 0, array, small.length, big.length);
    }

    // �\�[�g���ʂ�ԋp
    return array;

    // �����܂ŋL�q

  }
}