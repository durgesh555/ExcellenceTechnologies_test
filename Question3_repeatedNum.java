import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
 class FindRepeatedNumber{
    Integer[] array= new Integer [101];
    Integer[] setArray(int t){
        for (int i=0;i<101;i++){
            array[i]=i;
        }
        array[t-1]=t;
        return array;
    }
    private<Integer> Set<Integer>findDuplicates(Collection<Integer> collection){
        Set<Integer> duplicates=new LinkedHashSet();
        Set<Integer> uniques= new HashSet();
        for(Integer t : collection){
            if(!uniques.add(t)){
                duplicates.add(t);
            }
        }
        return duplicates;
    }

     public static void main(String []args){
       FindRepeatedNumber findRepeatedNumber = new FindRepeatedNumber();
       findRepeatedNumber.setArray(55);
       
       Set<Integer> set= findRepeatedNumber.<Integer>findDuplicates(Arrays.asList(findRepeatedNumber.array));
       for(Integer i : set){
           System.out.println(i);
       }
     }
}