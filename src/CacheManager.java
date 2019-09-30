import java.util.Scanner;

public class CacheManager {

	LRUCache lruCache = new LRUCache();
	Scanner input = new Scanner(System.in);

	public void setCacheSize(int cacheSize) {

		lruCache.setSize(cacheSize);

	}

	void cacheController(int choice) {
		switch (choice)

		{
		case 1: {
			System.out.println("Enter Page in cache");
			int page = input.nextInt();
			lruCache.addPage(page);
			break;
		}
		case 2: {
			int mostRecentPage = lruCache.getMostRecentPage();
			System.out.println("Most Recent page is:" + mostRecentPage);
			break;
		}
		case 3: {
			int oldestPage = lruCache.oldestPage();
			System.out.println("Oldest page is:" + oldestPage);
			break;
		}
		case 4: {
			lruCache.display();

			break;
		}
		default: {
			System.out.println("Please Enter correct option");
		}
		}
	}

}
