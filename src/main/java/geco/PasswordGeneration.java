package geco;

import java.util.Random;

/**
 * Created by 21200697 on 23/11/2016.
 */
public class PasswordGeneration {

    /**
     * javadoc mdp aleatoire
     * @return pwd
     */
    String getRandomPassword() {
        String pwd = new String();

        Random r = new Random();

        for (int i = 0; i < 8; i++) {
            pwd = pwd + (char)(r.nextInt(26) + 'a');
        }

        return pwd;
    }
}
