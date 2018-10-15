package com.company;

public class Main
{
    /// fields ////////////////
    private String name;
    private String cell;

    /////// constructors ////////////////////
    public Main(String theName, String theCell)
    {
        this.name = theName;
        this.cell = theCell;
    }

    //////////// methods ///////////////////////
    public String getName()
    {
        return this.name;
    }
    public void setName(String theName)
    {
        this.name = theName;
    }

    public String getCell()
    {
        return this.cell;
    }

    public void setCell(String theCell)
    {
        this.cell = theCell;
    }

    public String toString() { return "name: " + this.name +
            ", cell: " + this.cell; }


    //////////// main for testing //////////////
    public static void main(String[] args)
    {
        Main p1 = new Main("Deja", "555 132-3253");
        System.out.println(p1);
        Main p2 = new Main("Avery", "555 132-6632");
        System.out.println(p2);
    }

}