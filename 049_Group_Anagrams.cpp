class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        vector<vector<string>> result;
        map<string, vector<string>> groupMap;
        
        for (auto i=strs.begin(); i!=strs.end(); i++) {
            string thisstr = *i;
            sort(thisstr.begin(), thisstr.end());
            groupMap[thisstr].push_back(*i);
        }
        
        for (auto i=groupMap.begin(); i!=groupMap.end(); i++) {
            //vector<string> vecstr = i->second;
            result.push_back(i->second);
        }
        
        return result;
    }
};