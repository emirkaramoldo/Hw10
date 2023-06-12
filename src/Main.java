public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Guitarist"), createObject("Vocalist"),
                createObject("Drummer")};
        for (Printable printable : printables) {
            assert printable != null;
            printable.print();
        }
    }

    public static Musician createObject(String className) {
        switch (className) {
            case "Guitarist":
                return new Guitarist("Amir", 4, "Gibson Les Paul", "Solo guitarist");
            case "Vocalist":
                return new Vocalist("Adel", 5, "Sennheiser", "Tenor");
            case "Drummer":
                return new Drummer("Arsen", 2, "Percussion", 200);
        }
        return null;
    }
}