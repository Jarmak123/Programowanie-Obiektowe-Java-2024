package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital szpital = new Hospital("Dupa",50);
        Hospital szpital1 = new Hospital("Dupa2",32);
        Clinic klinika1 = new Clinic("Dupsko",50,32);
        Clinic klinika2 = new Clinic(null, 320,-3);
        Clinic klinika3 = new Clinic("Alahambra",32,100);

        System.out.println(szpital.equals(szpital1));


    }
}
