class TrieNode:
    def __init__(self):
        self.children = {}
        self.value = 0
        self.missing = None

class Solution:
    def smallestMissingValueSequence(self, parents: List[int]) -> List[int]:
        root = TrieNode()
        for x in sorted(parents):
            node = root
            for i in range(20):
                v = (x >> i) & 1
                if v not in node.children:
                    node.children[v] = TrieNode()
                node = node.children[v]
            node.value += 1
            if node.missing is None or node.missing > x + 1:
                node.missing = x + 1

        res = []
        for x in range(2**20):
            node = root
            for i in range(20):
                v = (x >> i) & 1
                node = node.children[v]
            if node.value == 0:
                res.append(x)
            elif node.missing is not None and node.missing <= x + 1:
                res.append(node.missing - 1)
                node.missing = None

        return res