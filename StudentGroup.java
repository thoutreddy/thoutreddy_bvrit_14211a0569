import java.util.Date;
import java.util.Scanner;

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
		if(students.length>0) {
			for(int i=0;i<students.length;i++)
				return students[i];
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try {
			if(students==null)
				throw new IllegalArgumentException("threw exception");
			else {
				Scanner sc= new Scanner(System.in);
				for(int i=0;i<students.length;i++) {
					students[i].id=sc.nextInt();
					students[i].fullName=sc.next();
					students[i].birthDate=sc.next();
					students[i].avgMark=sc.NextDouble();
				}
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try {
			if(index<0||index>=students.length)
				throw new IllegalArgumentException("threw exception");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try {
			if(student==null||index<0||index>=students.length)
				throw new IllegalArgumentException("threw exception");
			else {
				students[index]=student;
				}
			}		
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try {
			if(student==null)
				throw new IllegalArgumentException("threw exception");
			else {
					students.length=students.length+1;
					int i;
					for(i=students.length-1;i>0;i--) {
						students[i]=students[i-1];
					}
					students[i]=student;

				}
			}

		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try {
			if(student==null)
				throw new IllegalArgumentException("threw exception");
			else {
					students.length=students.length+1;
					students[length-1]=student;
				}
			}

		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try {
			if(student==null||index<0||index>=students.length)
				throw new IllegalArgumentException("threw exception");
			else {
				students.length=students.length+1;
				int i;
				for(i=students.length-1;i>index;i--) {
					students[i]=students[i-1];
				}
				students[i]=student;
			}
				
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try {
			if(index<0||index>=students.length)
				throw new IllegalArgumentException("threw exception");
			else {
					int i;
					for(i=index;i<students.length;i++) {
						students[i]=students[i+1];
					}
					students.length=students.length-1;	
			}
				
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
	}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try {
			if(student==null)
				throw new IllegalArgumentException("threw exception");
			else {
				int i,c=0,j;
				for(i=0;i<students.length;i++) {
					if(students[i]==student) {
						c++;
						for(j=i;j<students.length;j++) 
							students[j]=students[j+1];
						students.length=students.length-1;
						break;
						
					}
			}
				if(c==0) {
					throw new IllegalArgumentException("Student not exist");
				}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try {
			if(index<0||index>=students.length)
				throw new IllegalArgumentException("threw exception");
			else {
				students.length=students.length-index;
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try {
			if(student==null)
				throw new IllegalArgumentException("threw exception");
			else {
				int  i;
				for(i=0;i<students.length;i++) {
					if(students[i]==student) {
						students.length=students.length-i;
						break;
					}
				}
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try {
			if(student==null)
				throw new IllegalArgumentException("threw exception");
			else {
				int k=index;
				for(int i=0;i<students.length;i++) {
					students[i]=students[index];
					index++;
				}
				students.length=students.length-k;
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		try {
			if(student==null)
				throw new IllegalArgumentException("threw exception");
			for(int i=0;i<students.length;i++) {
				if(students[i]==student) {
					int k=i;
					for(int j=0;j<students.length;j++) {
						students[j]=students[i];
						i++;
					}
					students.length=students.length-k;
				}
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int c=0,t=0;
		for(int i=0;i<students.length-1;i++) {
			for(int j=0;j<students.length-i-1;j++) {
				if(students[j].id>students[j+1].id) {
					t=students[j].id;
					students[j].id=students[j+1].id;
					students[j+1].id=t;
					c++;
				}
					
			}
			if(c==0)
				break;
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		try {
			if(date==null)
				throw new IllegalArgumentException("threw exception");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		try {
			if(firstDate==null||lastDate==null)
				throw new IllegalArgumentException("threw exception");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		try {
			if(date==null)
				throw new IllegalArgumentException("threw exception");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		try {
			if(indexOfStudent==null)
				throw new IllegalArgumentException("threw exception");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
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
		double maxavg=0.0;
		for(int i=0;i<students.length;i++) {
			if(students[i].avgMark>students[i+1].avgMark) {
				maxavg=students[i].avgMark;
				return students[i];
			}
			if(students[i].avgMark==maxavg)
				return students[i];
		}
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		try {
			if(student==null)
				throw new IllegalArgumentException("threw exception");
			else {
				int i,c=0;
				for(i=0;i<students.length;i++) {
					if(students[i]==student) 
						return student[i+1];	
				}
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught")+e.getMessage());
		}
		return null;
	}