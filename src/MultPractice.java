

// Fill in you code here, and please put the below within your declared class.
// This will allow you test your code.
public class MultPractice implements StudyPractice {
    
    private int fint;
    private int sint;
    
    public MultPractice(int first, int second) {
        fint = first;
        sint = second;
    }
    
    public String getProblem() {
        return fint + " times " + sint;
    }
    
    public void nextProblem(){
        sint = sint + 1;
    }
    

  
  
  public static void main(String[] args)
  {
    StudyPractice p1 = new MultPractice(7, 3);
    System.out.println(p1.getProblem()); // 7 TIMES 3
    p1.nextProblem();
    System.out.println(p1.getProblem()); // 7 TIMES 4
    p1.nextProblem();
    System.out.println(p1.getProblem()); // 7 TIMES 5
    p1.nextProblem();
    System.out.println(p1.getProblem()); // 7 TIMES 6

    StudyPractice p2 = new MultPractice(4, 12);
    p2.nextProblem();
    System.out.println(p2.getProblem()); // 4 TIMES 13
    System.out.println(p2.getProblem()); // 4 TIMES 13
    p2.nextProblem();
    p2.nextProblem();
    System.out.println(p2.getProblem()); // 4 TIMES 15
    p2.nextProblem();
    System.out.println(p2.getProblem()); // 4 TIMES 16
  }
}

