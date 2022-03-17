import java.util.Scanner;

public class SubSequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.nextLine();

        int n = str.length();
        SubSequence sub = new SubSequence();
        sub.sequence(str, 0, n-1);
    }

    private void sequence(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                sequence(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char charTemp;
        char[] charArray = a.toCharArray();
        charTemp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = charTemp;
        return String.valueOf(charArray);
    }

}