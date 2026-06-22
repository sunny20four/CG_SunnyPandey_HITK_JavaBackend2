package Day6;

public class AccessModifiers {
    public String publicName = "Public";
    private String privateName = "Private";
    protected String protectedName = "Protected";
    String defaultName = "Default";

    public static void main(String[] args) {
        AccessModifiers demo = new AccessModifiers();
        demo.showPrivate();
        System.out.println(demo.publicName);
        System.out.println(demo.protectedName);
        System.out.println(demo.defaultName);
    }

    private void showPrivate() {
        System.out.println(privateName);
    }
}
