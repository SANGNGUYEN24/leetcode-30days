class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        # 3 is non adjacents for 1 place - odd
        # 4 is non adjacents for 1 place - even
        # 5, 6 is non adjacents for 2 place - odd, even
        # Finding the empty space: O(n)
        if n == 0:
            return True

        if len(flowerbed) == 1:
            if flowerbed[0] == 0:
                return True
            return False
        
        i = 0
        empty_space = []
        while i < len(flowerbed):
            if flowerbed[i] == 0:
                rem = i
                while flowerbed[i] == 0:
                    i += 1
                    if i >= len(flowerbed):
                        break
                empty_space.append((rem, i))
            i += 1
            
        # Calculating the space
        available_space = 0
        for j in empty_space:
            if j[0] == 0 and j[1] == len(flowerbed):
                return int((j[1] - j[0] + 1) / 2) >= n
            elif j[0] == 0 or j[1] == len(flowerbed):
                available_space += int((j[1] - j[0]) / 2)
            else:    
                available_space += int((j[1] - j[0] - 1) / 2)
        
        return available_space >= n