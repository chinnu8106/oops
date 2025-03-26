public class {
   private String car_color;
   private String car_brand;
   private String fuel_type;
   private String mileage;

   public Car() {
   }

   public void start() {
      System.out.println("car is started");
   }

   public void stop() {
      System.out.println("car is stopped");
   }

   public void service() {
      System.out.println("car is for service");
   }

   public static void main(String[] var0) {
      Car var1 = new Car();
      var1.car_color = "white";
      var1.car_brand = "audi";
      var1.fuel_type = "petrol";
      var1.mileage = "20";
      var1.start();
      System.out.println("car_color: " + var1.car_color + " car_brand: " + var1.car_brand + " fuel_type: " + var1.fuel_type + " mileage: " + var1.mileage);
      Car var2 = new Car();
      var2.car_color = "black";
      var2.car_brand = "bmw";
      var2.fuel_type = "petrol";
      var2.mileage = "40";
      var2.stop();
      System.out.println("car_color: " + var2.car_color + " car_brand: " + var2.car_brand + " fuel_type: " + var2.fuel_type + " mileage: " + var2.mileage);
      Car var3 = new Car();
      var3.car_color = "white";
      var3.car_brand = "ferrari";
      var3.fuel_type = "diesel";
      var3.mileage = "30";
      var3.service();
      System.out.println("car_color: " + var3.car_color + " car_brand: " + var3.car_brand + " fuel_type: " + var3.fuel_type + " mileage: " + var3.mileage);
   }
}
