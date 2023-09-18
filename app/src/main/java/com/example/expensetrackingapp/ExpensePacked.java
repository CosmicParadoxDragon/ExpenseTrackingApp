package com.example.expensetrackingapp;

public class ExpensePacked {
    ExpensePacked () {
        mName = "";
        mDesc = "";
        mCost = 0.0f;
        mCostString = "";
    }
    private String mName;
    private String mDesc;
    private String mCostString;
    private float mCost;
    void setName (String name) { mName = name; }
    void setDesc (String desc) { mDesc = desc; }
    void setCost (String cost) { mCostString = cost; mCost = Float.parseFloat(cost); }
    String getName () { return mName; }
    String getDesc () { return mDesc; }
    String getStringCost () { return mCostString; }
    float getCost () { return mCost; }
}
