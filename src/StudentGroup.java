
import java.util.Date;


/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		for(int i=0;i<students.length;i++) {
			students[i].getId();
			students[i].getFullName();
			students[i].getBirthDate();
			students[i].getAvgMark();
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
		// Add your implementation here
		
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index>=students.length||index<0) throw new IllegalArgumentException();
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException {
		// Add your implementation here
		if(student==null||index<0||index>=students.length) throw new IllegalArgumentException();
		else {
			students[index].setId(student.getId());
			students[index].setFullName(student.getFullName());
			students[index].setBirthDate(student.getBirthDate());
			students[index].setAvgMark(student.getAvgMark());
		}
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException();
		else{
			LinkedList ll = new LinkedList(Arrays.asList(students));
			ll.addFirst(student);
			ll.toArray(new Student[students.length]);
		}
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException {
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException();
		else {
			int i=students.length;
			i++;
			students[i].setId(student.getId());
			students[i].setFullName(student.getFullName());
			students[i].setAvgMark(student.getAvgMark());
			students[i].setBirthDate(student.getBirthDate());
		}
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException {
		// Add your implementation here
		if(student==null||index<0||index>=students.length) throw new IllegalArgumentException();
		else {
			LinkedList ll = new LinkedList(Arrays.asList(students));
			ll.add(index, student);
			ll.toArray(new Student[students.length]);
		}
	}

	@Override
	public void remove(int index) throws IllegalArgumentException {
		// Add your implementation here
		if(index<0||index>=students.length) throw new IllegalArgumentException();
		else {
			LinkedList ll = new LinkedList(Arrays.asList(students));
			ll.remove(index);
			ll.toArray(new Student[students.length]);
		}
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException {
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException();
		else {
			LinkedList ll = new LinkedList(Arrays.asList(students));
			ll.removeFirstOccurrence(student);
			ll.toArray(new Student[students.length]);
		}
	}

	@Override
	public void removeFromIndex(int index) throws IllegalArgumentException {
		// Add your implementation here
		if(index<0||index>=students.length) throw new IllegalArgumentException();
		else {
			LinkedList ll = new LinkedList(Arrays.asList(students));
			for(int i=index+1;i<students.length;i++) {
				ll.remove(i);
			}
			ll.toArray(new Student[students.length]);
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
