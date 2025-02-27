record Alien (int id, String name) {
    public Alien {
        if(id == 0)
            throw new IllegalArgumentException("0 can't be used as a id.");
    }
}

public class UsingRecords {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Jorge");
        Alien a2 = new Alien(0, "Carmen");
        System.out.println(a1);
    }
}
