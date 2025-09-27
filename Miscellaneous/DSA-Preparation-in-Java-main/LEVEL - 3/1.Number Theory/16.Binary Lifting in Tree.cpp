Leetcode :- https://leetcode.com/problems/kth-ancestor-of-a-tree-node/description/
(Binary lifting in tree ) 
TC- O(logN)
SC- O(N*MAX)
Code 
class TreeAncestor {
public:
 int MAX=17;
vector<vector<int>> table;
    TreeAncestor(int n, vector<int>& parent) {
        table.resize(MAX,vector<int>(n));
        for(int i=0;i<n;i++)
        {
            table[0][i]=parent[i];
        }
        for(int i=1;i<MAX;i++)
        {
            for(int j=0;j<n;j++)
            {
               if (table[i-1][j] != -1)
    table[i][j] = table[i-1][table[i-1][j]];
else
    table[i][j] = -1;
            }
        }
    }
    
    int getKthAncestor(int node, int k) {
        cout<<"1"<<endl;
        for(int i=0;i<MAX && node!=-1;i++)
        {
            int mask=(1<<i);
            if((k&mask)>0)
            {
                node=table[i][node];
            } 
        }
          cout<<"2"<<endl;
        return node;
    }
};

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor* obj = new TreeAncestor(n, parent);
 * int param_1 = obj->getKthAncestor(node,k);
 */