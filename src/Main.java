public class Main {
    public static void main(String[] args) {

        int vasyaAge = 1;
        int katyaAge = 1;
        int mishaAge = 10;

        int min = -1;
        int middle = -1;
        int max = -1;

        int maxAge = 120;
        boolean normalVasyaAge = vasyaAge > min && vasyaAge < maxAge;
        boolean normalKatyaAge = katyaAge > min && katyaAge < maxAge;
        boolean normalMishaAge = mishaAge > min && mishaAge < maxAge;

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (vasyaAge > min && vasyaAge < maxAge) {
                System.out.println("Error");
            } else {
                System.out.println("Min age = " + min);
            }
        } else if (vasyaAge >= katyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
            if (!normalKatyaAge) {
                System.out.println("Error");
            } else {
                System.out.println("Min age = " + min);
            }
        } else {
            min = mishaAge;
            if (!normalMishaAge) {
                System.out.println("Error");
            } else {
                System.out.println("Min age = " + min);
            }
        }

        if (vasyaAge >= katyaAge && vasyaAge <= mishaAge ||
                vasyaAge >= mishaAge && vasyaAge <=katyaAge) {
            middle = vasyaAge;
            if (!normalVasyaAge) {
                System.out.println("Error");
            } else {
                System.out.println("Middle age = " + middle);
            }
        } else if (vasyaAge <= katyaAge && katyaAge <= mishaAge ||
                katyaAge >= mishaAge && katyaAge <=vasyaAge) {
            middle = katyaAge;
            if (!normalKatyaAge) {
                System.out.println("Error");
            } else {
                System.out.println("Middle age = " + middle);
            }
        } else {
            middle = mishaAge;
            if (!normalMishaAge) {
                System.out.println("Error");
            } else {
                System.out.println("Middle age = " + middle);
            }
        }

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
            if (!normalVasyaAge) {
                System.out.println("Error");
            } else {
                System.out.println("Max age = " + max);
            }
        } else if (vasyaAge <= katyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
            if (!normalKatyaAge) {
                System.out.println("Error");
            } else {
                System.out.println("Max age = " + max);
            }
        } else {
            max = mishaAge;
            if (!normalMishaAge) {
                System.out.println("Error");
            } else {
                System.out.println("Max age = " + max);
            }
        }
    }
}