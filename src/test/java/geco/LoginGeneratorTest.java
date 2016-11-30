package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        String[] t = {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"};
        LoginService test = new LoginService(t);

        LoginGenerator l = new LoginGenerator(test);
        //l.generateLoginForNomAndPrenom("ROL","Jean");

        //assertEquals(l.generateLoginForNomAndPrenom("Durant","Paul"),"PDUR");
        //assertEquals(l.generateLoginForNomAndPrenom("Roll","Jean"),"JROL1");
        //assertEquals(l.generateLoginForNomAndPrenom("Dùrant","Paul"),"PDUR");

        assertEquals(l.generateLoginForNomAndPrenom("Ralling","Jean"),"JRAL2");
        assertEquals(l.generateLoginForNomAndPrenom("Du","Paul"),"PDU");
    }
}