import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cacheSize;
		int choice;
		Scanner input = new Scanner(System.in);
		CacheManager cacheManager = new CacheManager();
		System.out.println("Please Enter the size of cache");
		cacheSize = input.nextInt();
		cacheManager.setCacheSize(cacheSize);
		while (true) {
			System.out.println(
					"Select 1 -> Add new Page \nSelect 2 -> Get Most Recent Page \nSelect 3 -> Get Oldest Page\nSelect 4 -> Display Page in Cache");
			choice = input.nextInt();
			cacheManager.cacheController(choice);
		}

	}

}
