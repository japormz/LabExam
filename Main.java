package labexam;
import java.util.*;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	static Queue<String> queue = new LinkedList<>();
	
	
	

	public static void main(String[] args) {
		int choice;
	
    do {
    	System.out.println("\n ==== PERMUTATIONS ====");
    	System.out.println("[1] Add elements to Queue");
    	System.out.println("[2] Display Queue");
    	System.out.println("[3] Generate Permutation");
    	System.out.println("[4] Enter Choice: ");
    	choice = input.nextInt();
    	
    	
    	switch(choice) {
    	case 1 -> addElements();
    	case 2 -> displayQueue();
    	case 3 -> generatePermutation();
    	case 4 -> System.out.println("Program Terminated");
    	default -> System.out.println("Program Invalid");
    	
    	}
    }while (choice != 4);
    
}
        static void addElements() {
        	System.out.println("How many elements: ");
        	int n = input.nextInt();
        	for(int i = 0; i < n; i++) {
				System.out.println("Elements " + (i + 1) + ": ");
        		queue.add(queue.element());
        	}
        }
    	
        static void displayQueue() {
        	if(queue.isEmpty()) {
        		System.out.println("Queue is empty");
        	} else {
        		System.out.println("Queue" + queue + "| Front: " + queue.peek());
        		
        	}
		
	}
        static void generatePermutation() {
			System.out.println("Queue: " + queue);
			System.out.print("Enter number of elements to arrange: ");
			int r = input.nextInt();
			
			List<String> list = new ArrayList<>(queue);
			Queue<String> q = new LinkedList<>();
			q.add("");
			int count = 0;
			
			while (!q.isEmpty()) {
				String curr = q.poll();
				if(curr.length() == r) {
					System.out.println(curr);
					count++;
			  } else {
					for (String s : list) {
						if(!curr.contains(s) == q.add(curr + s));
					}
				}
			}
			System.out.println("Total Permutation: " + count);
	
}
        
}


