public static asd{
}
    }

public static int[] findMostPopular(int[] intList) {
    ArrayList<Integer> aList = new ArrayList<>();
    ArrayList<Integer> bList = new ArrayList<>();
    int numberMax = 0;
    int count  = 0;
    int countMax = 0;
    int index = 0;
    for(int k = 0; k < 5; k ++) {
    for (int i = 0; i < intList.length; i++) {
    aList.add(intList[i]);
    }
    for (int i = 0; i < aList.size(); i++) {

    for (int j = 1; j < aList.size(); j++) {
    if (aList.get(i).equals(aList.get(j))) {
    aList.remove(j);
    count = count + 1;
    }
    if (count > countMax) {
    countMax = count;
    numberMax = aList.get(i);
    index = i;
    }
    }
    }
    bList.add(numberMax);
    aList.remove(index);
    }