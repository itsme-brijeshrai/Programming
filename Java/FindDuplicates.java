import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
    
    public static void main(String[] args) {
        int[] A = {6,3,1,2,2,3,3,4,1,6};
        int N = A.length;
        System.out.println(Arrays.toString(check(N,A)));
    }
    static int[] check(int N, int[] A){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }else{
                map.put(A[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()>1){
                list.add(m.getKey());
            }
        }
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
