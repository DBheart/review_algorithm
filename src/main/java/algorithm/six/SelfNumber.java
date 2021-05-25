package algorithm.six;

import java.util.*;

//TODO 어우 어렵다~
//TODO 소거법을 해야하는데 소거법을 안해서 어려워지는 것 같다.
//TODO 아직도 답는것을 잘모르겠다.
public class SelfNumber {
    public Map<Integer, List<Integer>> calculate(int n) {
        Map<Integer, List<Integer>> calList = new HashMap<>();

        for(Integer createNumber=1;createNumber<=n;createNumber++){
            int sum = sum(createNumber);

            if(sum<=n){
                List<Integer> list = calList.get(sum) ==null?new ArrayList<>():calList.get(sum);
                list.add(createNumber);
                calList.put(sum,list);
            }
        }

        return calList;
    }

    private static int sum(Integer i) {
        int sum = i;

        String[] splitNumber = i.toString().split("");
        for(String strNumber:splitNumber){
            sum += Integer.parseInt(strNumber);
        }

        return sum;
    }

    public Integer[] jegment(Map<Integer, List<Integer>> calNumber,int n) {
        int count = 0;

        Set<Integer> notSelfNumber = calNumber.keySet();

        for(int i=1;i<=n;i++){
            if(!notSelfNumber.contains(i)){
                count ++;
            }
        }

        System.out.println(count);
        return null;
    }
}
