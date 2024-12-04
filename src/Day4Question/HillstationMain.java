package Day4Question;

// Superclass HillStations
class HillStations {
    public void location() {
        System.out.println("The location of the hill station is unknown.");
    }

    public void famousFor() {
        System.out.println("The hill station is famous for its beauty.");
    }
}

// Subclass Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its snow-clad mountains.");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its hill views.");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu & Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing.");
    }
}

public class HillstationMain {
    public static void main(String[] args) {
        HillStations hs = new HillStations();
        hs.location();  // Base class method
        hs.famousFor(); // Base class method

        // Calling methods using subclass objects
        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
    }
}
