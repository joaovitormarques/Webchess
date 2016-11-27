package l�gica;

public class Bishop extends Piece{

	@Override
	public void isValid(Piece[][] spot){
		boolean blocked = false;
		int i;
		int j;
		
		for(i=0; i<8 ; i++){ //resetar a matriz de validade
			for(j=0; j<8; j++){
				valid[i][j] = false;
			}
		}
		
		//Movimentos
		for(i=posx+1, j=posy+1; i<8 && j<8 && !blocked; i++, j++){ //movimento na diadonal ascendente acima
			if(spot[i][j] == null)
				valid[i][j] = true;
			else if(spot[i][j].color != color){
				valid[i][j] = true;
				blocked = true;
			}
			else if(spot[i][j].color == color)
				blocked = true;
		}
		blocked = false;
		for(i=posx-1, j=posy-1; i>=0 && j>=0 && !blocked; i--, j--){ //movimento na diagonal ascendente abaixo
			if(spot[i][j] == null)
				valid[i][j] = true;
			else if(spot[i][j].color != color){
				valid[i][j] = true;
				blocked = true;
			}
			else if(spot[i][j].color == color)
				blocked = true;			
		}
		blocked = false;
		for(i=posx+1, j=posy-1; i<8 && j>=0 && !blocked; i++, j--){ //movimento na diagonal descendente acima
			if(spot[i][j] == null)
				valid[i][j] = true;
			else if(spot[i][j].color != color){
				valid[i][j] = true;
				blocked = true;
			}
			else if(spot[i][j].color == color)
				blocked = true;			
		}
		blocked = false;
		for(i=posx-1, j=posy+1; i>=0 && j<8 && !blocked; i--, j++){ //movimento na diagonal descendente abaixo
			if(spot[i][j] == null)
				valid[i][j] = true;
			else if(spot[i][j].color != color){
				valid[i][j] = true;
				blocked = true;
			}
			else if(spot[i][j].color == color)
				blocked = true;			
		}		
		
	}
	
	Bishop(int x0, int y0, int cor) {
		type = Constants.bishop;
		color = cor;
		posx = x0;
		posy = y0;
		lastMoved = 0;
		isMoved = false;
		isChecked = false;
		movedTwo = false;
	}

	Bishop(Bishop p){ //construtor de c�pia
		type = p.type;
		color = p.color;
		posx = p.posx;
		posy = p.posy;
		lastMoved = p.lastMoved;
		isMoved = p.isMoved;
		isChecked = p.isChecked;
		movedTwo = p.movedTwo;
		
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				valid[i][j] = p.valid[i][j];
			}
		}
		
	}
}
