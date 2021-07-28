class circle extends Shape
{
    public circle() 
    {
        this.shapeForm = "circle";
    }
   
    @Override
    void addShape() 
    {
        System.out.println("circle added");
    }
      
}