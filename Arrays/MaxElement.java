//Problem - Finding max element from the array

public static int maxElement(int a[]){
        int maxele = a[0];
        for(int i=1;i<a.length;i++){
            if(maxele<a[i]){
                maxele = a[i];
            }
        }
        return maxele;
    }
