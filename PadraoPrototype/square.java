class square extends Shape{
   
    public square()
    {
        this.shapeForm = "square";
    }
   
    @Override
    void addShape() 
    {
        System.out.println("square added");
    }
}