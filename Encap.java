public class Encap 
{
  private String name; // private = restricted access

  // Getter
  public String getName()
  {
    return name;
  }

  // Setter
  public void setName(String newName)
  {
    this.name = newName;
  } 
  public static void main(String[] args)
  {
    Encap myObj = new Encap();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}