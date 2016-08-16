package mazeGame;

public abstract class Sprite {

	private final char symbol;
	private final int row;
	private final int column;

	public Sprite(char symbol, int row, int column) {
		this.symbol = symbol;
		this.row = row;
		this.column = column;
	}

	public char getSymbol() {
		return this.symbol;
	}

	public int getRow() {
		return this.row;
	}

	public int getColumn() {
		return this.column;
	}

	@Override
	public String toString() {
		return "" + this.symbol;
	}

}
