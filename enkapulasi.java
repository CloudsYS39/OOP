public class enkapulasi {

    public static void main(String[] args) {

        User Coki = new User( "CloudsYS39", "ZA WARUDO", 0, false);

// menggunakan method setter
        Coki.setUsername("CloudsYS39");
        Coki.setPassword("ZA WARUDO");
        Coki.setId(39);
        Coki.setBoolean(false);

// menggunakan method getter
        System.out.println("Username: " + Coki.getUsername());
        System.out.println("Password: " + Coki.getPassword());
        System.out.println("Id:" + Coki.getId());
        System.out.println("status:" + Coki.getBoolean());
    }
}
