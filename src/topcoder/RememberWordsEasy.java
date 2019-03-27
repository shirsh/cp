public class RememberWordsEasy
{
    public String isPossible(int d1, int d2, int w1, int w2) {
        for (int i = 0; i <= w1; i++) {
            long minS1 = getS(i, d1, -1, w1);
            long maxS1 = getS(i, d1, 1, w1);
            boolean isValid1 = w1 >= minS1 && w1 <= maxS1;
            boolean isValid2 = false;

            for (int j = -1; j <= 1; j++) {
                if(i + j < 0 || i + j > w2) continue;
                int a = i + j;
                long minS2 = getS(a, d2, -1, w2);
                long maxS2 = getS(a, d2, 1, w2);
                isValid2 = w2 >= minS2 && w2 <= maxS2 || isValid2;
            }

            if(isValid1 && isValid2) return "Possible";
        }

        return "Impossible";
    }

    private long getS(int a, int n, int d, int max) {
        int l = (a + (n - 1) * d);
        if(l > max) {
            int n1 = max - a + 1;
            return (((long)(a + max) * n1) / 2) + ((n - n1) * max);
        } else if(l < 0) {
            return (((long)(a + 1) * a) / 2);
        }
        return ((long)(a + l) * n) / 2;
    }
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, boolean hasAnswer, String p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3);
		System.out.println("]");
		RememberWordsEasy obj;
		String answer;
		obj = new RememberWordsEasy();
		long startTime = System.currentTimeMillis();
		answer = obj.isPossible(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p4 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p4);
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}
	public static void main(String[] args) {
		boolean all_right;
		all_right = true;
		
		int p0;
		int p1;
		int p2;
		int p3;
		String p4;
		
		// ----- test 0 -----
		p0 = 2;
		p1 = 3;
		p2 = 7;
		p3 = 18;
		p4 = "Possible";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 1;
		p1 = 1;
		p2 = 3;
		p3 = 5;
		p4 = "Impossible";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = 5;
		p2 = 300;
		p3 = 500;
		p4 = "Possible";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 100;
		p1 = 1;
		p2 = 0;
		p3 = 2;
		p4 = "Impossible";
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 1000000;
		p1 = 1000000;
		p2 = 1000000;
		p3 = 1000000;
		p4 = "Possible";
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 82;
		p1 = 7135;
		p2 = 5913;
		p3 = 5413;
		p4 = "Possible";
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!