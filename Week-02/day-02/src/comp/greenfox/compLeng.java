package comp.greenfox;

public class compLeng {
    public static void main(String[] args) {
        int[] p1 = {1,2,3};
        int[] p2 = {4,5};


        System.out.println(count(p1));
        System.out.println(count(p2));
        if (count(p1) > count(p2)){
            System.out.println("p1 has more elements");
        } else if ( count(p1) < count2(p2)){
            System.out.println("p2 has more elements");
        }
    }

    private static int count(int[] p1)
    {
        int count = 0;
        for(int i : p1)
        {
            if(i > 0)
            {
                count++;
            }
        }
        return count;
    }
    private static int count2(int[] p2)
    {
        int count2 = 0;
        for(int i : p2)
        {
            if(i > 0)
            {
                count2++;
            }
        }
        return count2;
    }
}
// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`