class findcommonarray {
	public static void findCommon(int ar1[], int ar2[], int ar3[])
	{
		int i = 0, j = 0, k = 0;
		while (i < ar1.length   &&  j < ar2.length   && k < ar3.length) {
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.print(ar1[i] + " ");
				i++;
				j++;
				k++;
			}
			else if (ar1[i] < ar2[j])
				i++;
			else if (ar2[j] < ar3[k])
				j++;
			else
				k++;
		}
	}

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 5};
        int[] arr2 = {3, 4, 5, 5, 10};
        int[] arr3 = {5, 5, 10, 20};

         findcommonarray ob = new findcommonarray();
         ob.findCommon(arr1, arr2, arr3);
    }
}
