class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        len_dif = len(word1) - len(word2)
        if len_dif == 0: # same length
            return self.sameLengthMerger(word1, word2)
        elif len_dif < 0: # word1.length < word2.length
            return self.sameLengthMerger(word1, word2[:len(word2)+len_dif]) + word2[len(word2)+len_dif:]
        elif len_dif > 0:
            return self.sameLengthMerger(word1[:len(word1)-len_dif], word2) + word1[len(word1)-len_dif:]
    
    def sameLengthMerger(self, word1, word2):
        merger = ""
        for i in range(len(word1)):
            merger += word1[i]
            merger += word2[i]
        return merger
