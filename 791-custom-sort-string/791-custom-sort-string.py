class Solution:
    def customSortString(self, order: str, s: str) -> str:
        cache = defaultdict(lambda:0)
        ans = ""
        for char in s:
            if char not in order:
                ans += char
            cache[char] += 1
        for char in order:
            ans += char * cache[char]
        return ans