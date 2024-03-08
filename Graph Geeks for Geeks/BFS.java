class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer>que=new LinkedList<>();
        ArrayList<Integer>list=new ArrayList<>();
        
        que.add(0);
        
        boolean[] vis=new boolean[V];
        
        while(!que.isEmpty())
        {
            int curr=que.remove();
            
            if(vis[curr]==false)
            {
                list.add(curr);
                
                vis[curr]=true;
                for(int i=0;i<adj.get(curr).size();i++)
                {
                    int e=adj.get(curr).get(i);
                    que.add(e);
                }
            }
        }
        return list;
    }
}
