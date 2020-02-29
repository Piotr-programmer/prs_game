public class Main {

    /*
    Zrób pętlę, która wywołuje bitwy pomiędzy graczami i przerywa, jeżeli któryś zdobywa 3 punkty.
    Każdy przebieg pętli powinien drukować:
    - wyświetlić typy ataku i obrony obu graczy
    - wyświetlić czy się udały ataki obu graczy
    - zadeklarować komu przydziela punkt (albo, że runda jest bez punktu)
     */

    public static void main(String args[]) {
        Player one = new Player();
        Player two = new Player();

        /// pętla
        {
            /// print
        }
    }

    void prepare(Player one, Player two) {
        one.randomAttack();
        one.randomDefense();
        two.randomAttack();
        two.randomDefense();
    }

    void battle(Player one, Player two) {
        if ( (Type.attackSuccess(one.getAttack(), two.getDefence()))
          && (!Type.attackSuccess(two.getAttack(), one.getDefence())) ) {
            /// print
            one.addPoint();
        } else if ( (!Type.attackSuccess(one.getAttack(), two.getDefence()))
                 && (Type.attackSuccess(two.getAttack(), one.getDefence())) ) {
            /// print
            two.addPoint();
        }
    }
}
