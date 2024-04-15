class Solution:
    def reverseVowels(self, s: str) -> str:
        # Back pointer
        s = list(s)
        j = len(s) - 1
        for i in range(len(s)):
            if i >= j:
                break
            if s[i].lower() not in ['a', 'e', 'i', 'o', 'u']:
                continue
            while s[j].lower() not in ['a', 'e', 'i', 'o', 'u']:
                j -= 1
            s[i], s[j] = s[j], s[i]
            j -= 1
        return "".join(s)
