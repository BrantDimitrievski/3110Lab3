import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;
    public AddressBook() {
        this.buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public static void main(String[] args) {

        //System.out.println("Address Book");
        BuddyInfo buddy  = new BuddyInfo("TOM", "CARLETON", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
}
