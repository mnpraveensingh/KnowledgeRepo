package singletone;

import java.lang.reflect.Constructor;

public class GetSingletonObject {

	public static void main(String[] args) {
		System.out.println(LazyInitializedSingleton.getInstance().getClass().hashCode());
		
		
		System.out.println(LazyInitializedSingleton.getInstance().getClass().hashCode());
		
		System.out.println(LazyInitializedSingleton.getSynchronizedInstance().getClass().hashCode());
		
		System.out.println(LazyInitializedSingleton.getSynchronizedInstance().getClass().hashCode());
		
		LazyInitializedSingleton instanceOne = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = LazyInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (LazyInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
	}

}

/*
 * Reflection can be used to destroy all the above singleton implementation
 * approaches. Let’s see this with an example class.
 */
