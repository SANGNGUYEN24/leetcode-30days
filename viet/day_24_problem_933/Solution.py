class RecentCounter:
    def __init__(self):
        self.rc = deque()

    def ping(self, t: int) -> int:
        while self.rc and self.rc[0] < t - 3000:
            self.rc.popleft()

        self.rc.append(t)
        return len(self.rc)