package InterviewCode;

public class RemoveDuplicatesFromSortedArrayII
{
    public static int removeDuplicates(int[] A)
    {
        if (A.length <= 2)
        {
            return A.length;
        }
        int pre = 1;
        int cur = 2;
        while (cur < A.length)
        {
            if (A[cur] == A[pre] && A[cur] == A[pre - 1])
            {
                cur++;
            }
            else
            {
                A[++pre] = A[cur++];
            }
        }
        return pre + 1;
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3 };
        System.out.println(removeDuplicates(A));
    }
}
