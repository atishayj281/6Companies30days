import java.util.*;
public class CombinationSum3 {
		public static List<List<Integer>> combinationSum3(int k, int n) {
		    List<List<Integer>> result = new ArrayList();
		    combinations(1 , k, n, new LinkedList(), result);
		    return result;
		}
	    
		private static void combinations(int start, int k, int n, LinkedList ll, List<List<Integer>> result) {
		    if(k < 0 || n < 0) return;
		    if(k == 0 && n == 0) {
			result.add(new ArrayList(ll));
			return;
		    }
		    for(int i = start; i<=9; i++) {
			ll.add(i);
			combinations(i+1, k-1, n-i, ll, result);
			ll.removeLast();
		    }
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int k = sc.nextInt();

			List<List<Integer>> result = combinationSum3(k, n);
			for(List<Integer> ls: result) {
				System.out.println(ls);
			}
		}
}
