package Lista05gabi;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		String usuario = lerUsuario();
        String senha = lerSenha();
        
        boolean loginSucesso = validarLogin(usuario, senha);
        mostrarResultado(loginSucesso);
    }

    public static String lerUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        return scanner.nextLine();
    }

    public static String lerSenha() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Password: ");
        return scanner.nextLine();
    }

    public static boolean validarLogin(String user, String pass) {
        // Credenciais estáticas de exemplo: admin / 1234
        return user.equals("admin") && pass.equals("1234");
    }

    public static void mostrarResultado(boolean sucesso) {
        if (sucesso) {
            System.out.println("Acesso Permitido! Bem-vindo ao sistema.");
        } else {
            System.out.println("Acesso Negado! Usuário ou senha incorretos.");
        }
    }

		

	}


