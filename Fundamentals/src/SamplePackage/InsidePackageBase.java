package SamplePackage;

public class InsidePackageBase {

    private int anInt;
    public InsidePackageBase(int someInt) {
        this.anInt = someInt;
    }

    public int getBaseInt(){
        return anInt;
    }
}
