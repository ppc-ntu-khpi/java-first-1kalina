public class Shirt {
  public int shirtID = 293456; // стандартне значення номера моделі сорочки
  public String description = "Сорочка поло з висоякісної переробної тканини"; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public String colorCode = "Green";
  public double price = 15; // стандартна вартість сорочки
  public int quantityInStock = 50; // стандартна кількість на складі
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description: " + description);
    System.out.println("Color: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу