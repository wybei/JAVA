import java.util.*;

public class Main19_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int peopleNum=sc.nextInt();
            int option=sc.nextInt();
            List<Student> list=new ArrayList<>();
            for (int i = 0; i <peopleNum ; i++) {
                list.add(new Student(sc.next(),sc.nextInt()));
            }
            if (option==0){
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.score-o1.score;
                    }
                });
            }else if (option==1){
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score-o2.score;
                    }
                });
            }
            for (int i = 0; i <list.size() ; i++) {
                System.out.println(list.get(i).name+" "+list.get(i).score);
            }
        }
    }
}
class Student{
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
