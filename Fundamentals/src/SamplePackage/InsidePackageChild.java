package SamplePackage;

public class InsidePackageChild extends InsidePackageBase {

    private int anotherInt;

    public InsidePackageChild(int oneInt, int twoInt) {
        super(oneInt);
        this.anotherInt = twoInt;
    }

    public int getChildInt() {
        return anotherInt;
    }
}
