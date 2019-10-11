package root.p03functioninterface.p02Consumer.objXXXConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;

import root.p03functioninterface.classes.Person;

public class ObjIntConsumeraccept {

		  public static void main(String[] args) {
//		    ObjIntConsumer<String> i  = (s,d)->System.out.println(s+d);
//		    i.accept("java2s.com ",234);
				List<Person> persons = Arrays.asList(
						new Person("Ana", 26),
						new Person("Ceca", 66),
						new Person("Amir", 63),
						new Person("Bane", 27)
					);
			
			printArr(persons, (p,i)  -> p.setAge(p.getAge() + i), 
					           p  -> System.out.println(p),
					           p  -> p.getName().startsWith("A")
					);
		  }
		  static void printArr( List<Person> pers, 
				                ObjIntConsumer<Person>  oic, 
				                Consumer<Person> cp,
				                Predicate<Person>  predicate
				              )
		  {
				for (Person person : pers) {
					if(predicate.test(person)) {
						oic.accept(person, 10);
						cp.accept(person);						
					}

				}
		  }
		  

}
