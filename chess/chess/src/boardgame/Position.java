package boardgame;

public class Position {
	//class attributes
	private int row;
	private int column;
	//constructor
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	//get set
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	//toString
	@Override
	public String toString() {
		return row + ", " + column;
	}
	//methods

}

