// méthode main
class ClassRoom {

    public static void main(String[] args) {

        // références vers plusieurs instances de la classe Wilder
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);
        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());
    }

}