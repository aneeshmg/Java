package com.aneeshmg;

public class Inherited extends Base {
    private String childName;

    public Inherited(String parentName, String childName) {
        super(parentName);
        this.childName = childName;
    }

    public String getChildName() {
        return childName;
    }

    public String getFullName() {
        return this.getParentName() + this.getChildName();
    }
}
