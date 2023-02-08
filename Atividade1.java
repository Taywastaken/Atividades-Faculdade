
public class Atividade1 {
    
    public static void main(String[] args) {
        //1- Imprimir a raiz de 64:
        System.out.println("Raiz: " + Math.sqrt(64));
        
        //2- Imprimir raiz com exp e log e realint:
        System.out.println("Raiz com log e exp e realint: " + Math.round(Math.sqrt(Math.log(64))));
        
        //3- Imprimir raiz com exp e log sem realint:
        System.out.println("Raiz com log e exp sem realint: " + Math.sqrt(Math.log(64)));
        
        //4- Formatar(sen(45*pi/180) + 0.0001,3):
        double x = Math.sin(45 * 3.14/180)+0.00013;
        System.out.println("Seno: " + Math.toRadians(x));
        
        //5- Imprimir potencia com exp e log e formatar (exp(3*log(8))+0.001,3):
        System.out.println("Potência com log e exp:" + Math.round(Math.pow(2, 3*Math.log(8)) + 0.0013));
        
        //6- Imprimir potencia com exp e log sem formatar: exp(3*1og(8)):
        System.out.println("Potência com log e exp sem formatar:" + (Math.pow(2, 3*Math.log(8)) + 0.0013));
        
        //7- Imprimir potencia com operador ** e formatar: uu,(8**3,3):
        System.out.println("Potência formatada: " + Math.round(Math.pow(8, 3.3)));
        
        //8- Imprimir raiz cubica: exp(1/3*log(8)).
        System.out.println("Potência do logaritmo de 8: " + Math.cbrt(Math.log(8)));
        
        //9- Imprimir absoluto: abs(-8).
        System.out.println("Valor absoluto de -8: " + Math.abs(-8));
        
        //10- Imprimir absoluto: abs(8).
        System.out.println("Valor absoluto de 8: " + Math.abs(8));
        
        //11- Imprima os seguintes números:
        //a) Converter 5,5 para inteiro:
        System.out.println("5,5 para inteiro: " + Math.round(5.5));
        //b) Converter 6,5 para inteiro:
        System.out.println("6,5 para inteiro: " + Math.round(6.5));
        //c) Converter 6,5 + 0,0001 para inteiro:
        System.out.println("6,5 + 0,0001 para inteiro: " + (Math.round(6.5)+0.0001));
        //d) Converter 5,45 para inteiro:
        System.out.println("5,45 para inteiro: " + Math.round(5.45));
        //e) Converter 5,51 para inteiro:
        System.out.println("5,51 para inteiro: " + Math.round(5.51));
        //f) Converter 87 para "real(double)":
        System.out.println("87 para real(double): " + Double.valueOf(87));
        //g) Converter 3/4 para inteiro:
        System.out.println("3/4 para inteiro: " + Math.round(3/4));
    }
    
}
