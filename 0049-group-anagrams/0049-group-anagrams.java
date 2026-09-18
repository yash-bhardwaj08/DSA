class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            char[] arr = strs[i].toCharArray(); // converting string too array
            Arrays.sort(arr); // sorting ef tea --> aet

            String key = new String(arr); // after sorting this will make the string

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>()); // make new list if the key dint matches
            }
            map.get(key).add(strs[i]); // "aet" → ["eat"] normal state
        }
    return new ArrayList<>(map.values()); // take values only from the hashmap
    }
}