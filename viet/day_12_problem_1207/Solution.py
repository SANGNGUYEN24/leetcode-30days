class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        check_dict = dict()
        for i in arr:
            check_dict[i] = 0
        for i in range(len(arr)):
            if arr[i] in check_dict:
                check_dict[arr[i]] += 1
        
        rev_dict = {}
        
        for key, value in check_dict.items():
            rev_dict.setdefault(value, set()).add(key)
     
        result = [key for key, values in rev_dict.items()
                                    if len(values) > 1]
        
        if len(result) > 0:
            return False
        return True
        