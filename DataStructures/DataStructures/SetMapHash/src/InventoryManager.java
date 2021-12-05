import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class InventoryManager {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Repository repository = new Repository();
        String[] command = bufferedReader.readLine().split(" ");
        String result = "";
        while (!command[0].equals("end")) {
            if (command[0].equals("add")) {
                result = repository.addProduct(command[1],
                        Double.parseDouble(command[2]),
                        command[3]);
            } else if (command[2].equals("type")) {
                result = repository.filterProductsByType(command[3]);
            } else if (command.length == 7) {
                result = repository.filterProductsFromToPrice(Double.parseDouble(command[4]),
                        Double.parseDouble(command[6]));
            } else if (command[3].equals("to")) {
                result = repository.filterProductsToPrice(Double.parseDouble(command[4]));
            } else if (command[3].equals("from")) {
                result = repository.filterProductsFromPrice(Double.parseDouble(command[4]));
            }
            System.out.print(result);
            command = bufferedReader.readLine().split(" ");
        }

    }

    public static class Repository {
        HashSet<String> allProductsByName = new HashSet<>();
        TreeSet<Product> allProducts = new TreeSet<>();
        Map<String, TreeSet<Product>> allProductsByType = new HashMap<>();

        public String addProduct(String name, double price, String type) {
            if (allProductsByName.contains(name)) {
                return String.format("Error: Item %s already exists%n", name);
            }
            allProductsByType.putIfAbsent(type, new TreeSet<>());
            allProductsByName.add(name);
            Product product = new Product(name, price);
            allProductsByType.get(type).add(product);
            allProducts.add(product);
            return String.format("Ok: Item %s added successfully%n", name);
        }

        public String filterProductsToPrice(double priceTo) {
            return allProducts.stream()
                    .filter(product -> product.getPrice() <= priceTo)
                    .limit(10)
                    .map(Product::toString)
                    .collect(Collectors.joining(", ", "Ok: ", "\n"));
        }

        public String filterProductsFromPrice(double priceFrom) {
            return allProducts.stream()
                    .filter(product -> product.getPrice() >= priceFrom)
                    .limit(10)
                    .map(Product::toString)
                    .collect(Collectors.joining(", ", "Ok: ", "\n"));
        }

        public String filterProductsFromToPrice(double priceFrom, double priceTo) {
            return allProducts.stream()
                    .filter(product -> product.getPrice() <= priceTo && product.getPrice() >= priceFrom)
                    .limit(10)
                    .map(Product::toString)
                    .collect(Collectors.joining(", ", "Ok: ", "\n"));
        }

        public String filterProductsByType(String type) {
            if (!allProductsByType.containsKey(type)) {
                return String.format("Error: Type %s does not exist%n", type);
            }
            return allProductsByType.get(type).stream()
                    .limit(10)
                    .map(Product::toString)
                    .collect(Collectors.joining(", ", "Ok: ", "\n"));
        }
    }


    public static class Product implements Comparable<Product> {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Product o) {
            return Comparator.comparing(Product::getPrice)
                    .thenComparing(Product::getName)
                    .compare(this, o);
        }

        @Override
        public String toString() {
            return String.format("%s(%.2f)", name, price);
        }
    }
}
