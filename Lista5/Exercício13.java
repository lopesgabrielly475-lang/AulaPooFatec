package Lista05gabi;


public class Exercício13 {
	
	private static String nomePersonagem;
	private static int vida;

	public static void main(String[] args) {
		
		criarPersonagem("Aragorn");
        mostrarStatus();
        
        atacar("Orc");
        receberDano(30);
        mostrarStatus();
        
        curar(15);
        mostrarStatus();
    }

    public static void criarPersonagem(String nome) {
        nomePersonagem = nome;
        vida = 100; // Vida cheia inicial
        System.out.println(nomePersonagem + " entrou na aventura!");
    }

    public static void mostrarStatus() {
        System.out.println("[STATUS] " + nomePersonagem + " - Vida Atual: " + vida);
    }

    public static void atacar(String inimigo) {
        System.out.println(nomePersonagem + " atacou ferozmente o " + inimigo + "!");
    }

    public static void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nomePersonagem + " sofreu " + dano + " de dano!");
    }

    public static void curar(int cura) {
        vida += cura;
        if (vida > 100) vida = 100;
        System.out.println(nomePersonagem + " bebeu uma poção e recuperou " + cura + " de vida!");
    }


	}


