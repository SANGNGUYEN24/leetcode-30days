class Solution:
    # string with smaller len will likely be checked for common divisor
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        gcd = str1 if len(str1) < len(str2) else str2
        big_str = str1 if gcd == str2 else str2
        encode = "2"

        if gcd * int(len(big_str)/len(gcd)) == big_str:
            return gcd
        for i in range(len(gcd), 1, -1):
            for j in self.smaller_len(gcd, i):
                try:
                    new_str1 = str1.replace(j, encode)
                    new_str2 = str2.replace(j, encode)
                    new_str1 = int(new_str1)
                    new_str2 = int(new_str2)
                    return j
                except:
                    continue
        
        return ""

    def smaller_len(self, gcd, target_len):
        sub_gcd = []
        for i in range(len(gcd) - target_len):
            if gcd[i:i+target_len] not in sub_gcd:
                sub_gcd.append(gcd[i:i+target_len])
        return sub_gcd