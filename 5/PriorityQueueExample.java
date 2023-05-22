import java.util.Comparator;
import java.util.PriorityQueue;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Comparator를 구현하여 나이(age)를 기준으로 비교
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Integer.compare(person1.getAge(), person2.getAge());
            }
        };

        // 우선순위 큐 생성
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(ageComparator);

        // 우선순위 큐에 Person 인스턴스 추가
        priorityQueue.add(new Person("Alice", 25));
        priorityQueue.add(new Person("Bob", 30));
        priorityQueue.add(new Person("Charlie", 20));

        // 우선순위 큐에서 요소를 가져와 출력
        while (!priorityQueue.isEmpty()) {
            Person person = priorityQueue.poll();
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
