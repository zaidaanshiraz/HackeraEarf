class Solution:
    def countValidPaths(self, n: int, edges: List[List[int]], src: int, dest: int) -> int:
        graph = [[] for _ in range(n)]
        for edge in edges:
            graph[edge[0]].append(edge[1])
            graph[edge[1]].append(edge[0])

        dp = [[0, 0] for _ in range(n)]
        visited = [False] * n

        def dfs(node):
            if visited[node]:
                return dp[node]

            visited[node] = True
            children = 0
            for neighbor in graph[node]:
                if neighbor == dest:
                    children += 1
                else:
                    left, right = dfs(neighbor)
                    dp[node][0] += 1 + left
                    dp[node][1] += right
                    children += 1

            return [children, len(graph[node]) - children]

        return dp[src][0]