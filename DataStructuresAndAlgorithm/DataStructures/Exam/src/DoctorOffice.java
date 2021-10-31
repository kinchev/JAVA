import java.util.*;

public class DoctorOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" ");
        LinkedList<String> doc=new LinkedList<>();
        Map<String, Integer> c = new HashMap<>();

        while (!command[0].equals("End")) {
            if (command[0].equals("Append")) {
                String name = command[1];
                doc.add(name);

                c.merge(name, 1, Integer::sum);


                System.out.println("Ok");
            } else if (command[0].equals("Insert")) {
                int position = Integer.parseInt(command[1]);
                String name = command[2];
                if (position == doc.size()) {
                    doc.add(position,name);
                    c.merge(name, 1, Integer::sum);
                    System.out.println("Ok");
                } else if ( position>doc.size()) {
                    System.out.println("Error");
                } else  {
                    doc.add(position,name);
                    c.merge(name, 1, Integer::sum);
                    System.out.println("Ok");
                }

            } else if (command[0].equals("Find")) {
                String name = command[1];
                if (c.containsKey(name)) {

                    System.out.println(c.get(name));
                } else {
                    System.out.println(0);
                }
            }else if (command[0].equals("Examine")) {
                int numberOfPeopleTOExamine = Integer.parseInt(command[1]);
                int queueSize = doc.size();
                if (queueSize < numberOfPeopleTOExamine){
                    System.out.println("Error");
                }
                else {
                    StringBuilder examinedPatients = new StringBuilder();



                    for (int i = 0; i < numberOfPeopleTOExamine-1; i ++){
                        examinedPatients.append(doc.getFirst()+ " ");
                      String remove=  doc.removeFirst();
                    c.merge(remove, 1, (a, b) -> a - b);
                    }
                    examinedPatients.append(doc.getFirst());
                   String remove=doc.removeFirst();
                    c.merge(remove, 1, (a, b) -> a - b);
                    System.out.println(examinedPatients.toString());
                }
            }



            command = scanner.nextLine().split(" ");

        }

    }

}
