public class BuddyInfo {
    /*
    Deliverable 1: .idea and SRC
    Deliverable 2: java.base, java.compiler, java.datatransfer
    Deliverable 3:
    C:\Users\brant\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.5\lib\idea_rt.jar=61984:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.5\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\brant\Desktop\Lab1\out\production\Lab1 BuddyInfo
    Hello World!

    Process finished with exit code 0

    Deliverable 4:
        "C:\Users\brant\Desktop\Lab1\out\production\Lab1\BuddyInfo.class"
    
    */
    private String name;
    private String address;
    private Integer number;

    public BuddyInfo() {
    }

    public BuddyInfo(String name, String address, Integer number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getNumber() {
        return number;
    }


    public static void main(String[] args) {
        //BuddyInfo BuddyInfo1 = new BuddyInfo("Homer", "123 Main St", 123456789);
        //String NameBuddyInfo1 = BuddyInfo1.getName();
        //System.out.println("Hello my name is "+NameBuddyInfo1);
        System.out.println("Hello World!");
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Homer", "123 Main St", 123456789);

    }
}
