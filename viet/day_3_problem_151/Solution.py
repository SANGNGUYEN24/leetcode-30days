class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.split(" ")
        return " ".join(x for x in reversed(s) if x != "")