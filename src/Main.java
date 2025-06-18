import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("hello");

        Classroom myclassroom = new Classroom("history", "Mr Belvediere");

        myclassroom.addstudent("billy bob thorton");
        myclassroom.addstudent("Nasir Jones");

        System.out.println("Class: " + myclassroom.getClassName());
        System.out.println("professor is" + myclassroom.getInstructorName());

        ArrayList<String> initialCars1 = new ArrayList<>();
        initialCars1.add("Civic");
        initialCars1.add("Accord");

        HondaLocation Seattle = new HondaLocation(
                4500000.00,
                initialCars1,
                44,
                "1011 4th ave, Seattle, WA"
        );

        Seattle.addCar("Pilot");
        Seattle.addCar("CR-V");

        ArrayList<String> initialCars2 = new ArrayList<>();
        initialCars2.add("Accent");
        initialCars2.add("Elantra");

        HondaLocation Portland = new HondaLocation(
                3900000.00,
                initialCars2,
                22,
                "1313 Mockingbird Lane, Portland OR"
        );

        Portland.addCar("Odyssey");
        Portland.addCar("Ridgeline");

        System.out.println("Location 1 Cars: " + Portland.getCars());
        System.out.println("Location 2 Cars: " + Portland.getCars());
    }
}










