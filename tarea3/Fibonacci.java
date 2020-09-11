class Fibo
{
    public static void main(String args[])
    {
        int n = 0;
        int V1 = 0;
        int V2 = 1;
        while (n < 10) 
        {          
            int V3 = V1 + V2; 
            System.out.println(V3);     
            V1 = V2;
            V2 = V3;
            n++;
        }        
    }

}