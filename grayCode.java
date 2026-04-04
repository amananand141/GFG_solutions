class Solution {
    public ArrayList<String> graycode(int n) {
        ArrayList<String> result = new ArrayList<>();
        
        int total = 1 << n; // 2^n
        
        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1);
            
            // convert to binary string of length n
            String binary = Integer.toBinaryString(gray);
            
            // pad with leading zeros
            while (binary.length() < n) {
                binary = "0" + binary;
            }
            
            result.add(binary);
        }
        
        return result;
    }
}
