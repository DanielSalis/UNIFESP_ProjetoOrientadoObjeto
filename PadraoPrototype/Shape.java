abstract class Shape implements Cloneable
{
      
    protected String shapeForm;
       
    abstract void addShape();
       
    public Object clone()
    {
        Object clone = null;
        try 
        {
            clone = super.clone();
        } 
        catch (CloneNotSupportedException e) 
        {
            e.printStackTrace();
        }
        return clone;
    }
}
  