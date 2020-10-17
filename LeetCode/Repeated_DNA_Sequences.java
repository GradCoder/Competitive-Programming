class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap();
        if(s.length()<10)
        {
            return list;
        }
        
        int len =0;
        while(len+10 <= s.length())
        {
            map.put(s.substring(len,len+10),map.getOrDefault(s.substring(len,len+10),0)+1);
            len = len + 1;
        }
        
        for(Map.Entry<String,Integer> m : map.entrySet())
        {
            if(m.getValue()>1)
                list.add(m.getKey());
        }
        return list;
    }
}
