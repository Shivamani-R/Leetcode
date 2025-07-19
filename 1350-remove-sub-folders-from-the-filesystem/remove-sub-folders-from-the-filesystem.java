class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        String prevFolder = ""; 
        
       for (String f : folder) {
           if (prevFolder.isEmpty() || !f.startsWith(prevFolder + "/")) {
                result.add(f); 
                prevFolder = f; 
            }
        }
        
        return result; 
    }

}