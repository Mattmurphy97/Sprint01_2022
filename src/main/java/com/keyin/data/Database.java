package com.keyin.data;

import java.util.*;
import com.keyin.sprint.*;

public class Database {

    private ArrayList<Members> db = new ArrayList<Members>();
    private ArrayList<Tourney> db2 = new ArrayList<Tourney>();

    public Database() {
        this.db = db;
        this.db2 = db2;

    }

    public ArrayList<Members> getMemberList() {
        return this.db;
    }

    public ArrayList<Tourney> getTourneyList() {
        return this.db2;
    }

    public Members getMemIndex(int indexNum) {
        return db.get(indexNum);
    }

    public Tourney getTourneyIndex(int indexNum) {
        return db2.get(indexNum);
    }

    public void addMemberToDb(Members addMember) {
        db.add(addMember);
    }

    public void addTourneyToDb(Tourney addTourney) {
        db2.add(addTourney);
    }

    public void addTourneyToRegMem(Tourney addTourney) {
        db2.add(addTourney);
    }

    public void checkDbForMemberName(String searchName) {
        for (int i = 0; i < db.size(); i++) {
            String memberName = db.get(i).getMemInfo().getName();
            if (memberName.equals(searchName) == true) {
                System.out.println(db.get(i));
            } else {
                continue;
            }
        }
    }

    public void updateRegMemList(String searchName, String addMemToRegLest) {
        for (int i = 0; i < db2.size(); i++) {
            String memberName = db.get(i).getMemInfo().getName();
            if (memberName.equals(searchName) == true) {
                // db2.get(i).getRegMembers().set(i, memberName)
            }
        }
    }

    public void UpdateDbMemberName(String searchName, String updateName) {
        for (int i = 0; i < db.size(); i++) {
            String memberName = db.get(i).getMemInfo().getName();
            if (memberName.equals(searchName) == true) {
                db.get(i).getMemInfo().setName(updateName);
            } else {
                continue;
            }
        }
    }

    public void checkDbForMemberPhoneNum(String searchNum) {
        for (int i = 0; i < db.size(); i++) {
            String memberNum = db.get(i).getMemInfo().getPhone();
            if (memberNum.equals(searchNum) == true) {
                System.out.println(db.get(i));
            } else {
                continue;
            }
        }

    }

    public void UpdateDbMemberPhoneNum(String searchPhoneNum, String updatePhoneNum) {
        for (int i = 0; i < db.size(); i++) {
            String memberPhoneNum = db.get(i).getMemInfo().getPhone();
            if (memberPhoneNum.equals(searchPhoneNum) == true) {
                db.get(i).getMemInfo().setPhone(updatePhoneNum);
            } else {
                continue;
            }
        }
    }

    public void checkDbForMemberEmail(String searchEmail) {
        for (int i = 0; i < db.size(); i++) {
            String memeberEmail = db.get(i).getMemInfo().getEmail();
            if (memeberEmail.equals(searchEmail) == true) {
                System.out.println(db.get(i));
            } else {
                continue;
            }
        }
    }

    public void UpdateDbMemberEmail(String searchEmail, String updateEmail) {
        for (int i = 0; i < db.size(); i++) {
            String memberPhoneNum = db.get(i).getMemInfo().getEmail();
            if (memberPhoneNum.equals(searchEmail) == true) {
                db.get(i).getMemInfo().setEmail(updateEmail);
            } else {
                continue;
            }
        }
    }

    public void checkDbForTourneyName(String searchTorneyName) {
        for (int i = 0; i < db2.size(); i++) {
            String tourneyName = db2.get(i).getTourneyName();
            if (tourneyName.equals(searchTorneyName) == true) {
                System.out.println(db2.get(i));
            } else {
                continue;
            }
        }
    }

    public void UpdateDbTourneyName(String searchTorneyName, String UpdateTorneyName) {
        for (int i = 0; i < db2.size(); i++) {
            String memberName = db2.get(i).getTourneyName();
            if (memberName.equals(searchTorneyName) == true) {
                db2.get(i).setTourneyName(UpdateTorneyName);
            } else {
                continue;
            }
        }
    }

    public void checkDbForTourneyFee(double searchTorneyFee) {
        for (int i = 0; i < db2.size(); i++) {
            double tourneyFee = db2.get(i).getEntryFee();
            if (tourneyFee == searchTorneyFee) {
                System.out.println(db2.get(i));
            } else {
                continue;
            }
        }
    }

    public void UpdateDbTourneyFee(double searchTorneyFee, double UpdateTorneyFee) {
        for (int i = 0; i < db2.size(); i++) {
            double tourneyFee = db2.get(i).getEntryFee();
            if (tourneyFee == searchTorneyFee == true) {
                db2.get(i).setEntryFee(UpdateTorneyFee);
            } else {
                continue;
            }
        }
    }

    public void checkDbForTourneyPrize(double searchTorneyPrize) {
        for (int i = 0; i < db2.size(); i++) {
            double tourneyPrize = db2.get(i).getCashPrize();
            if (searchTorneyPrize == tourneyPrize) {
                System.out.println(db2.get(i));
            } else {
                continue;
            }
        }
    }

    public void UpdateDbTourneyPrize(double searchTorneyPrize, double updateTorneyPrize) {
        for (int i = 0; i < db2.size(); i++) {
            double tourneyFee = db2.get(i).getCashPrize();
            if (tourneyFee == searchTorneyPrize == true) {
                db2.get(i).setCashPrize(updateTorneyPrize);
            } else {
                continue;
            }
        }
    }

    public void searchNameAndAddTourneyRegList(String searchTorneyName, String addRegMem) {
        for (int i = 0; i < db2.size(); i++) {
            String tourneyName = db2.get(i).getTourneyName();
            if (tourneyName.equals(searchTorneyName) == true) {
                db2.get(i).setRegMembers(addRegMem);
                break;
            } else {
                continue;
            }
        }
    }

    public void searchPhoneNumAndAddTourneyRegList(String searchTorneyName, String addRegMem) {
        for (int i = 0; i < db2.size(); i++) {
            String tourneyName = db2.get(i).getTourneyName();
            if (tourneyName.equals(searchTorneyName) == true) {
                db2.get(i).setRegMembers(addRegMem);
                break;
            } else {
                continue;
            }
        }
    }

    public void searchEmailNumAndAddTourneyRegList(String searchTorneyName, String addRegMem) {
        for (int i = 0; i < db2.size(); i++) {
            String tourneyName = db2.get(i).getTourneyName();
            if (tourneyName.equals(searchTorneyName) == true) {
                db2.get(i).setRegMembers(addRegMem);
                break;
            } else {
                continue;
            }
        }
    }

    public String toString() {
        return "\n" + db;
    }

}
