import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Switch case
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Switch case");
        //int month = scanner.nextInt();
        //var message = switch(month){
            /*case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inexistente");
                break;*/
                /*case 1 -> System.out.println("Janeiro");
                case 2 -> System.out.println("Fevereiro");
                case 3 -> System.out.println("Março");
                case 4 -> System.out.println("Abril");
                case 5 -> System.out.println("Maio");
                case 6 -> System.out.println("Junho");
                case 7 -> System.out.println("Julho");
                case 8 -> System.out.println("Agosto");
                case 9 -> System.out.println("Setembro");
                case 10 -> System.out.println("Outubro");
                case 11 -> System.out.println("Novembro");
                case 12 -> System.out.println("Dezembro");
                default -> System.out.println("Mês inválido");*/

                /*case 1 -> "Janeiro";
                case 2 -> "Fevereiro";
                case 3 -> "Março";
                case 4 -> "Abril";
                case 5 -> "Maio";
                case 6 -> "Junho";
                case 7 -> "Julho";
                case 8 -> "Agosto";
                case 9 -> "Setembro";
                case 10 -> "Outubro";
                case 11 -> "Novembro";
                case 12 -> "Dezembro";
                default -> "Mês inválido";
        };
        System.out.println(message);*/
        //Laço for
        /*for(int i=1;i<=10;i++){
            /*System.out.println("looping for");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o seu nome");
            var name = scanner.next();
            if(name.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println(name);
            System.out.println(i)
        }*/
       //Laço While
            System.out.println("looping While");
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("Digite o seu nome");
                var name = scanner.next();
                System.out.println(name);
                if(name.equalsIgnoreCase("exit")){
                    break;
                }
            }

    }
}
