package l�gica;

public abstract class Piece {
	
	//figura
	public int type;
	public int color;
	public int posx;
	public int posy;
	public int lastMoved; //Para tratar o caso en passant para peoes
	public boolean movedTwo; //Para tratar o caso en passant para os pe�es
	public boolean isMoved; //Para pe�as com movimentos que dependem de n�o terem sido ainda movidas.
	public boolean isChecked;

	
	public boolean valid[][] = new boolean[8][8];
	
	public void isValid(Piece[][] spot){
	}
	
	Piece() {
	}

}