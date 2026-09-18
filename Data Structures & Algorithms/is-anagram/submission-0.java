class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Long> frequencyOfS = s.chars()
                .mapToObj(c -> (char) c)                
                .collect(java.util.stream.Collectors.groupingBy(
                        java.util.function.Function.identity(), 
                        java.util.stream.Collectors.counting() 
                ));

        Map<Character, Long> frequencyOfT = t.chars()
                .mapToObj(c -> (char) c)                
                .collect(java.util.stream.Collectors.groupingBy(
                        java.util.function.Function.identity(), 
                        java.util.stream.Collectors.counting() 
                ));        

        if(frequencyOfS.equals(frequencyOfT))
            return true;
        else
            return false;    
    }
}
