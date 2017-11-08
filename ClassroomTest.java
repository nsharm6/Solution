public class ClassroomTest {

    public static void main(String[] args) {
        Classroom classroom = new Classroom(5, 4);
        
        System.out.println("getRow(5):         " + classroom.getRow(5));
        System.out.println("isDeskTaken(5,2):  " + classroom.isDeskTaken(5, 2));
        System.out.println("placeStudent(5,2): " + classroom.placeStudent(5, 2, "AAA"));
        System.out.println("isDeskTaken(5,2):  " + classroom.isDeskTaken(5, 2));
        System.out.println("getStudent(5,2):   " + classroom.getStudent(5, 2));
        System.out.println("placeStudent(5,2): " + classroom.placeStudent(5, 2, "BBB"));
        System.out.println("getStudent(5,2):   " + classroom.getStudent(5, 2));
        System.out.println("getRow(5):         " + classroom.getRow(5));
        
        // Place four students with names "Tom n" in row 1
        for (int c = 1; c <=4; c++) {
            String name = "Tom " + c;
            classroom.placeStudent(1, c, name);
        }

        System.out.println("getRow(1): " + classroom.getRow(1));
        
        System.out.println("---- Error checking ----");
        
        try {
            classroom.getRow(100);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            classroom.getRow(-200);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            classroom.getStudent(2, 100);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            classroom.getStudent(2, -200);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }   
}