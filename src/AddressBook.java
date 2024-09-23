import java.util.ArrayList;
//making changes in the cloned code
public class AddressBook {

    private ArrayList<BuddyInfo> buddies;
    public AddressBook() {
        this.buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        if(buddy != null) {buddies.add(buddy);}
    }
    public BuddyInfo removeBuddy(int index){
        if(index>=0 && index <buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {

        //System.out.println("Address Book");
        BuddyInfo buddy  = new BuddyInfo("TOM", "CARLETON", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }
}


/**
 * NOTES:
 *
 * 5. What is the value of the size variable?
 * buddies size = 0
 *
 * 7. Has the value of the size value changed? If so what is the new value?
 * buddies size = 1
 *
 * https://github.com/BrantDimitrievski/3110Lab3.git
 *
 */