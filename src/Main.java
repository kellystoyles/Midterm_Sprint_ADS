import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nOur Family Chores List");

        //create user
        FamilyMember[] familyMember = new FamilyMember[3];
        familyMember[0] = new FamilyMember("Jarrod");
        familyMember[1] = new FamilyMember("Kelly");
        familyMember[2] = new FamilyMember("Hope");

        //add tasks for each user
        familyMember[0].addChore(new Chore("Clean litter box",1, LocalDate.now()));
        familyMember[0].addChore(new Chore("Clean downstairs bathroom",2, LocalDate.now().plusDays(2)));
        familyMember[0].addChore(new Chore("Clean spare bedroom",3, LocalDate.now().plusDays(3)));
        familyMember[0].addChore(new Chore("Vacuum and wash the downstairs floors",2, LocalDate.now().plusDays(1)));
        familyMember[0].addChore(new Chore("Do laundry",1, LocalDate.now().plusDays(1)));

        familyMember[1].addChore(new Chore("Feed the cats",1, LocalDate.now()));
        familyMember[1].addChore(new Chore("Do homework", 1, LocalDate.now().plusDays(10)));
        familyMember[1].addChore(new Chore("Clean master bathroom",3, LocalDate.now().plusDays(2)));
        familyMember[1].addChore(new Chore("Clean master bedroom",3, LocalDate.now().plusDays(2)));
        familyMember[1].addChore(new Chore("Vacuum and wash the upstairs floors",2, LocalDate.now().plusDays(1)));
        familyMember[1].addChore(new Chore("Clean the kitchen",1, LocalDate.now()));
        familyMember[1].addChore(new Chore("Do laundry",4, LocalDate.now().plusDays(1)));


        familyMember[2].addChore(new Chore("Do homework",1, LocalDate.now()));
        familyMember[2].addChore(new Chore("Dust the furniture",4, LocalDate.now().plusDays(2)));
        familyMember[2].addChore(new Chore("Clean main bathroom",2, LocalDate.now().plusDays(2)));
        familyMember[2].addChore(new Chore("Clean your bedroom" , 2, LocalDate.now().plusDays(3)));
        familyMember[2].addChore(new Chore("Empty dishwasher", 1, LocalDate.now()));
        familyMember[2].addChore(new Chore("Do laundry", 3, LocalDate.now().plusDays(1)));
        familyMember[2].addChore(new Chore("Clean litter box when Dad's away",1, LocalDate.now()));

        //marked completed tasks
        familyMember[1].markCompleted("Do homework");
        familyMember[1].markCompleted("Feed the cats");
        familyMember[1].markCompleted("Clean the kitchen");

        familyMember[2].markCompleted("Do homework");
        familyMember[2].markCompleted("Empty dishwasher");
        familyMember[2].markCompleted("Clean litter box when Dad's away");


        //print out each user's tasks
        for (FamilyMember currentMember : familyMember) {
            currentMember.printAllChores();
        }
    }

        }
