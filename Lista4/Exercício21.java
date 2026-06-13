package Lista4pack;

public class Exercício21 {

	public static void main(String[] args) {
		
		char[][] jogo = {
			{'X', 'O', 'X'},
			{'O', 'X', 'O'},
			{'X', ' ', 'O'},
		};
		
		for(int i = 0; i < 3; i++) {
			
			for(int j= 0; j < 3; j++) {
				System.out.println(jogo[i][j] + " ");
			}
			
			System.out.println();
			
		}
	}

}
