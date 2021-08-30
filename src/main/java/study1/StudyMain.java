package study1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudyMain {

	public static void main(String[] args) {
	
		/*
		double radius=10.0;
		
		PointImpl p = new PointImpl();
		p.setXpos(3.0);
		p.setYpos(4.0);

		CircleImpl c = new CircleImpl(radius,p);
		c.display();
		
		*/
		
		Resource resource = new ClassPathResource("StudyExam.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Point point = (Point)factory.getBean("pi");
		System.out.println(point.getXpos());
		System.out.println(point.getYpos());
		
		Circle circle = (Circle)factory.getBean("ci");
		circle.display();
	}

}
