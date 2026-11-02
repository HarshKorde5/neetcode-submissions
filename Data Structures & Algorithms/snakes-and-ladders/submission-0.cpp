
class Solution {
   public:
    int snakesAndLadders(vector<vector<int>>& board) {
        int n = board.size();
        vector<int> dist(n * n + 1, -1), q = {1};

        dist[1] = 0;

        for (int h = 0; h < q.size(); h++) {
            int current = q[h];

            if (current == n * n) {
                return dist[current];
            }

            for (int landing = current + 1; landing <= min(current + 6, n * n); landing++) {

                int layer = (landing - 1) / n, col = (landing - 1) % n, row = n - 1 - layer;

                if (layer % 2) col = n - 1 - col;

                int target = board[row][col] == -1 ? landing : board[row][col];
                
                if (dist[target] == -1) {
                    dist[target] = dist[current] + 1;
                    q.push_back(target);
                }
            }
        }
        return -1;
    }
};
