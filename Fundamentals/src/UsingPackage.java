import SamplePackage.InsidePackageChild;

public class UsingPackage {

    public static void main(String[] args) {
        InsidePackageChild insidePackageChild = new InsidePackageChild(10, 20);

        System.out.println(insidePackageChild.getBaseInt() + "  " + insidePackageChild.getChildInt());
    }
}
