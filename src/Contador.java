import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro: ");
		int p1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o segundo parâmetro: ");
		int p2 = Integer.parseInt(sc.nextLine());
		
		try {
			contar(p1, p2);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			sc.close();
		}
	}
	
	public static void contar(int p1, int p2) throws ParametrosInvalidosException {
		if (p1 > p2) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		else {
			
			int contagem = p2 - p1;
			
			for(int i=1; i<=contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
			
		}
	}

}
