import java.util.*;
class JudgingTroubles {
  public static void main(String[] args) {
    intersection();
  }

  public static void intersection() {
      Scanner in = new Scanner(System.in);
      while (in.hasNext()) {
        HashMap<String, Integer> map = new HashMap<>();

        int numSubmissions = in.nextInt();

        String result;
        //number of intersections
        int numInter = 0;

        for (int i = 0; i < numSubmissions; i++) {
            result = in.next();
            map.put(result, map.getOrDefault(result, 0) + 1);
        }

        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < numSubmissions; i++) {
            result = in.next();
            map2.put(result, map2.getOrDefault(result, 0) + 1);
        }

        for(String key : map.keySet()) {
          if (map2.containsKey(key)) {
            numInter += Math.min(map.get(key), map2.get(key));
          }
        }
      System.out.println(numInter);

      }
  }
  

}
