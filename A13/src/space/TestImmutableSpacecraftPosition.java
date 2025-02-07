package space;

public class TestImmutableSpacecraftPosition {
    public static void main(String[] args) {
        ImmutableSpacecraftPosition imut = new ImmutableSpacecraftPosition(1,2,3);
        ImmutableSpacecraftPosition new_imut = imut.move(4,-5,6);

        System.out.println(imut.toString());
        System.out.println(new_imut.toString());

    }
}
