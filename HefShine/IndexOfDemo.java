public class IndexOfDemo {
    public static void main(String[] args) {
        String text = "Hello, world!";
        char element = 'w';
        int index = text.indexOf(element);
        if (index != -1) 
        {
            System.out.println("Element found at index: " + index);
        }
        else 
        {
            System.out.println("Element not found.");
        }
    }
}