public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //
    public void prova(int age){
       this.age = age;
        String x = String.valueOf(age);
        System.out.println(x.hashCode());
    }
    @Override
    public int hashCode() {
      //  return ( name + age + address).hashCode();
        return (name.hashCode())+ age + (address.hashCode());
    }

    @Override
    public String toString() {
        return ("il mio nome è "+ name + ", ho "+ age + " e se vuoi venire a prendere un caffè, mi trovi al "+ address);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
