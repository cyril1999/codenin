public class test232
{
    public static void main(final String[] args) 
    {
         int iarr[] = new int[10];
        iarr[1] = 5;
        iarr = new int[2];
        
System.out.println(iarr[0]);
//iarr here is simply a name used to refer to different arrays
		//It isn't an array by itself but just used as a pointer
    }
}