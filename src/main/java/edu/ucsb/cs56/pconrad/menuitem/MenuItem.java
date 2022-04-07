package edu.ucsb.cs56.pconrad.menuitem;

public class MenuItem {

    private String name;
    private int priceInCents;
    private String category;

    /**
     * Custom exception thrown when getPrice is called with a width
     * that is too narrow for the formatted price.
     */

    public static class TooNarrowException extends RuntimeException
    {

    }


    public MenuItem(String name, int priceInCents, String category)
    {
        this.name = name;
        this.priceInCents = priceInCents;
        this.category = category;
    }

    // Getter for the category property

    public String getCategory()
    {
        return this.category;
    }

    // Getter for the name property

    public String getName()
    {
        return this.name;
    }

    /**
     * Returns the price, formatted as a string with a $.
     * For example "$0.99", "$10.99", or "$3.50"
     */

    public String getPrice()
    {
        return "$" + priceInCents/100 + "." + zeroPadding(priceInCents%100);
    }

    /**
     * Returns the price, formatted as a string with a $,
     * right justified in a field with the specified width.
     * For example "$0.99", "$10.99", or "$3.50".
     * <p>
     * If the width is too small, throws TooNarrowException
     *
     * @param width width of returned string
     */

    public String getPrice(int width) throws TooNarrowException
    {
        String priceString = getPrice();
        if (priceString.length() > width)
        {
            throw new TooNarrowException();
        }

        for (int i=priceString.length(); i < width; i++)
        {
            priceString = " " + priceString;
        }
        return priceString;
    }

    private String zeroPadding(int num)
    {
        if (num < 10)
        {
            return "0" + num;
        }
        return String.valueOf(num);
    }

    // Getter for the raw priceInCents property

    public int getPriceInCents()
    {
        return this.priceInCents;
    }

    /**
     * return a string in csv format, in the order name,price,cateogry.
     * For example <code>Small Poke Bowl,1049,Poke Bowls</code>
     *
     * @return string in csv format
     */

    @Override
    public String toString()
    {
        return this.name + "," + this.priceInCents + "," + this.category;
    }
}
