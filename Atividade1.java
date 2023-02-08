
public class Atividade1 {
    
    public static void main(String[] args) {
        System.out.println("Raiz: "+Math.sqrt(64));
        
        System.out.println("Raiz com log e exp e realint: " + Math.round(Math.sqrt(Math.log(64))));
        System.out.println("Raiz com log e exp sem realint: " + Math.sqrt(Math.log(64)));
        
        double x = Math.sin(45 * 3.14/180)+0.00013;
        System.out.println("Seno: " + Math.toRadians(x));
        
        System.out.println("Potência com log e exp:" + Math.round(Math.pow(2, 3*Math.log(8)) + 0.0013));
        System.out.println("Potência com log e exp sem formatar:" + (Math.pow(2, 3*Math.log(8)) + 0.0013));
        
        System.out.println("Potência formatada: " + Math.round(Math.pow(8, 3.3)));
        
        System.out.println("Potência do logaritmo de 8: " + Math.cbrt(Math.log(8)));
        
        System.out.println("Valor absoluto de -8: " + Math.abs(-8));
        System.out.println("Valor absoluto de 8: " + Math.abs(8));
        
        System.out.println("5,5 para inteiro: " + Math.round(5.5));
        System.out.println("6,5 para inteiro: " + Math.round(6.5));
        System.out.println("6,5 + 0,0001 para inteiro: " + (Math.round(6.5)+0.0001));
        System.out.println("5,45 para inteiro: " + Math.round(5.45));
        System.out.println("5,51 para inteiro: " + Math.round(5.51));
        
        System.out.println("87 para real(double): " + Double.valueOf(87));
        
        System.out.println("3/4 para inteiro: " + Math.round(3/4));
    }
    
}
