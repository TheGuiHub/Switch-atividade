import java.util.*;
public class  {
    
    public static void main (String args[]){
            float vendas;
            float clientes;
            int horários;
            String mensagem = "Digite um valor válido";
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Qual é o valor da clientela?");
        mesada = entrada.nextFloat();
        
        
        
        System.out.println("Que produto você deseja?");
        
        System.out.println  ("comprar");
        System.out.println  ("ver produtos")
        System.out.println  ("só passando")


        resposta = entrada.nextInt();
        switch(resposta){
            case 1:
            System.out.println("Qual o valor da compra?");
            compra = entrada.nextFloat();
            mesada = mesada - compra;
            
            
            if(mesada < 0){
                    System.out.println("Seu dinheiro na sua conta acabou");
                }
            if(compra > mesada){
                    System.out.println("Você não possui mais dinheiro,por favor voltar uma outra hora");
                    
                    }
            break;     
        
            case 2:
                compra = entrada.nextFloat();
                float totalparc = mesada - compra;
                System.out.println("O saldo da sua conta é de:" + totalparc);
                break;
                
            
                
            case 3:
                System.out.println(Volte sempre.");
                break;
                
            
            default:
                System.out.println(mensagem);
                break;
                        
                
        
        
        }
            
    }
        
}