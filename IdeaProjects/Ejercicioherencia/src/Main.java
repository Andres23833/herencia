public class Main extends Vampiros{
    public static void main(String[] args){
        Vampirooriginal original = new Vampirooriginal();
        Vampirosmodernos modernos = new Vampirosmodernos();

        original.nombre = "pipe";

        original.tipodevampiro = "original";

        original.edad = 1200;

        modernos.nombre = "esteban";

        modernos.tipodevampiro = "moderno";

        modernos.edad = 200;



        System.out.print("nombre:" + original.nombre );

        System.out.print("es:" + original.tipodevampiro );

        System.out.print("nombre:" + modernos.nombre );

        System.out.print(" es" + modernos.tipodevampiro );


    }
}