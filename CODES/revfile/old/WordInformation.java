public class WordInformation {
	String word;
	linkedList<WordOccurrence> occList;
	int size;
	public WordInformation(String word, WordOccurrence g) {
		this.word = word;
		this.size = 0;
		this.occList = new linkedList();
		addOcc(g.position,g.lineNo);
	}
	public void addOcc(int pos,int line) {
		occList.insert( new WordOccurrence(pos,line));
		size++;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public linkedList<WordOccurrence> getOccList() {
		return occList;
	}
	public void setOccList(linkedList<WordOccurrence> occList) {
		this.occList = occList;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void display() {
		System.out.println("Word: "+ getWord() );
		System.out.println("Size: "+ getSize() );
		System.out.println("WordOccurrence: ");
		occList.display();
	}
	@Override
	public String toString() {
		return "WordInformation [word=" + getWord()  + getSize() + "]";
	}
	}