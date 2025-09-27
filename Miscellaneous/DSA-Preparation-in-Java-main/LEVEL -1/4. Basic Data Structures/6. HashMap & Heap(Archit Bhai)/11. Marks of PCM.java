//https://practice.geeksforgeeks.org/problems/marks-of-pcm2529/1
class Solution
        {
 public  class Pair implements Comparable <Pair>{
  int phys;
  int chem;
   int maths;
        Pair(int phys,int chem,int maths)
        {
            this.phys=phys;
            this.chem=chem;
            this.maths=maths;
        }
        public int compareTo(Pair other)
        {
            if(this.phys!=other.phys)
            return this.phys-other.phys;
            if(this.chem!=other.chem)
            return other.chem-this.chem;
            return this.maths-other.maths;
        }
        
    }
    
    public void customSort (int phy[], int chem[], int math[], int N)
    {
        // your code here
              PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<phy.length;i++)
        {
           
            Pair obj=new Pair(phy[i],chem[i],math[i]);
        pq.add(obj);
           
        }
        
     int i=0;
        while(pq.size()>0)
        {
           Pair ab=pq.remove();
           phy[i]=ab.phys;
           chem[i]=ab.chem;
           math[i]=ab.maths;
           i++;
        }
}
        }
