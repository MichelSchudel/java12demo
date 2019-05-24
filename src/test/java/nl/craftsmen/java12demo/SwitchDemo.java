package nl.craftsmen.java12demo;

import org.junit.Test;

public class SwitchDemo {

    //1. enum tonen
    //2. klassieke switch, laten zien dat je toch een default moet gebruiken
    //3. klassieke switch vervangen door switch expressie, laten ziend at default niet meer nodig is.
    //4. DEvoxx en Devoxxuk samenvoegen
    //5. dubble punten vervangen door expressies.
    //6. system.out.println toevoegen aan eerste tak en multiline statement maken
    //7. laten zien hoe type resolving werkt

    enum Conference {
        JBCNCONF,
        DEVOXX,
        DEVOXX_UK,
    }

    @Test
    public void test_switch() {
        System.out.println(getConference(Conference.JBCNCONF));
        System.out.println(getConferenceExpression(Conference.JBCNCONF));
        System.out.println(getConferenceLambdas(Conference.JBCNCONF));
        System.out.println(getConferenceMultiLabel(Conference.JBCNCONF));
        System.out.println(getConferenceMultiStatement(Conference.JBCNCONF));
        System.out.println(getConferenceTypeResolving(Conference.JBCNCONF));
    }

    public String getConference(Conference conference) {
        switch (conference) {
        case JBCNCONF:
            return "JBCNConf";
        case DEVOXX:
            return "Devoxx";
        case DEVOXX_UK:
            return "Devoxx UK";
        default:
            throw new RuntimeException("unknown type!");

        }
    }

    public String getConferenceExpression(Conference conference) {

        String s = switch (conference) {
            case JBCNCONF:
                break "JBCNConf";
            case DEVOXX:
                break "Devoxx";
            case DEVOXX_UK:
                break "DevoxxUK";
        };
        return s;
    }

    public String getConferenceLambdas(Conference conference) {

        String s = switch (conference) {
            case JBCNCONF -> "JBCNConf";
            case DEVOXX -> "Devoxx";
            case DEVOXX_UK -> "DevoxxUK";
        };
        return s;
    }

    public String getConferenceMultiLabel(Conference conference) {

        String s = switch (conference) {
            case JBCNCONF -> "JBCNConf";
            case DEVOXX, DEVOXX_UK -> "Devoxx";
        };
        return s;
    }

    public String getConferenceMultiStatement(Conference conference) {

        String s = switch (conference) {
            case JBCNCONF -> {
                System.out.println("conference = [" + conference + "]");
                break "JBCNConf";
            }
            case DEVOXX, DEVOXX_UK -> "Devoxx";
        };
        return s;
    }

    public Object getConferenceTypeResolving(Conference conference) {

        Object s = switch (conference) {
            case JBCNCONF -> {
                System.out.println("conference = [" + conference + "]");
                break "JBCNConf";
            }
            case DEVOXX, DEVOXX_UK -> "Devoxx";
            default -> new RuntimeException();
        };
        return s;
    }

}
