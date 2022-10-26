public class WordOccurrence {
	public int lineNo, position;

	public WordOccurrence( int position,int lineNo) {
		this.lineNo = lineNo;
		this.position = position;
	}

	public int getLineNo() {
		return lineNo;
	}

	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "WordOccurrence [lineNo=" + lineNo + ", position=" + position + "]";
	}
	
	
}
