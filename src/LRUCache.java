import java.util.*;

public class LRUCache {

	static Deque<Integer> cache = new LinkedList<Integer>();
	private int cacheSize;

	void addPage(int page) {
		if (!cache.contains(page)) {
			if (cache.size() == cacheSize) {
				cache.removeLast();
			}
		} else {
			boolean removedPage = cache.remove(page);
			System.out.print("Remove Page from index " + removedPage + "\n");
		}
		cache.push(page);
		System.out.print("case push\n");
	}

	public void display() {
		Iterator<Integer> itr = cache.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.print("\n");
	}

	int oldestPage() {
		int oldestPage = cache.getLast();
		return oldestPage;
	}

	void setSize(int cacheSize) {
		this.cacheSize = cacheSize;
	}

	int getMostRecentPage() {
		int newestPage = cache.getFirst();
		return newestPage;
	}

}
