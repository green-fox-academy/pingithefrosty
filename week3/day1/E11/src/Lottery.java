import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class Lottery {
  public static void main(String[] args) {
    Path path = Paths.get("otos.csv");
    try {
      List<String> original = Files.readAllLines(path);
      List<Integer> numbersInteger = new ArrayList<>();
      List<String> numbersString = new ArrayList<>();
      for (int i = 0; i < original.size() ; i++) {
        String str = original.get(i);
        for (int k = 11; k < 15; k++) {
          String result = str.substring(ordinalIndexOf(str, ";", k) + 1, ordinalIndexOf(str, ";", k + 1));
          numbersString.add(result);
        }
        String result = str.substring(str.lastIndexOf(";")+1);
        numbersString.add(result);
      }
      for(String s : numbersString) {
        numbersInteger.add(Integer.valueOf(s));
      }
      System.out.println(fiveMostCommon(numbersString));



    } catch (IOException e) {
      System.out.println("Converting is not succesful.");
    }
  }

  private static String fiveMostCommon(List<String> numbersString) {
    List<Integer> result = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<>();
    String tempStr;
    for (int i = 0; i < numbersString.size(); i++)
    {
      tempStr = numbersString.get(i);
      if(map.containsKey(tempStr))
      {
        map.put(tempStr, map.get(tempStr) + 1);
      }
      else
      {
        map.put(tempStr, 1);
      }
    }
    ValueComparator bvc =  new ValueComparator(map);
    TreeMap<String,Integer> sorted_map = new TreeMap<>(bvc);
    sorted_map.putAll(map);
    for (int i = 1; i < 4 ; i++) {
      sorted_map.g(i)
    }
    return result.toString();
  }

  static class ValueComparator implements Comparator<String> {
    HashMap<String, Integer> base;
    public ValueComparator(HashMap<String, Integer> base) {
      this.base = base;
    }
    public int compare(String a, String b) {
      if (base.get(a) >= base.get(b)) {
        return -1;
      } else {
        return 1;
      } // returning 0 would merge keys
    }
  }

  public static int ordinalIndexOf(String str, String substr, int n) {
    int pos = str.indexOf(substr);
    while (--n > 0 && pos != -1)
      pos = str.indexOf(substr, pos + 1);
    return pos;
  }
}
