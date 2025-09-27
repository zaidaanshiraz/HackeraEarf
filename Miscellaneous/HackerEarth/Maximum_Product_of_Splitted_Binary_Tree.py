class Solution:
    def maxProduct(self, root):
        total = self.total(root)
        ans = float('-inf')
        node_sum = 0
        def dfs(node):
            nonlocal node_sum
            if node:
                node_sum += node.val
                dfs(node.left)
                dfs(node.right)
        dfs(root)
        for i in range(1, node_sum // 2 + 1):
            left_sum = node_sum - i
            right_sum = i
            max_product = 1
            def dfs_node(node, total_sum):
                nonlocal max_product
                if node:
                    if total_sum > max_product:
                        max_product = total_sum
                    dfs_node(node.left, total_sum + node.val)
                    dfs_node(node.right, total_sum + node.val)
            dfs_node(root, 0)
            ans = max(ans, left_sum * right_sum * max_product)
        return total - ans