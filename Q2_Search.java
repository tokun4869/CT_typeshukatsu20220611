class Main {

  public static void main(String args[]) {
    // �����Ƀ\�[�g���ꂽ�z��
    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
    // �T���Ώۂ̔ԍ�
    int targetNumber = 7890;
    // �T�����s
    int targetIndex = new Main().serchIndex(sortedArray, targetNumber);
    // ���ʏo��
    System.out.println(targetIndex);
  }

  private int serchIndex(int[] sortedArray, int targetNumber) {

    // ��������L�q

    // ���T���͈͂̍ŏ��l
    int min = 0;
    // ���T���͈͂̍ő�l
    int max = sortedArray.length - 1;

    while(min <= max){
      // ���Ɋm�F����index
      int index = (max + min) / 2;

      // �T���Ώۂƒ��Ԃ̒l����v�����ꍇ
      if(sortedArray[index] == targetNumber) {
        // �T���Ώۂ����������̂�index��ԋp
        return index;
      }
      // �T���Ώۂ����Ԃ̒l���傫���ꍇ
      else if(sortedArray[index] < targetNumber) {
        // �T���͈͂����݂�index�ȍ~�ɂ���
        min = index + 1;
      }
      // �T���Ώۂ����Ԃ̒l��菬�����ꍇ
      else{
        // �T���͈͂����݂�index�ȑO�ɂ���
        max = index - 1;
      }
    }

    // �����܂ŋL�q

    // �T���Ώۂ����݂��Ȃ��ꍇ�A-1��ԋp
    return -1;
  }
}