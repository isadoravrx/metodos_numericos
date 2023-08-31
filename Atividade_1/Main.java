import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,erroAceit;
        System.out.println("Insira o valor de a:");
        a = sc.nextDouble();
        System.out.println("Insira o valor de b");
        b = sc.nextDouble();
        System.out.println("Insira o valor do erro Aceitável");
        erroAceit = sc.nextDouble();

        bisseccao calculo = new bisseccao();
        calculo.func1(a, b, erroAceit);
        sc.close();
    }
}
