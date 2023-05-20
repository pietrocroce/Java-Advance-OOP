public record Person (String name,int age, String address){
    @Override
    public String toString() {
        return "My name is  "+ name+ " and i am "+ age + " years old. I live in "+ address;
    }
}
