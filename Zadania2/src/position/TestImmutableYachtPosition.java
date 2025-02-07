package position;

public class TestImmutableYachtPosition {
    public static void main(String[] args) {
        ImmutableYachtPosition imyp1 = new ImmutableYachtPosition(32,32,32);
        ImmutableYachtPosition imyp2 = imyp1.move(1,2,3);

        System.out.println(imyp1);
        System.out.println(imyp2);


    }
}
