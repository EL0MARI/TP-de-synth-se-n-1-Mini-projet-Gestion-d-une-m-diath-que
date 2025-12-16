package mediatheque.ui;

import mediatheque.model.Affichable;

public class Afficheur {
    public static void afficherTout(Affichable[] elements){
        for (Affichable a : elements) {
            if (a != null) {
                a.afficherInfos();
            }
        }
    }
}
