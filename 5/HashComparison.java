import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashComparison {

    public static void main(String[] args) {
        
        // 요소 추가: 
        // HashSet은 요소를 추가할 때 순서를 유지하지 않습니다. 반면에 LinkedHashSet은 요소를 추가한 순서대로 유지합니다. 
        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("date");
        hashSet.add("elderberry");
        hashSet.add("fig");
        hashSet.add("grape");

        System.out.println("HashSet:");
        System.out.println(hashSet);

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("cherry");
        linkedHashSet.add("date");
        linkedHashSet.add("elderberry");
        linkedHashSet.add("fig");
        linkedHashSet.add("grape");

        System.out.println("LinkedHashSet:");
        System.out.println(linkedHashSet);

        // 중복 요소 추가: 
        // HashSet과 LinkedHashSet 모두 중복된 요소를 허용하지 않습니다. 
        // HashSet에 중복된 요소를 추가하면 아무런 변화가 없지만, 
        // LinkedHashSet에 중복된 요소를 추가하면 순서가 유지된 채 유지됩니다.
        // Add duplicate element
        System.out.println("Add duplicate element:");
        hashSet.add("banana");
        linkedHashSet.add("banana");
        System.out.println("HashSet after adding duplicate element:");
        System.out.println(hashSet);
        System.out.println("LinkedHashSet after adding duplicate element:");
        System.out.println(linkedHashSet);

        // 요소 제거: 
        // HashSet에서 요소를 제거하면 요소들이 재정렬됩니다. 
        // 반면에 LinkedHashSet에서 요소를 제거하면 요소의 순서가 유지된 채 삭제됩니다.
        // Remove element
        System.out.println("Remove element:");
        hashSet.remove("elderberry");
        linkedHashSet.remove("elderberry");
        System.out.println("HashSet after removing element:");
        System.out.println(hashSet);
        System.out.println("LinkedHashSet after removing element:");
        System.out.println(linkedHashSet);

        // Iterate over elements
        System.out.println("Iterate over elements:");
        System.out.println("HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }
        System.out.println("LinkedHashSet:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }
    }
}
