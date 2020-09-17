package polymorphism;

public class BeanFactory {

	public TV getBean(String beanName) {
		// TODO Auto-generated method stub
		switch (beanName) {
		case "samsung":
			return new SamsungTV();
		case "lg":
			return new LgTV();
		}
		return null;
	}

}
