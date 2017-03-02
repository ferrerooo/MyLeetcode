class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        
        int size = digits.size();
        
        for (int i=size-1; i>=0; i--) {
            digits[i] += 1;
            if (digits[i] < 10)
                break;
            digits[i] = 0;
            if (i==0)
                digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};