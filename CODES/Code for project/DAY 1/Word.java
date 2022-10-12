public class Word {
	private String word;
	private int NoW=0;
	private int pos, Line;
	public Word(String word, int noW, int pos, int line) {
		this.word = word;
		NoW++;
		this.pos = pos;
		Line = line;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getNoW() {
		return NoW;
	}
	public void setNoW(int noW) {
		NoW = noW;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getLine() {
		return Line;
	}
	public void setLine(int line) {
		Line = line;
	}
	
	
	
	
}
