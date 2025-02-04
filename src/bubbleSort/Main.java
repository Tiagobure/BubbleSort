package bubbleSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector = new int[100000];
		
		for(int i=0; i< vector.length;i++) {
			vector[i] = (int) (Math.random() * vector.length);
			System.out.println(vector[i]);
		}
		
        long start = System.currentTimeMillis();
        long end;
        
        //BUBBLE SORT O(N^2)
        int aux;
        for(int i = 0; i < vector.length; i++){ // O(N)
            for(int j = i + 1; j < vector.length; j++){ //O(N)
                if (vector[i] > vector[j]){
                    aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                }
            }
        }
        
        end = System.currentTimeMillis();
        System.out.println("Time " + (end-start));

	}

}
