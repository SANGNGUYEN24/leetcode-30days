class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
        if n == 2:
            return 1
        tribo = [0, 1, 1]
        for i in range(3, n + 1):
            tribo.append(sum(tribo[i - 3:]))
        return tribo[-1]
        