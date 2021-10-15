import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Integer [] tal = {4,1,7,1,2,5,3,7,5,6,4,5,6,7};

        Integer [] nyTal = {12,44,7,7,7,34,22,22,22,54,5,6,7};

        String [] ord = {"nul","et", "to", "tre", "fire","fem"};


        List<String> talord = new ArrayList<>(Arrays.asList(ord));
        List<Integer> talListe = new ArrayList<>(Arrays.asList(tal));


        Set<Integer> A = new HashSet<>(Arrays.asList(tal));
        Set<Integer> B = new HashSet<>(Arrays.asList(nyTal));

        setUdskriv(A);
        setUdskriv(B);

       // A.addAll(B);

        Set<Integer> foreningsmængde = new HashSet<>(A);

        foreningsmængde.addAll(B);

        setUdskriv(foreningsmængde);

        setUdskriv(A);

        Set<Integer> fællesmængde = new HashSet<>(A);

        fællesmængde.retainAll(B);

        setUdskriv(fællesmængde);

        Set<Integer> Aexclusive = new HashSet<>(A);

        Aexclusive.removeAll(B);

        setUdskriv(Aexclusive);


        Set<Integer> symmetriskDifferens = new HashSet<>(foreningsmængde);

        symmetriskDifferens.removeAll(fællesmængde);

        setUdskriv(symmetriskDifferens);


        Set<Integer> hash = new HashSet<>(Arrays.asList(tal));
        Set<Integer> tree = new TreeSet<>(Arrays.asList(tal));
        Set<Integer> liste = new LinkedHashSet<>(Arrays.asList(tal));

        System.out.println("udskriver hashset bemærk ingen orden");
        setUdskriv(hash);

        System.out.println("udskriver treeset bemærk sorteret orden");
        setUdskriv(tree);

        System.out.println("udskriver liste bemærk samme orden som de blev indsat i");
        setUdskriv(liste);



    }

    public static <E> void setUdskriv(Set<E> set) {

        for (E e : set) {

            System.out.println(e);
        }

        System.out.println("\n\n");


    }



    private static <E> void udskriv(List<E> talListe)
    {
        for (E integer : talListe) {

            System.out.println(integer);
        }
        System.out.println("\n\n");
    }


    public static String prepare (String s) {

//        s = fixLinjeSkift(s);
//
//        s = fixMellemrum(s);
//
//        s = rensTekst(s);

        //return s;

        return rensTekst(fixMellemrum(fixLinjeSkift(s)));
    }

    public static String fixMellemrum(String teksten)
    {

        while (teksten.contains("  ")) {
            teksten = teksten.replace("  ", " ");
            // System.out.println(teksten);
        }

        return teksten;
    }


    public static String fixLinjeSkift(String s)
    {

        // s = s.replace("\n" , " \n");

        return s.replace("\n", " \n ");

    }

    public static String rensTekst(String s)
    {

        String specialtegn = "!\"#€%&/()=?*^'.,»«:;–-";
        String[] tegn = specialtegn.split("");

        for (int i = 0; i < tegn.length; i++) {

            s = s.replace(tegn[i], "");

        }

        return s;

    }



}
