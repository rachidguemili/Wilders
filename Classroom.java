public class Classroom{


public static void main(String[] args) {
    

    Wilder rachidG = new Wilder("Rachid",true);
    System.out.println(rachidG.whoAmI());

    Wilder brianE = new Wilder("Brian",true);
    System.out.println(brianE.whoAmI() );

    // on change pour les deux etudiants ils ne so,t plsu awrae

    brianE.setAware(false);
    System.out.println(brianE.whoAmI());
    rachidG.setAware(false);
    System.out.println(rachidG.whoAmI());


}


}